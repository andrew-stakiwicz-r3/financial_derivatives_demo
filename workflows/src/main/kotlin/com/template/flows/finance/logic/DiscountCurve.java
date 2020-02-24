package com.template.flows.finance.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;

import com.template.flows.finance.data.TreasuryData; 
import org.quantlib.DayCounter;
import org.quantlib.DepositRateHelper;
import org.quantlib.Calendar;
import org.quantlib.Period; 
import org.quantlib.UnitedStates;
import org.quantlib.BusinessDayConvention;
import org.quantlib.Date;
import org.quantlib.DateParser;
import org.quantlib.Settings;
import org.quantlib.QuoteHandle;
import org.quantlib.SimpleQuote;
import org.quantlib.TimeUnit; 
import org.quantlib.Actual365Fixed;
import org.quantlib.ActualActual;
import org.quantlib.RateHelperVector;
import org.quantlib.YieldTermStructure;
import org.quantlib.PiecewiseFlatForward;
import org.quantlib.RelinkableYieldTermStructureHandle;
import org.quantlib.PricingEngine;
import org.quantlib.DiscountingBondEngine;
import org.quantlib.ZeroCouponBond;



public class DiscountCurve {

        // Settings 
        Calendar usdCalendar; 
        int fixingDays; 
        int settlementdays;
        DayCounter zcBondsDayCounter;
        BusinessDayConvention bizConvention; 
        DayCounter termStructureDayCounter;
        double faceAmount;

        // Market Data 
        Date valuationDate; 
        Map<String, String> treasuryMap; 

        // Tenor Object Maps 
        LinkedHashMap <String, Period> tenorToPeriod;
        Map<String, QuoteHandle> tenorToQuoteHandle;
        Map<String, Date> tenorToDate;

        // Pricing object
        PricingEngine pricingEngine;

        public DiscountCurve() throws Exception {

                // Defaults 
                usdCalendar = new UnitedStates();
                fixingDays = 3;
                settlementdays = 3;
                faceAmount = 10.0;
                zcBondsDayCounter = new Actual365Fixed();
                bizConvention = BusinessDayConvention.ModifiedFollowing;
                termStructureDayCounter = new ActualActual(ActualActual.Convention.ISDA);

                // MARKET DATA fetch and initialize map, set valuation date            
                treasuryMap = TreasuryData.getTreasuryInfo();
                String treasuryQuoteDateString = treasuryMap.get("Date");
                System.out.println("Treasury curve for " + treasuryQuoteDateString);
                valuationDate = DateParser.parseFormatted(treasuryQuoteDateString, "%Y-%m-%d");
                Settings.instance().setEvaluationDate(valuationDate);

                // Define Periods associated with each tenor string 
                // Using a Linked HashMap to keep the tenor ordering consistent for later display
                tenorToPeriod = new LinkedHashMap<String, Period>();
                tenorToPeriod.put("1 MO", new Period(1, TimeUnit.Months)); 
                tenorToPeriod.put("2 MO", new Period(2, TimeUnit.Months)); 
                tenorToPeriod.put("3 MO", new Period(3, TimeUnit.Months)); 
                tenorToPeriod.put("6 MO", new Period(6, TimeUnit.Months)); 
                tenorToPeriod.put("1 YR", new Period(1, TimeUnit.Years)); 
                tenorToPeriod.put("2 YR", new Period(2, TimeUnit.Years));
                tenorToPeriod.put("3 YR", new Period(3, TimeUnit.Years));
                tenorToPeriod.put("5 YR", new Period(5, TimeUnit.Years)); 
                tenorToPeriod.put("7 YR", new Period(7, TimeUnit.Years)); 
                tenorToPeriod.put("10 YR", new Period(10, TimeUnit.Years)); 
                tenorToPeriod.put("20 YR", new Period(20, TimeUnit.Years));
                tenorToPeriod.put("30 YR", new Period(30, TimeUnit.Years));

                // Fetch Market Data from each tenor, parse string and scale it 
                tenorToQuoteHandle = new HashMap<String, QuoteHandle>();
                for (String tenor : tenorToPeriod.keySet()) {
                        tenorToQuoteHandle.put(tenor, 
                                new QuoteHandle(new SimpleQuote(
                                        Double.parseDouble(treasuryMap.get(tenor))/100)));
                }

                //  Looking up a date associated with each tenor 
                //  For example "3 MO" finds a date 3 months after valuation date subject to settlement terms
                tenorToDate = new HashMap<String, Date> (); 
                for (String tenor : tenorToPeriod.keySet()) {
                        tenorToDate.put(tenor, usdCalendar.advance(valuationDate, tenorToPeriod.get(tenor)));
                }

                // Create RateHelpers for each tenor
                RateHelperVector bondInstruments = new RateHelperVector(); 
                for (String tenor : tenorToPeriod.keySet()) {
                        bondInstruments.add(
                                new DepositRateHelper(
                                        tenorToQuoteHandle.get(tenor),
                                        tenorToPeriod.get(tenor),
                                        fixingDays,
                                        usdCalendar,
                                        bizConvention,
                                        true,
                                        zcBondsDayCounter)
                        );

                }     

                // Build the yield curve term structure from the above 
                YieldTermStructure bondDiscountingTermStructure = new PiecewiseFlatForward(
                        valuationDate, bondInstruments, termStructureDayCounter);
                RelinkableYieldTermStructureHandle discountingTermStructure = new RelinkableYieldTermStructureHandle();
                discountingTermStructure.linkTo(bondDiscountingTermStructure);

                // Add the yeild curve to a discouning pricing engine for later valuations
                pricingEngine = new DiscountingBondEngine(discountingTermStructure);
        }

