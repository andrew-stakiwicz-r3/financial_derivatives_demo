/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdBlackScholesVanillaEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdBlackScholesVanillaEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdBlackScholesVanillaEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdBlackScholesVanillaEngine obj) {
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
        QuantLibJNI.delete_FdBlackScholesVanillaEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdBlackScholesVanillaEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps, FdmSchemeDesc schemeDesc, boolean localVol, double illegalLocalVolOverwrite) {
    this(QuantLibJNI.new_FdBlackScholesVanillaEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, localVol, illegalLocalVolOverwrite), true);
  }

  public FdBlackScholesVanillaEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps, FdmSchemeDesc schemeDesc, boolean localVol) {
    this(QuantLibJNI.new_FdBlackScholesVanillaEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, localVol), true);
  }

  public FdBlackScholesVanillaEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdBlackScholesVanillaEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdBlackScholesVanillaEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps) {
    this(QuantLibJNI.new_FdBlackScholesVanillaEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps), true);
  }

  public FdBlackScholesVanillaEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdBlackScholesVanillaEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid), true);
  }

  public FdBlackScholesVanillaEngine(GeneralizedBlackScholesProcess process, long tGrid) {
    this(QuantLibJNI.new_FdBlackScholesVanillaEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid), true);
  }

  public FdBlackScholesVanillaEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_FdBlackScholesVanillaEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}