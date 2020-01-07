/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CumulativePoissonDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CumulativePoissonDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CumulativePoissonDistribution obj) {
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
        QuantLibJNI.delete_CumulativePoissonDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CumulativePoissonDistribution(double mu) {
    this(QuantLibJNI.new_CumulativePoissonDistribution(mu), true);
  }

  public double getValue(long k) {
    return QuantLibJNI.CumulativePoissonDistribution_getValue(swigCPtr, this, k);
  }

}
