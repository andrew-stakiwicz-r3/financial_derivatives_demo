/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CdsOption extends Option {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CdsOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CdsOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CdsOption obj) {
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
        QuantLibJNI.delete_CdsOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CdsOption(CreditDefaultSwap swap, Exercise exercise, boolean knocksOut) {
    this(QuantLibJNI.new_CdsOption__SWIG_0(CreditDefaultSwap.getCPtr(swap), swap, Exercise.getCPtr(exercise), exercise, knocksOut), true);
  }

  public CdsOption(CreditDefaultSwap swap, Exercise exercise) {
    this(QuantLibJNI.new_CdsOption__SWIG_1(CreditDefaultSwap.getCPtr(swap), swap, Exercise.getCPtr(exercise), exercise), true);
  }

  public double atmRate() {
    return QuantLibJNI.CdsOption_atmRate(swigCPtr, this);
  }

  public double riskyAnnuity() {
    return QuantLibJNI.CdsOption_riskyAnnuity(swigCPtr, this);
  }

  public double impliedVolatility(double price, YieldTermStructureHandle termStructure, DefaultProbabilityTermStructureHandle arg2, double recoveryRate, double accuracy, long maxEvaluations, double minVol, double maxVol) {
    return QuantLibJNI.CdsOption_impliedVolatility__SWIG_0(swigCPtr, this, price, YieldTermStructureHandle.getCPtr(termStructure), termStructure, DefaultProbabilityTermStructureHandle.getCPtr(arg2), arg2, recoveryRate, accuracy, maxEvaluations, minVol, maxVol);
  }

  public double impliedVolatility(double price, YieldTermStructureHandle termStructure, DefaultProbabilityTermStructureHandle arg2, double recoveryRate, double accuracy, long maxEvaluations, double minVol) {
    return QuantLibJNI.CdsOption_impliedVolatility__SWIG_1(swigCPtr, this, price, YieldTermStructureHandle.getCPtr(termStructure), termStructure, DefaultProbabilityTermStructureHandle.getCPtr(arg2), arg2, recoveryRate, accuracy, maxEvaluations, minVol);
  }

  public double impliedVolatility(double price, YieldTermStructureHandle termStructure, DefaultProbabilityTermStructureHandle arg2, double recoveryRate, double accuracy, long maxEvaluations) {
    return QuantLibJNI.CdsOption_impliedVolatility__SWIG_2(swigCPtr, this, price, YieldTermStructureHandle.getCPtr(termStructure), termStructure, DefaultProbabilityTermStructureHandle.getCPtr(arg2), arg2, recoveryRate, accuracy, maxEvaluations);
  }

  public double impliedVolatility(double price, YieldTermStructureHandle termStructure, DefaultProbabilityTermStructureHandle arg2, double recoveryRate, double accuracy) {
    return QuantLibJNI.CdsOption_impliedVolatility__SWIG_3(swigCPtr, this, price, YieldTermStructureHandle.getCPtr(termStructure), termStructure, DefaultProbabilityTermStructureHandle.getCPtr(arg2), arg2, recoveryRate, accuracy);
  }

  public double impliedVolatility(double price, YieldTermStructureHandle termStructure, DefaultProbabilityTermStructureHandle arg2, double recoveryRate) {
    return QuantLibJNI.CdsOption_impliedVolatility__SWIG_4(swigCPtr, this, price, YieldTermStructureHandle.getCPtr(termStructure), termStructure, DefaultProbabilityTermStructureHandle.getCPtr(arg2), arg2, recoveryRate);
  }

}
