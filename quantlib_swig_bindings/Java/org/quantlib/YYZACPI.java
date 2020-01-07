/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YYZACPI extends YoYInflationIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YYZACPI(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YYZACPI_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YYZACPI obj) {
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
        QuantLibJNI.delete_YYZACPI(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YYZACPI(boolean interpolated, YoYInflationTermStructureHandle h) {
    this(QuantLibJNI.new_YYZACPI__SWIG_0(interpolated, YoYInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public YYZACPI(boolean interpolated) {
    this(QuantLibJNI.new_YYZACPI__SWIG_1(interpolated), true);
  }

}
