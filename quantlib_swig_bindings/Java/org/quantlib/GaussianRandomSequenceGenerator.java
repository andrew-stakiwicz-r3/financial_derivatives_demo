/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussianRandomSequenceGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussianRandomSequenceGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussianRandomSequenceGenerator obj) {
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
        QuantLibJNI.delete_GaussianRandomSequenceGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussianRandomSequenceGenerator(UniformRandomSequenceGenerator uniformSequenceGenerator) {
    this(QuantLibJNI.new_GaussianRandomSequenceGenerator(UniformRandomSequenceGenerator.getCPtr(uniformSequenceGenerator), uniformSequenceGenerator), true);
  }

  public SampleRealVector nextSequence() {
    return new SampleRealVector(QuantLibJNI.GaussianRandomSequenceGenerator_nextSequence(swigCPtr, this), false);
  }

  public long dimension() {
    return QuantLibJNI.GaussianRandomSequenceGenerator_dimension(swigCPtr, this);
  }

}
