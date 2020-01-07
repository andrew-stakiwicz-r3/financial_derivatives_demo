/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NumericHaganPricer extends CmsCouponPricer {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected NumericHaganPricer(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NumericHaganPricer_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NumericHaganPricer obj) {
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
        QuantLibJNI.delete_NumericHaganPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NumericHaganPricer(SwaptionVolatilityStructureHandle v, GFunctionFactory.YieldCurveModel model, QuoteHandle meanReversion, double lowerLimit, double upperLimit, double precision) {
    this(QuantLibJNI.new_NumericHaganPricer__SWIG_0(SwaptionVolatilityStructureHandle.getCPtr(v), v, model.swigValue(), QuoteHandle.getCPtr(meanReversion), meanReversion, lowerLimit, upperLimit, precision), true);
  }

  public NumericHaganPricer(SwaptionVolatilityStructureHandle v, GFunctionFactory.YieldCurveModel model, QuoteHandle meanReversion, double lowerLimit, double upperLimit) {
    this(QuantLibJNI.new_NumericHaganPricer__SWIG_1(SwaptionVolatilityStructureHandle.getCPtr(v), v, model.swigValue(), QuoteHandle.getCPtr(meanReversion), meanReversion, lowerLimit, upperLimit), true);
  }

  public NumericHaganPricer(SwaptionVolatilityStructureHandle v, GFunctionFactory.YieldCurveModel model, QuoteHandle meanReversion, double lowerLimit) {
    this(QuantLibJNI.new_NumericHaganPricer__SWIG_2(SwaptionVolatilityStructureHandle.getCPtr(v), v, model.swigValue(), QuoteHandle.getCPtr(meanReversion), meanReversion, lowerLimit), true);
  }

  public NumericHaganPricer(SwaptionVolatilityStructureHandle v, GFunctionFactory.YieldCurveModel model, QuoteHandle meanReversion) {
    this(QuantLibJNI.new_NumericHaganPricer__SWIG_3(SwaptionVolatilityStructureHandle.getCPtr(v), v, model.swigValue(), QuoteHandle.getCPtr(meanReversion), meanReversion), true);
  }

}
