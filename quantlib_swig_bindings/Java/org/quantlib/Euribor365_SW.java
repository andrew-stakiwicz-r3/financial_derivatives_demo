/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Euribor365_SW extends Euribor365 {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Euribor365_SW(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Euribor365_SW_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Euribor365_SW obj) {
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
        QuantLibJNI.delete_Euribor365_SW(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Euribor365_SW(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Euribor365_SW__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Euribor365_SW() {
    this(QuantLibJNI.new_Euribor365_SW__SWIG_1(), true);
  }

}
