/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CumulativeGammaDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CumulativeGammaDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CumulativeGammaDistribution obj) {
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
        QuantLibJNI.delete_CumulativeGammaDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CumulativeGammaDistribution(double a) {
    this(QuantLibJNI.new_CumulativeGammaDistribution(a), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.CumulativeGammaDistribution_getValue(swigCPtr, this, x);
  }

}