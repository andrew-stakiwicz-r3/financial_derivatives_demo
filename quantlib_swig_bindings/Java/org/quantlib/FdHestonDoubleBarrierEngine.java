/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdHestonDoubleBarrierEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdHestonDoubleBarrierEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdHestonDoubleBarrierEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdHestonDoubleBarrierEngine obj) {
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
        QuantLibJNI.delete_FdHestonDoubleBarrierEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdHestonDoubleBarrierEngine(HestonModel model, long tGrid, long xGrid, long vGrid, long dampingSteps, FdmSchemeDesc schemeDesc, LocalVolTermStructure leverageFct) {
    this(QuantLibJNI.new_FdHestonDoubleBarrierEngine__SWIG_0(HestonModel.getCPtr(model), model, tGrid, xGrid, vGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, LocalVolTermStructure.getCPtr(leverageFct), leverageFct), true);
  }

  public FdHestonDoubleBarrierEngine(HestonModel model, long tGrid, long xGrid, long vGrid, long dampingSteps, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdHestonDoubleBarrierEngine__SWIG_1(HestonModel.getCPtr(model), model, tGrid, xGrid, vGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdHestonDoubleBarrierEngine(HestonModel model, long tGrid, long xGrid, long vGrid, long dampingSteps) {
    this(QuantLibJNI.new_FdHestonDoubleBarrierEngine__SWIG_2(HestonModel.getCPtr(model), model, tGrid, xGrid, vGrid, dampingSteps), true);
  }

  public FdHestonDoubleBarrierEngine(HestonModel model, long tGrid, long xGrid, long vGrid) {
    this(QuantLibJNI.new_FdHestonDoubleBarrierEngine__SWIG_3(HestonModel.getCPtr(model), model, tGrid, xGrid, vGrid), true);
  }

  public FdHestonDoubleBarrierEngine(HestonModel model, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdHestonDoubleBarrierEngine__SWIG_4(HestonModel.getCPtr(model), model, tGrid, xGrid), true);
  }

  public FdHestonDoubleBarrierEngine(HestonModel model, long tGrid) {
    this(QuantLibJNI.new_FdHestonDoubleBarrierEngine__SWIG_5(HestonModel.getCPtr(model), model, tGrid), true);
  }

  public FdHestonDoubleBarrierEngine(HestonModel model) {
    this(QuantLibJNI.new_FdHestonDoubleBarrierEngine__SWIG_6(HestonModel.getCPtr(model), model), true);
  }

}
