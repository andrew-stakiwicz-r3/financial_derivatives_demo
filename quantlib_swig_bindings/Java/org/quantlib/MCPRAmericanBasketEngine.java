/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCPRAmericanBasketEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCPRAmericanBasketEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCPRAmericanBasketEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCPRAmericanBasketEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_MCPRAmericanBasketEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, long nCalibrationSamples, long polynomOrder, LsmBasisSystem.PolynomType polynomType) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_0(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed, nCalibrationSamples, polynomOrder, polynomType.swigValue()), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, long nCalibrationSamples, long polynomOrder) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_1(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed, nCalibrationSamples, polynomOrder), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, long nCalibrationSamples) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_2(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed, nCalibrationSamples), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_3(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_4(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_5(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_6(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_7(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_8(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_9(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process, int timeSteps) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_10(StochasticProcessArray.getCPtr(process), process, timeSteps), true);
  }

  public MCPRAmericanBasketEngine(StochasticProcessArray process) {
    this(QuantLibJNI.new_MCPRAmericanBasketEngine__SWIG_11(StochasticProcessArray.getCPtr(process), process), true);
  }

}
