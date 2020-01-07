/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EURLibor5M extends EURLibor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected EURLibor5M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EURLibor5M_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EURLibor5M obj) {
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
        QuantLibJNI.delete_EURLibor5M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EURLibor5M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_EURLibor5M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public EURLibor5M() {
    this(QuantLibJNI.new_EURLibor5M__SWIG_1(), true);
  }

}
