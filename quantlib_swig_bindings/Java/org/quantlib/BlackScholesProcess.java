/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BlackScholesProcess extends GeneralizedBlackScholesProcess {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BlackScholesProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackScholesProcess_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackScholesProcess obj) {
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
        QuantLibJNI.delete_BlackScholesProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackScholesProcess(QuoteHandle s0, YieldTermStructureHandle riskFreeTS, BlackVolTermStructureHandle volTS) {
    this(QuantLibJNI.new_BlackScholesProcess(QuoteHandle.getCPtr(s0), s0, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, BlackVolTermStructureHandle.getCPtr(volTS), volTS), true);
  }

}