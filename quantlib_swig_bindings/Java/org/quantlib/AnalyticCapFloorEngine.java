/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AnalyticCapFloorEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AnalyticCapFloorEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AnalyticCapFloorEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnalyticCapFloorEngine obj) {
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
        QuantLibJNI.delete_AnalyticCapFloorEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AnalyticCapFloorEngine(OneFactorAffineModel model, YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_AnalyticCapFloorEngine__SWIG_0(OneFactorAffineModel.getCPtr(model), model, YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public AnalyticCapFloorEngine(OneFactorAffineModel model) {
    this(QuantLibJNI.new_AnalyticCapFloorEngine__SWIG_1(OneFactorAffineModel.getCPtr(model), model), true);
  }

}
