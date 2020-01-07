/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MoroInvCumulativeKnuthGaussianRng {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MoroInvCumulativeKnuthGaussianRng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MoroInvCumulativeKnuthGaussianRng obj) {
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
        QuantLibJNI.delete_MoroInvCumulativeKnuthGaussianRng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MoroInvCumulativeKnuthGaussianRng(KnuthUniformRng rng) {
    this(QuantLibJNI.new_MoroInvCumulativeKnuthGaussianRng(KnuthUniformRng.getCPtr(rng), rng), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.MoroInvCumulativeKnuthGaussianRng_next(swigCPtr, this), true);
  }

}
