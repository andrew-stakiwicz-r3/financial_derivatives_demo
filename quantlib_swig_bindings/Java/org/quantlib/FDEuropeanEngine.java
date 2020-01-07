/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FDEuropeanEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FDEuropeanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FDEuropeanEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FDEuropeanEngine obj) {
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
        QuantLibJNI.delete_FDEuropeanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process, long timeSteps, long gridPoints, boolean timeDependent) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, gridPoints, timeDependent), true);
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process, long timeSteps, long gridPoints) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, gridPoints), true);
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process, long timeSteps) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps), true);
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
