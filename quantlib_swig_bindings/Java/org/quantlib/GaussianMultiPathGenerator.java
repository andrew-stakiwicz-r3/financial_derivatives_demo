/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussianMultiPathGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussianMultiPathGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussianMultiPathGenerator obj) {
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
        QuantLibJNI.delete_GaussianMultiPathGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussianMultiPathGenerator(StochasticProcess process, DoubleVector times, GaussianRandomSequenceGenerator generator, boolean brownianBridge) {
    this(QuantLibJNI.new_GaussianMultiPathGenerator__SWIG_0(StochasticProcess.getCPtr(process), process, DoubleVector.getCPtr(times), times, GaussianRandomSequenceGenerator.getCPtr(generator), generator, brownianBridge), true);
  }

  public GaussianMultiPathGenerator(StochasticProcess process, DoubleVector times, GaussianRandomSequenceGenerator generator) {
    this(QuantLibJNI.new_GaussianMultiPathGenerator__SWIG_1(StochasticProcess.getCPtr(process), process, DoubleVector.getCPtr(times), times, GaussianRandomSequenceGenerator.getCPtr(generator), generator), true);
  }

  public SampleMultiPath next() {
    return new SampleMultiPath(QuantLibJNI.GaussianMultiPathGenerator_next(swigCPtr, this), true);
  }

  public SampleMultiPath antithetic() {
    return new SampleMultiPath(QuantLibJNI.GaussianMultiPathGenerator_antithetic(swigCPtr, this), true);
  }

}