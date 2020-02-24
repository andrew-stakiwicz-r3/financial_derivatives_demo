package com.template.logic

import com.template.flows.TreasuryData
import org.quantlib.Actual365Fixed
import org.quantlib.ActualActual
import org.quantlib.BusinessDayConvention
import org.quantlib.Calendar
import org.quantlib.Date
import org.quantlib.DateParser
import org.quantlib.DayCounter
import org.quantlib.DepositRateHelper
import org.quantlib.DiscountingBondEngine
import org.quantlib.Period
import org.quantlib.PiecewiseFlatForward
import org.quantlib.PricingEngine
import org.quantlib.QuoteHandle
import org.quantlib.RateHelperVector
import org.quantlib.RelinkableYieldTermStructureHandle
import org.quantlib.Settings
import org.quantlib.SimpleQuote
import org.quantlib.TimeUnit
import org.quantlib.UnitedStates
import org.quantlib.YieldTermStructure
import org.quantlib.ZeroCouponBond
import java.util.*

class DiscountCurve {
    // Settings
    var usdCalendar: Calendar
    var fixingDays: Int
    var settlementdays: Long
    var zcBondsDayCounter: DayCounter
    var bizConvention: BusinessDayConvention
    var termStructureDayCounter: DayCounter
    var faceAmount: Double
    // Market Data
    var valuationDate: Date
    var treasuryMap: MutableMap<String, String>?
    // Tenor Object Maps
    var tenorToPeriod: LinkedHashMap<String, Period>
    var tenorToQuoteHandle: MutableMap<String, QuoteHandle>
    var tenorToDate: MutableMap<String, Date>
    // Pricing object
    var pricingEngine: PricingEngine

    @Throws(Exception::class)
    fun getDiscountFactor(date: Date): Double { // These string comparisons here are a little dodgy, the source of this issue
// is that I'm not sure how to compare dates in quantlib using java swig and
// a quick google didn't find it (only C++ comparison). I would naturally make
// them java dates and compare but its tricky to import because I already have Quantlib Date
        if (date.ISO().compareTo(valuationDate.ISO()) === 0) { // By construction the discount on the valuation date is 1
            return 1.0
        }
        if (date.ISO().compareTo(valuationDate.ISO()) < 0) {
            throw Exception("Cannot get discount factor for cash flow prior to valuaiton date")
        }
        val endDate: Date = usdCalendar.advance(valuationDate, Period(30, TimeUnit.Years))
        if (date.ISO().compareTo(endDate.ISO()) >= 0) {
            throw Exception("Cannot get discount factor for cash flow more than 30 years in the future")
        }
        val zcb = ZeroCouponBond(settlementdays, usdCalendar, faceAmount,
                date, BusinessDayConvention.Following, faceAmount, valuationDate)
        zcb.setPricingEngine(pricingEngine)
        return zcb.NPV()
    }

    @Throws(Exception::class)
    fun getDiscountFactor(isoDate: String?): Double {
        return getDiscountFactor(DateParser.parseFormatted(isoDate, "%Y-%m-%d"))
    }

    @Throws(Exception::class)
    fun getMapOfDiscountFactors(isoDates: List<String>): Map<String, Double> {
        val retMap: MutableMap<String, Double> = HashMap()
        for (date in isoDates) {
            retMap[date] = getDiscountFactor(date)
        }
        return retMap
    }

    fun printDirectDiscountCurve() { // Creating a zero coupon bond associated with each of the tenors
        val tenorToZcb: MutableMap<String, ZeroCouponBond> = HashMap<String, ZeroCouponBond>()
        for (tenor in tenorToPeriod.keys) {
            val zcb = ZeroCouponBond(settlementdays, usdCalendar, faceAmount,
                    tenorToDate[tenor],
                    BusinessDayConvention.Following, faceAmount, valuationDate)
            zcb.setPricingEngine(pricingEngine)
            tenorToZcb[tenor] = zcb
        }
        println("")
        println("The directly computed discount curve:")
        // output results to screen
        System.out.printf("\n%10s%20s\n", "Date           ", "Discount Factor")
        val fmt = "%10s%10s%10.8f\n"
        System.out.printf(fmt, valuationDate.ISO(), "   ", 1.0)
        for (tenor in tenorToPeriod.keys) {
            System.out.printf(fmt,
                    tenorToDate[tenor]!!.ISO(), "   ",
                    tenorToZcb[tenor]!!.NPV())
        }
    }