        public Double getDiscountFactor(Date date) throws Exception{
                // These string comparisons here are a little dodgy, the source of this issue 
                // is that I'm not sure how to compare dates in quantlib using java swig and 
                // a quick google didn't find it (only C++ comparison). I would naturally make 
                // them java dates and compare but its tricky to import because I already have Quantlib Date
                if (date.ISO().compareTo(valuationDate.ISO()) == 0)
                {
                        // By construction the discount on the valuation date is 1 
                        return 1.0; 
                }
                if (date.ISO().compareTo(valuationDate.ISO()) <0)
                {
                        throw new Exception("Cannot get discount factor for cash flow prior to valuaiton date"); 
                }
                Date endDate = usdCalendar.advance(valuationDate, new Period(30, TimeUnit.Years));
                if (date.ISO().compareTo(endDate.ISO()) >=0)
                {
                        throw new Exception("Cannot get discount factor for cash flow more than 30 years in the future"); 
                }
                ZeroCouponBond zcb = new ZeroCouponBond(settlementdays, usdCalendar, faceAmount,
                        date, BusinessDayConvention.Following, faceAmount, valuationDate);
                zcb.setPricingEngine(pricingEngine);
                return zcb.NPV(); 
        }
        public Double getDiscountFactor(String isoDate) throws Exception{
                return getDiscountFactor(DateParser.parseFormatted(isoDate, "%Y-%m-%d"));
        }
        public Map<String, Double> getMapOfDiscountFactors(List<String> isoDates) throws Exception{

		Map<String, Double> retMap = new HashMap<String,Double>(); 
                for (String date : isoDates)
                { 
                        retMap.put(date, getDiscountFactor(date));
                }
                return retMap; 
        }

        public void printDirectDiscountCurve(){

                // Creating a zero coupon bond associated with each of the tenors
                Map<String, ZeroCouponBond> tenorToZcb = new HashMap<String, ZeroCouponBond> (); 
                for (String tenor : tenorToPeriod.keySet()) {
                        ZeroCouponBond zcb = new ZeroCouponBond(settlementdays, usdCalendar, faceAmount,
                                tenorToDate.get(tenor), 
                                BusinessDayConvention.Following, faceAmount, valuationDate);
                        zcb.setPricingEngine(pricingEngine);
                        tenorToZcb.put(tenor, zcb);
                }

                System.out.println("");
                System.out.println("The directly computed discount curve:");

                // output results to screen
                System.out.printf("\n%10s%20s\n", "Date           ", "Discount Factor");

                String fmt = "%10s%10s%10.8f\n";
                System.out.printf(fmt, valuationDate.ISO(), "   ", 1.0); 
                for (String tenor : tenorToPeriod.keySet()) {
                        System.out.printf(fmt, 
                                tenorToDate.get(tenor).ISO(),"   ", 
                                tenorToZcb.get(tenor).NPV()); 
                }

        }

        public void printFullInterpolatedDiscountCurve(){

                // This collection is a date for each month for the next 30 years and the potentially direct or 
                // Interpolated value.  This is to give a feel of what the curve looks like.
                // In practice the user of this class is expected to request discount values for the dates desired
                LinkedHashMap<String, ZeroCouponBond> zerosForEachMonth = new LinkedHashMap<String, ZeroCouponBond> (); 
                for (int i=1; i<=360; i++) {
                        Period nMonthsAhead = new Period(i, TimeUnit.Months);
                        Date thisDate = usdCalendar.advance(valuationDate, nMonthsAhead);
                        ZeroCouponBond zcb = new ZeroCouponBond(settlementdays, usdCalendar, faceAmount,
                                thisDate, 
                                BusinessDayConvention.Following, faceAmount, valuationDate);
                        zcb.setPricingEngine(pricingEngine);
                        zerosForEachMonth.put(thisDate.ISO(), zcb);
                }

                System.out.println("");
                System.out.println("The interpolated (monthly) discount curve:");
                System.out.printf("\n%10s%20s\n", "Date           ", "Discount Factor");
                String fmt = "%10s%10s%10.8f\n";
                System.out.printf(fmt, valuationDate.ISO(), "   ", 1.0); 
                for (String date : zerosForEachMonth.keySet()) {
                        System.out.printf(fmt, 
                                date,"   ", 
                                zerosForEachMonth.get(date).NPV()); 
                }
                System.out.println("");
                System.out.println("That was today's discount curve for US treasuries");
                System.out.println("");

        }
        public static void main(String[] args) throws Exception {

                DiscountCurve dc = new DiscountCurve(); 
                dc.printDirectDiscountCurve();
                dc.printFullInterpolatedDiscountCurve();

                List<String> isoDates= new ArrayList<String>(); 
                isoDates.add(dc.valuationDate.ISO()); 
                isoDates.add("2033-10-17"); 
                isoDates.add("2033-10-19"); 
                isoDates.add("2033-10-20"); 
                isoDates.add("2033-10-21"); 

                Map<String, Double> map = dc.getMapOfDiscountFactors(isoDates); 
                System.out.println("Adhoc date testing:");  
                for(String date : map.keySet()){
                        
                        System.out.print("Date: " + date + "    Value: " + Double.toString(map.get(date)));
                        System.out.println("");
                }
                System.out.println("");
    }
}
