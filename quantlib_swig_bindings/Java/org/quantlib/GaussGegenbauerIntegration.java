/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussGegenbauerIntegration {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussGegenbauerIntegration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussGegenbauerIntegration obj) {
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
        QuantLibJNI.delete_GaussGegenbauerIntegration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussGegenbauerIntegration(long n, double lambda) {
    this(QuantLibJNI.new_GaussGegenbauerIntegration(n, lambda), true);
  }

  public double calculate(UnaryFunctionDelegate f) {
    return QuantLibJNI.GaussGegenbauerIntegration_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f);
  }

}
