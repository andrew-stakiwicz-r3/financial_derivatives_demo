/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class IborCoupon extends FloatingRateCoupon {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected IborCoupon(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.IborCoupon_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IborCoupon obj) {
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
        QuantLibJNI.delete_IborCoupon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IborCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, IborIndex index, double gearing, double spread, Date refPeriodStart, Date refPeriodEnd, DayCounter dayCounter) {
    this(QuantLibJNI.new_IborCoupon__SWIG_0(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, IborIndex.getCPtr(index), index, gearing, spread, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public IborCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, IborIndex index, double gearing, double spread, Date refPeriodStart, Date refPeriodEnd) {
    this(QuantLibJNI.new_IborCoupon__SWIG_1(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, IborIndex.getCPtr(index), index, gearing, spread, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd), true);
  }

  public IborCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, IborIndex index, double gearing, double spread, Date refPeriodStart) {
    this(QuantLibJNI.new_IborCoupon__SWIG_2(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, IborIndex.getCPtr(index), index, gearing, spread, Date.getCPtr(refPeriodStart), refPeriodStart), true);
  }

  public IborCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, IborIndex index, double gearing, double spread) {
    this(QuantLibJNI.new_IborCoupon__SWIG_3(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, IborIndex.getCPtr(index), index, gearing, spread), true);
  }

  public IborCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, IborIndex index, double gearing) {
    this(QuantLibJNI.new_IborCoupon__SWIG_4(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, IborIndex.getCPtr(index), index, gearing), true);
  }

  public IborCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, IborIndex index) {
    this(QuantLibJNI.new_IborCoupon__SWIG_5(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, IborIndex.getCPtr(index), index), true);
  }

}