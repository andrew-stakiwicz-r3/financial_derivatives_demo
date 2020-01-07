/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Fd2dBlackScholesVanillaEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Fd2dBlackScholesVanillaEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Fd2dBlackScholesVanillaEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Fd2dBlackScholesVanillaEngine obj) {
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
        QuantLibJNI.delete_Fd2dBlackScholesVanillaEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, long xGrid, long yGrid, long tGrid, long dampingSteps, FdmSchemeDesc schemeDesc, boolean localVol, double illegalLocalVolOverwrite) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, xGrid, yGrid, tGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, localVol, illegalLocalVolOverwrite), true);
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, long xGrid, long yGrid, long tGrid, long dampingSteps, FdmSchemeDesc schemeDesc, boolean localVol) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, xGrid, yGrid, tGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, localVol), true);
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, long xGrid, long yGrid, long tGrid, long dampingSteps, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, xGrid, yGrid, tGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, long xGrid, long yGrid, long tGrid, long dampingSteps) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, xGrid, yGrid, tGrid, dampingSteps), true);
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, long xGrid, long yGrid, long tGrid) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, xGrid, yGrid, tGrid), true);
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, long xGrid, long yGrid) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, xGrid, yGrid), true);
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, long xGrid) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, xGrid), true);
  }

  public Fd2dBlackScholesVanillaEngine(GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation) {
    this(QuantLibJNI.new_Fd2dBlackScholesVanillaEngine__SWIG_7(GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation), true);
  }

}
