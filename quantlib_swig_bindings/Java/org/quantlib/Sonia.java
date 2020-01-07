/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Sonia extends OvernightIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Sonia(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Sonia_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Sonia obj) {
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
        QuantLibJNI.delete_Sonia(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Sonia(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Sonia__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Sonia() {
    this(QuantLibJNI.new_Sonia__SWIG_1(), true);
  }

}
