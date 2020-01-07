/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdBatesVanillaEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdBatesVanillaEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdBatesVanillaEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdBatesVanillaEngine obj) {
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
        QuantLibJNI.delete_FdBatesVanillaEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdBatesVanillaEngine(BatesModel model, long tGrid, long xGrid, long vGrid, long dampingSteps, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdBatesVanillaEngine__SWIG_0(BatesModel.getCPtr(model), model, tGrid, xGrid, vGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdBatesVanillaEngine(BatesModel model, long tGrid, long xGrid, long vGrid, long dampingSteps) {
    this(QuantLibJNI.new_FdBatesVanillaEngine__SWIG_1(BatesModel.getCPtr(model), model, tGrid, xGrid, vGrid, dampingSteps), true);
  }

  public FdBatesVanillaEngine(BatesModel model, long tGrid, long xGrid, long vGrid) {
    this(QuantLibJNI.new_FdBatesVanillaEngine__SWIG_2(BatesModel.getCPtr(model), model, tGrid, xGrid, vGrid), true);
  }

  public FdBatesVanillaEngine(BatesModel model, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdBatesVanillaEngine__SWIG_3(BatesModel.getCPtr(model), model, tGrid, xGrid), true);
  }

  public FdBatesVanillaEngine(BatesModel model, long tGrid) {
    this(QuantLibJNI.new_FdBatesVanillaEngine__SWIG_4(BatesModel.getCPtr(model), model, tGrid), true);
  }

  public FdBatesVanillaEngine(BatesModel model) {
    this(QuantLibJNI.new_FdBatesVanillaEngine__SWIG_5(BatesModel.getCPtr(model), model), true);
  }

}
