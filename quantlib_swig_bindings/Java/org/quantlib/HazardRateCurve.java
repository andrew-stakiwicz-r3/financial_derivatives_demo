/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class HazardRateCurve extends DefaultProbabilityTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected HazardRateCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.HazardRateCurve_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HazardRateCurve obj) {
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
        QuantLibJNI.delete_HazardRateCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HazardRateCurve(DateVector dates, DoubleVector hazardRates, DayCounter dayCounter, Calendar calendar, BackwardFlat i) {
    this(QuantLibJNI.new_HazardRateCurve__SWIG_0(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(hazardRates), hazardRates, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, BackwardFlat.getCPtr(i), i), true);
  }

  public HazardRateCurve(DateVector dates, DoubleVector hazardRates, DayCounter dayCounter, Calendar calendar) {
    this(QuantLibJNI.new_HazardRateCurve__SWIG_1(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(hazardRates), hazardRates, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar), true);
  }

  public HazardRateCurve(DateVector dates, DoubleVector hazardRates, DayCounter dayCounter) {
    this(QuantLibJNI.new_HazardRateCurve__SWIG_2(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(hazardRates), hazardRates, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.HazardRateCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector hazardRates() {
    return new DoubleVector(QuantLibJNI.HazardRateCurve_hazardRates(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.HazardRateCurve_nodes(swigCPtr, this), true);
  }

}
