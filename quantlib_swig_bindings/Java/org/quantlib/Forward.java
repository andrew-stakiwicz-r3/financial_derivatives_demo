/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Forward extends Instrument {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Forward(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Forward_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Forward obj) {
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
        QuantLibJNI.delete_Forward(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Date settlementDate() {
    return new Date(QuantLibJNI.Forward_settlementDate(swigCPtr, this), true);
  }

  public boolean isExpired() {
    return QuantLibJNI.Forward_isExpired(swigCPtr, this);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.Forward_calendar(swigCPtr, this), false);
  }

  public BusinessDayConvention businessDayConvention() {
    return BusinessDayConvention.swigToEnum(QuantLibJNI.Forward_businessDayConvention(swigCPtr, this));
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.Forward_dayCounter(swigCPtr, this), false);
  }

  public YieldTermStructureHandle discountCurve() {
    return new YieldTermStructureHandle(QuantLibJNI.Forward_discountCurve(swigCPtr, this), true);
  }

  public YieldTermStructureHandle incomeDiscountCurve() {
    return new YieldTermStructureHandle(QuantLibJNI.Forward_incomeDiscountCurve(swigCPtr, this), true);
  }

  public double spotValue() {
    return QuantLibJNI.Forward_spotValue(swigCPtr, this);
  }

  public double spotIncome(YieldTermStructureHandle incomeDiscountCurve) {
    return QuantLibJNI.Forward_spotIncome(swigCPtr, this, YieldTermStructureHandle.getCPtr(incomeDiscountCurve), incomeDiscountCurve);
  }

  public double forwardValue() {
    return QuantLibJNI.Forward_forwardValue(swigCPtr, this);
  }

  public InterestRate impliedYield(double underlyingSpotValue, double forwardValue, Date settlementDate, Compounding compoundingConvention, DayCounter dayCounter) {
    return new InterestRate(QuantLibJNI.Forward_impliedYield(swigCPtr, this, underlyingSpotValue, forwardValue, Date.getCPtr(settlementDate), settlementDate, compoundingConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

}