    fun printFullInterpolatedDiscountCurve() {
        // This collection is a date for each month for the next 30 years and the potentially direct or
        // Interpolated value.  This is to give a feel of what the curve looks like.
        // In practice the user of this class is expected to request discount values for the dates desired
        val zerosForEachMonth: LinkedHashMap<String, ZeroCouponBond> = LinkedHashMap<String, ZeroCouponBond>()
        for (i in 1..360) {
            val nMonthsAhead = Period(i, TimeUnit.Months)
            val thisDate: Date = usdCalendar.advance(valuationDate, nMonthsAhead)
            val zcb = ZeroCouponBond(settlementdays, usdCalendar, faceAmount,
                    thisDate,
                    BusinessDayConvention.Following, faceAmount, valuationDate)
            zcb.setPricingEngine(pricingEngine)
            zerosForEachMonth[thisDate.ISO()] = zcb
        }
        println("")
        println("The interpolated (monthly) discount curve:")
        System.out.printf("\n%10s%20s\n", "Date           ", "Discount Factor")
        val fmt = "%10s%10s%10.8f\n"
        System.out.printf(fmt, valuationDate.ISO(), "   ", 1.0)
        for (date in zerosForEachMonth.keys) {
            System.out.printf(fmt,
                    date, "   ",
                    zerosForEachMonth[date]!!.NPV())
        }
        println("")
        println("That was today's discount curve for US treasuries")
        println("")
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val dc = DiscountCurve()
            dc.printDirectDiscountCurve()
            dc.printFullInterpolatedDiscountCurve()
            val isoDates: MutableList<String> = ArrayList()
            isoDates.add(dc.valuationDate.ISO())
            isoDates.add("2033-10-17")
            isoDates.add("2033-10-19")
            isoDates.add("2033-10-20")
            isoDates.add("2033-10-21")
            val map = dc.getMapOfDiscountFactors(isoDates)
            println("Adhoc date testing:")
            for (date in map.keys) {
                print("Date: " + date + "    Value: " + java.lang.Double.toString(map[date]!!))
                println("")
            }
            println("")
        }
    }

    init { // Defaults
        usdCalendar = UnitedStates()
        fixingDays = 3
        settlementdays = 3
        faceAmount = 10.0
        zcBondsDayCounter = Actual365Fixed()
        bizConvention = BusinessDayConvention.ModifiedFollowing
        termStructureDayCounter = ActualActual(ActualActual.Convention.ISDA)
        // MARKET DATA fetch and initialize map, set valuation date
        treasuryMap = TreasuryData.treasuryInfo
        val treasuryQuoteDateString = treasuryMap!!["Date"]
        println("Treasury curve for $treasuryQuoteDateString")
        valuationDate = DateParser.parseFormatted(treasuryQuoteDateString, "%Y-%m-%d")
        Settings.instance().setEvaluationDate(valuationDate)
        // Define Periods associated with each tenor string
// Using a Linked HashMap to keep the tenor ordering consistent for later display
        tenorToPeriod = LinkedHashMap<String, Period>()
        tenorToPeriod["1 MO"] = Period(1, TimeUnit.Months)
        tenorToPeriod["2 MO"] = Period(2, TimeUnit.Months)
        tenorToPeriod["3 MO"] = Period(3, TimeUnit.Months)
        tenorToPeriod["6 MO"] = Period(6, TimeUnit.Months)
        tenorToPeriod["1 YR"] = Period(1, TimeUnit.Years)
        tenorToPeriod["2 YR"] = Period(2, TimeUnit.Years)
        tenorToPeriod["3 YR"] = Period(3, TimeUnit.Years)
        tenorToPeriod["5 YR"] = Period(5, TimeUnit.Years)
        tenorToPeriod["7 YR"] = Period(7, TimeUnit.Years)
        tenorToPeriod["10 YR"] = Period(10, TimeUnit.Years)
        tenorToPeriod["20 YR"] = Period(20, TimeUnit.Years)
        tenorToPeriod["30 YR"] = Period(30, TimeUnit.Years)
        // Fetch Market Data from each tenor, parse string and scale it
        tenorToQuoteHandle = HashMap<String, QuoteHandle>()
        for (tenor in tenorToPeriod.keys) {
            tenorToQuoteHandle[tenor] = QuoteHandle(SimpleQuote(
                    treasuryMap!![tenor]!!.toDouble() / 100))
        }
        //  Looking up a date associated with each tenor
//  For example "3 MO" finds a date 3 months after valuation date subject to settlement terms
        tenorToDate = HashMap<String, Date>()
        for (tenor in tenorToPeriod.keys) {
            tenorToDate[tenor] = usdCalendar.advance(valuationDate, tenorToPeriod[tenor])
        }
        // Create RateHelpers for each tenor
        val bondInstruments = RateHelperVector()
        for (tenor in tenorToPeriod.keys) {
            bondInstruments.add(DepositRateHelper(
                    tenorToQuoteHandle[tenor],
                    tenorToPeriod[tenor],
                    3, usdCalendar, bizConvention, true, zcBondsDayCounter))
        }
        // Build the yield curve term structure from the above
        val bondDiscountingTermStructure: YieldTermStructure = PiecewiseFlatForward(
                valuationDate, bondInstruments, termStructureDayCounter)
        val discountingTermStructure = RelinkableYieldTermStructureHandle()
        discountingTermStructure.linkTo(bondDiscountingTermStructure)
        // Add the yeild curve to a discouning pricing engine for later valuations
        pricingEngine = DiscountingBondEngine(discountingTermStructure)
    }
}