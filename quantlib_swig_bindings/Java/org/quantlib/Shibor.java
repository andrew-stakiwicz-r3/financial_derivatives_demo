/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Shibor extends IborIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Shibor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Shibor_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Shibor obj) {
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
        QuantLibJNI.delete_Shibor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Shibor(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Shibor__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Shibor(Period tenor) {
    this(QuantLibJNI.new_Shibor__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

}