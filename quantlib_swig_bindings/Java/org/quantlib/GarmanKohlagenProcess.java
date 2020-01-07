/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GarmanKohlagenProcess extends GeneralizedBlackScholesProcess {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected GarmanKohlagenProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GarmanKohlagenProcess_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GarmanKohlagenProcess obj) {
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
        QuantLibJNI.delete_GarmanKohlagenProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GarmanKohlagenProcess(QuoteHandle s0, YieldTermStructureHandle foreignRiskFreeTS, YieldTermStructureHandle domesticRiskFreeTS, BlackVolTermStructureHandle volTS) {
    this(QuantLibJNI.new_GarmanKohlagenProcess(QuoteHandle.getCPtr(s0), s0, YieldTermStructureHandle.getCPtr(foreignRiskFreeTS), foreignRiskFreeTS, YieldTermStructureHandle.getCPtr(domesticRiskFreeTS), domesticRiskFreeTS, BlackVolTermStructureHandle.getCPtr(volTS), volTS), true);
  }

}
