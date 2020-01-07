/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CumulativeNormalDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CumulativeNormalDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CumulativeNormalDistribution obj) {
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
        QuantLibJNI.delete_CumulativeNormalDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CumulativeNormalDistribution(double average, double sigma) {
    this(QuantLibJNI.new_CumulativeNormalDistribution__SWIG_0(average, sigma), true);
  }

  public CumulativeNormalDistribution(double average) {
    this(QuantLibJNI.new_CumulativeNormalDistribution__SWIG_1(average), true);
  }

  public CumulativeNormalDistribution() {
    this(QuantLibJNI.new_CumulativeNormalDistribution__SWIG_2(), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.CumulativeNormalDistribution_getValue(swigCPtr, this, x);
  }

  public double derivative(double x) {
    return QuantLibJNI.CumulativeNormalDistribution_derivative(swigCPtr, this, x);
  }

}
