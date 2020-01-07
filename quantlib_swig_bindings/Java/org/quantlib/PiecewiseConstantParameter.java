/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PiecewiseConstantParameter extends Parameter {
  private transient long swigCPtr;

  protected PiecewiseConstantParameter(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PiecewiseConstantParameter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PiecewiseConstantParameter obj) {
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
        QuantLibJNI.delete_PiecewiseConstantParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PiecewiseConstantParameter(DoubleVector times, Constraint constraint) {
    this(QuantLibJNI.new_PiecewiseConstantParameter__SWIG_0(DoubleVector.getCPtr(times), times, Constraint.getCPtr(constraint), constraint), true);
  }

  public PiecewiseConstantParameter(DoubleVector times) {
    this(QuantLibJNI.new_PiecewiseConstantParameter__SWIG_1(DoubleVector.getCPtr(times), times), true);
  }

}
