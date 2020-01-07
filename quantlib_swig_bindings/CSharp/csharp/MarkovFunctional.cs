//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 4.0.1
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace QuantLib {

public class MarkovFunctional : Gaussian1dModel {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal MarkovFunctional(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.MarkovFunctional_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(MarkovFunctional obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_MarkovFunctional(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public MarkovFunctional(YieldTermStructureHandle termStructure, double reversion, DateVector volstepdates, DoubleVector volatilities, SwaptionVolatilityStructureHandle swaptionVol, DateVector swaptionExpiries, PeriodVector swaptionTenors, SwapIndex swapIndexBase, MarkovFunctionalSettings modelSettings) : this(NQuantLibcPINVOKE.new_MarkovFunctional__SWIG_0(YieldTermStructureHandle.getCPtr(termStructure), reversion, DateVector.getCPtr(volstepdates), DoubleVector.getCPtr(volatilities), SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), DateVector.getCPtr(swaptionExpiries), PeriodVector.getCPtr(swaptionTenors), SwapIndex.getCPtr(swapIndexBase), MarkovFunctionalSettings.getCPtr(modelSettings)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MarkovFunctional(YieldTermStructureHandle termStructure, double reversion, DateVector volstepdates, DoubleVector volatilities, SwaptionVolatilityStructureHandle swaptionVol, DateVector swaptionExpiries, PeriodVector swaptionTenors, SwapIndex swapIndexBase) : this(NQuantLibcPINVOKE.new_MarkovFunctional__SWIG_1(YieldTermStructureHandle.getCPtr(termStructure), reversion, DateVector.getCPtr(volstepdates), DoubleVector.getCPtr(volatilities), SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), DateVector.getCPtr(swaptionExpiries), PeriodVector.getCPtr(swaptionTenors), SwapIndex.getCPtr(swapIndexBase)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MarkovFunctional(YieldTermStructureHandle termStructure, double reversion, DateVector volstepdates, DoubleVector volatilities, OptionletVolatilityStructureHandle capletVol, DateVector capletExpiries, IborIndex iborIndex, MarkovFunctionalSettings modelSettings) : this(NQuantLibcPINVOKE.new_MarkovFunctional__SWIG_2(YieldTermStructureHandle.getCPtr(termStructure), reversion, DateVector.getCPtr(volstepdates), DoubleVector.getCPtr(volatilities), OptionletVolatilityStructureHandle.getCPtr(capletVol), DateVector.getCPtr(capletExpiries), IborIndex.getCPtr(iborIndex), MarkovFunctionalSettings.getCPtr(modelSettings)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MarkovFunctional(YieldTermStructureHandle termStructure, double reversion, DateVector volstepdates, DoubleVector volatilities, OptionletVolatilityStructureHandle capletVol, DateVector capletExpiries, IborIndex iborIndex) : this(NQuantLibcPINVOKE.new_MarkovFunctional__SWIG_3(YieldTermStructureHandle.getCPtr(termStructure), reversion, DateVector.getCPtr(volstepdates), DoubleVector.getCPtr(volatilities), OptionletVolatilityStructureHandle.getCPtr(capletVol), DateVector.getCPtr(capletExpiries), IborIndex.getCPtr(iborIndex)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public QlArray volatility() {
    QlArray ret = new QlArray(NQuantLibcPINVOKE.MarkovFunctional_volatility(swigCPtr), false);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void calibrate(BlackCalibrationHelperVector helper, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint, DoubleVector weights, BoolVector fixParameters) {
    NQuantLibcPINVOKE.MarkovFunctional_calibrate__SWIG_0(swigCPtr, BlackCalibrationHelperVector.getCPtr(helper), OptimizationMethod.getCPtr(method), EndCriteria.getCPtr(endCriteria), Constraint.getCPtr(constraint), DoubleVector.getCPtr(weights), BoolVector.getCPtr(fixParameters));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void calibrate(BlackCalibrationHelperVector helper, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint, DoubleVector weights) {
    NQuantLibcPINVOKE.MarkovFunctional_calibrate__SWIG_1(swigCPtr, BlackCalibrationHelperVector.getCPtr(helper), OptimizationMethod.getCPtr(method), EndCriteria.getCPtr(endCriteria), Constraint.getCPtr(constraint), DoubleVector.getCPtr(weights));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void calibrate(BlackCalibrationHelperVector helper, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint) {
    NQuantLibcPINVOKE.MarkovFunctional_calibrate__SWIG_2(swigCPtr, BlackCalibrationHelperVector.getCPtr(helper), OptimizationMethod.getCPtr(method), EndCriteria.getCPtr(endCriteria), Constraint.getCPtr(constraint));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void calibrate(BlackCalibrationHelperVector helper, OptimizationMethod method, EndCriteria endCriteria) {
    NQuantLibcPINVOKE.MarkovFunctional_calibrate__SWIG_3(swigCPtr, BlackCalibrationHelperVector.getCPtr(helper), OptimizationMethod.getCPtr(method), EndCriteria.getCPtr(endCriteria));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public QlArray params_() {
    QlArray ret = new QlArray(NQuantLibcPINVOKE.MarkovFunctional_params_(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void setParams(QlArray params_) {
    NQuantLibcPINVOKE.MarkovFunctional_setParams(swigCPtr, QlArray.getCPtr(params_));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public double value(QlArray params_, CalibrationHelperVector instruments) {
    double ret = NQuantLibcPINVOKE.MarkovFunctional_value(swigCPtr, QlArray.getCPtr(params_), CalibrationHelperVector.getCPtr(instruments));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Constraint constraint() {
    global::System.IntPtr cPtr = NQuantLibcPINVOKE.MarkovFunctional_constraint(swigCPtr);
    Constraint ret = (cPtr == global::System.IntPtr.Zero) ? null : new Constraint(cPtr, true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public EndCriteria.Type endCriteria() {
    EndCriteria.Type ret = (EndCriteria.Type)NQuantLibcPINVOKE.MarkovFunctional_endCriteria(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public QlArray problemValues() {
    QlArray ret = new QlArray(NQuantLibcPINVOKE.MarkovFunctional_problemValues(swigCPtr), false);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public int functionEvaluation() {
    int ret = NQuantLibcPINVOKE.MarkovFunctional_functionEvaluation(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
