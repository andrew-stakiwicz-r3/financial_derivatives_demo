/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCPREuropeanHestonEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCPREuropeanHestonEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCPREuropeanHestonEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCPREuropeanHestonEngine obj) {
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
        QuantLibJNI.delete_MCPREuropeanHestonEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCPREuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_0(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCPREuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_1(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCPREuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_2(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCPREuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_3(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples), true);
  }

  public MCPREuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_4(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate), true);
  }

  public MCPREuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_5(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCPREuropeanHestonEngine(HestonProcess process, int timeSteps) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_6(HestonProcess.getCPtr(process), process, timeSteps), true);
  }

  public MCPREuropeanHestonEngine(HestonProcess process) {
    this(QuantLibJNI.new_MCPREuropeanHestonEngine__SWIG_7(HestonProcess.getCPtr(process), process), true);
  }

}
