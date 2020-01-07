/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableCalibratedModelHandle extends CalibratedModelHandle {
  private transient long swigCPtr;

  protected RelinkableCalibratedModelHandle(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableCalibratedModelHandle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableCalibratedModelHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableCalibratedModelHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableCalibratedModelHandle(CalibratedModel arg0) {
    this(QuantLibJNI.new_RelinkableCalibratedModelHandle__SWIG_0(CalibratedModel.getCPtr(arg0), arg0), true);
  }

  public RelinkableCalibratedModelHandle() {
    this(QuantLibJNI.new_RelinkableCalibratedModelHandle__SWIG_1(), true);
  }

  public void linkTo(CalibratedModel arg0) {
    QuantLibJNI.RelinkableCalibratedModelHandle_linkTo(swigCPtr, this, CalibratedModel.getCPtr(arg0), arg0);
  }

  public void reset() {
    QuantLibJNI.RelinkableCalibratedModelHandle_reset(swigCPtr, this);
  }

}
