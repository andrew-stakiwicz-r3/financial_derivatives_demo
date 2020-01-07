/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCPREuropeanEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCPREuropeanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCPREuropeanEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCPREuropeanEngine obj) {
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
        QuantLibJNI.delete_MCPREuropeanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean brownianBridge) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_7(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps), true);
  }

  public MCPREuropeanEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_MCPREuropeanEngine__SWIG_8(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
