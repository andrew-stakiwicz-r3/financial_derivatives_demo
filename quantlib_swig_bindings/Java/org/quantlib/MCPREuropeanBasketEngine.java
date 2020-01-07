/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCPREuropeanBasketEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCPREuropeanBasketEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCPREuropeanBasketEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCPREuropeanBasketEngine obj) {
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
        QuantLibJNI.delete_MCPREuropeanBasketEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_0(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_1(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_2(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_3(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_4(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear, boolean brownianBridge) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_5(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_6(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process, int timeSteps) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_7(StochasticProcessArray.getCPtr(process), process, timeSteps), true);
  }

  public MCPREuropeanBasketEngine(StochasticProcessArray process) {
    this(QuantLibJNI.new_MCPREuropeanBasketEngine__SWIG_8(StochasticProcessArray.getCPtr(process), process), true);
  }

}
