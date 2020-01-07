/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ImpliedTermStructure extends YieldTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ImpliedTermStructure(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ImpliedTermStructure_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImpliedTermStructure obj) {
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
        QuantLibJNI.delete_ImpliedTermStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ImpliedTermStructure(YieldTermStructureHandle curveHandle, Date referenceDate) {
    this(QuantLibJNI.new_ImpliedTermStructure(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, Date.getCPtr(referenceDate), referenceDate), true);
  }

}
