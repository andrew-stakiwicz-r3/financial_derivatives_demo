/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SpreadCdsHelper extends DefaultProbabilityHelper {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SpreadCdsHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SpreadCdsHelper_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpreadCdsHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_SpreadCdsHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SpreadCdsHelper(QuoteHandle spread, Period tenor, int settlementDays, Calendar calendar, Frequency frequency, BusinessDayConvention convention, DateGeneration.Rule rule, DayCounter dayCounter, double recoveryRate, YieldTermStructureHandle discountCurve, boolean settlesAccrual, boolean paysAtDefaultTime) {
    this(QuantLibJNI.new_SpreadCdsHelper__SWIG_0(QuoteHandle.getCPtr(spread), spread, Period.getCPtr(tenor), tenor, settlementDays, Calendar.getCPtr(calendar), calendar, frequency.swigValue(), convention.swigValue(), rule.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, settlesAccrual, paysAtDefaultTime), true);
  }

  public SpreadCdsHelper(QuoteHandle spread, Period tenor, int settlementDays, Calendar calendar, Frequency frequency, BusinessDayConvention convention, DateGeneration.Rule rule, DayCounter dayCounter, double recoveryRate, YieldTermStructureHandle discountCurve, boolean settlesAccrual) {
    this(QuantLibJNI.new_SpreadCdsHelper__SWIG_1(QuoteHandle.getCPtr(spread), spread, Period.getCPtr(tenor), tenor, settlementDays, Calendar.getCPtr(calendar), calendar, frequency.swigValue(), convention.swigValue(), rule.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, settlesAccrual), true);
  }

  public SpreadCdsHelper(QuoteHandle spread, Period tenor, int settlementDays, Calendar calendar, Frequency frequency, BusinessDayConvention convention, DateGeneration.Rule rule, DayCounter dayCounter, double recoveryRate, YieldTermStructureHandle discountCurve) {
    this(QuantLibJNI.new_SpreadCdsHelper__SWIG_2(QuoteHandle.getCPtr(spread), spread, Period.getCPtr(tenor), tenor, settlementDays, Calendar.getCPtr(calendar), calendar, frequency.swigValue(), convention.swigValue(), rule.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve), true);
  }

  public SpreadCdsHelper(double spread, Period tenor, int settlementDays, Calendar calendar, Frequency frequency, BusinessDayConvention convention, DateGeneration.Rule rule, DayCounter dayCounter, double recoveryRate, YieldTermStructureHandle discountCurve, boolean settlesAccrual, boolean paysAtDefaultTime) {
    this(QuantLibJNI.new_SpreadCdsHelper__SWIG_3(spread, Period.getCPtr(tenor), tenor, settlementDays, Calendar.getCPtr(calendar), calendar, frequency.swigValue(), convention.swigValue(), rule.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, settlesAccrual, paysAtDefaultTime), true);
  }

  public SpreadCdsHelper(double spread, Period tenor, int settlementDays, Calendar calendar, Frequency frequency, BusinessDayConvention convention, DateGeneration.Rule rule, DayCounter dayCounter, double recoveryRate, YieldTermStructureHandle discountCurve, boolean settlesAccrual) {
    this(QuantLibJNI.new_SpreadCdsHelper__SWIG_4(spread, Period.getCPtr(tenor), tenor, settlementDays, Calendar.getCPtr(calendar), calendar, frequency.swigValue(), convention.swigValue(), rule.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, settlesAccrual), true);
  }

  public SpreadCdsHelper(double spread, Period tenor, int settlementDays, Calendar calendar, Frequency frequency, BusinessDayConvention convention, DateGeneration.Rule rule, DayCounter dayCounter, double recoveryRate, YieldTermStructureHandle discountCurve) {
    this(QuantLibJNI.new_SpreadCdsHelper__SWIG_5(spread, Period.getCPtr(tenor), tenor, settlementDays, Calendar.getCPtr(calendar), calendar, frequency.swigValue(), convention.swigValue(), rule.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve), true);
  }

}
