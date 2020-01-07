/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class LogLinearInterpolation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LogLinearInterpolation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LogLinearInterpolation obj) {
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
        QuantLibJNI.delete_LogLinearInterpolation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LogLinearInterpolation(Array x, Array y) {
    this(QuantLibJNI.new_LogLinearInterpolation(Array.getCPtr(x), x, Array.getCPtr(y), y), true);
  }

  public double getValue(double x, boolean allowExtrapolation) {
    return QuantLibJNI.LogLinearInterpolation_getValue__SWIG_0(swigCPtr, this, x, allowExtrapolation);
  }

  public double getValue(double x) {
    return QuantLibJNI.LogLinearInterpolation_getValue__SWIG_1(swigCPtr, this, x);
  }

}
