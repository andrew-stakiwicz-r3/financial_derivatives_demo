/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class TreeCallableFixedRateBondEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected TreeCallableFixedRateBondEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.TreeCallableFixedRateBondEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TreeCallableFixedRateBondEngine obj) {
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
        QuantLibJNI.delete_TreeCallableFixedRateBondEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TreeCallableFixedRateBondEngine(ShortRateModel model, long timeSteps, YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_TreeCallableFixedRateBondEngine__SWIG_0(ShortRateModel.getCPtr(model), model, timeSteps, YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public TreeCallableFixedRateBondEngine(ShortRateModel model, long timeSteps) {
    this(QuantLibJNI.new_TreeCallableFixedRateBondEngine__SWIG_1(ShortRateModel.getCPtr(model), model, timeSteps), true);
  }

  public TreeCallableFixedRateBondEngine(ShortRateModel model, TimeGrid grid, YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_TreeCallableFixedRateBondEngine__SWIG_2(ShortRateModel.getCPtr(model), model, TimeGrid.getCPtr(grid), grid, YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public TreeCallableFixedRateBondEngine(ShortRateModel model, TimeGrid grid) {
    this(QuantLibJNI.new_TreeCallableFixedRateBondEngine__SWIG_3(ShortRateModel.getCPtr(model), model, TimeGrid.getCPtr(grid), grid), true);
  }

}
