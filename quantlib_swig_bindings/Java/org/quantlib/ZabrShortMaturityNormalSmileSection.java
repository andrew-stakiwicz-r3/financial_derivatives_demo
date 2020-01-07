/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZabrShortMaturityNormalSmileSection extends SmileSection {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ZabrShortMaturityNormalSmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZabrShortMaturityNormalSmileSection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZabrShortMaturityNormalSmileSection obj) {
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
        QuantLibJNI.delete_ZabrShortMaturityNormalSmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZabrShortMaturityNormalSmileSection(double timeToExpiry, double forward, DoubleVector zabrParameters, DoubleVector moneyness, long fdRefinement) {
    this(QuantLibJNI.new_ZabrShortMaturityNormalSmileSection__SWIG_0(timeToExpiry, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DoubleVector.getCPtr(moneyness), moneyness, fdRefinement), true);
  }

  public ZabrShortMaturityNormalSmileSection(double timeToExpiry, double forward, DoubleVector zabrParameters, DoubleVector moneyness) {
    this(QuantLibJNI.new_ZabrShortMaturityNormalSmileSection__SWIG_1(timeToExpiry, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DoubleVector.getCPtr(moneyness), moneyness), true);
  }

  public ZabrShortMaturityNormalSmileSection(double timeToExpiry, double forward, DoubleVector zabrParameters) {
    this(QuantLibJNI.new_ZabrShortMaturityNormalSmileSection__SWIG_2(timeToExpiry, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters), true);
  }

  public ZabrShortMaturityNormalSmileSection(Date d, double forward, DoubleVector zabrParameters, DayCounter dc, DoubleVector moneyness, long fdRefinement) {
    this(QuantLibJNI.new_ZabrShortMaturityNormalSmileSection__SWIG_3(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DayCounter.getCPtr(dc), dc, DoubleVector.getCPtr(moneyness), moneyness, fdRefinement), true);
  }

  public ZabrShortMaturityNormalSmileSection(Date d, double forward, DoubleVector zabrParameters, DayCounter dc, DoubleVector moneyness) {
    this(QuantLibJNI.new_ZabrShortMaturityNormalSmileSection__SWIG_4(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DayCounter.getCPtr(dc), dc, DoubleVector.getCPtr(moneyness), moneyness), true);
  }

  public ZabrShortMaturityNormalSmileSection(Date d, double forward, DoubleVector zabrParameters, DayCounter dc) {
    this(QuantLibJNI.new_ZabrShortMaturityNormalSmileSection__SWIG_5(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DayCounter.getCPtr(dc), dc), true);
  }

  public ZabrShortMaturityNormalSmileSection(Date d, double forward, DoubleVector zabrParameters) {
    this(QuantLibJNI.new_ZabrShortMaturityNormalSmileSection__SWIG_6(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters), true);
  }

}
