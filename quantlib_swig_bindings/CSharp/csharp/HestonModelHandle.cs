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

public class HestonModelHandle : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal HestonModelHandle(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(HestonModelHandle obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~HestonModelHandle() {
    Dispose(false);
  }

  public void Dispose() {
    Dispose(true);
    global::System.GC.SuppressFinalize(this);
  }

  protected virtual void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          NQuantLibcPINVOKE.delete_HestonModelHandle(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
    }
  }

  public HestonModelHandle(HestonModel arg0) : this(NQuantLibcPINVOKE.new_HestonModelHandle__SWIG_0(HestonModel.getCPtr(arg0)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public HestonModelHandle() : this(NQuantLibcPINVOKE.new_HestonModelHandle__SWIG_1(), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public HestonModel __deref__() {
    global::System.IntPtr cPtr = NQuantLibcPINVOKE.HestonModelHandle___deref__(swigCPtr);
    HestonModel ret = (cPtr == global::System.IntPtr.Zero) ? null : new HestonModel(cPtr, true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public bool empty() {
    bool ret = NQuantLibcPINVOKE.HestonModelHandle_empty(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Observable asObservable() {
    global::System.IntPtr cPtr = NQuantLibcPINVOKE.HestonModelHandle_asObservable(swigCPtr);
    Observable ret = (cPtr == global::System.IntPtr.Zero) ? null : new Observable(cPtr, true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double theta() {
    double ret = NQuantLibcPINVOKE.HestonModelHandle_theta(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double kappa() {
    double ret = NQuantLibcPINVOKE.HestonModelHandle_kappa(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double sigma() {
    double ret = NQuantLibcPINVOKE.HestonModelHandle_sigma(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double rho() {
    double ret = NQuantLibcPINVOKE.HestonModelHandle_rho(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double v0() {
    double ret = NQuantLibcPINVOKE.HestonModelHandle_v0(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public QlArray parameters() {
    QlArray ret = new QlArray(NQuantLibcPINVOKE.HestonModelHandle_parameters(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint, DoubleVector weights, BoolVector fixParameters) {
    NQuantLibcPINVOKE.HestonModelHandle_calibrate__SWIG_0(swigCPtr, CalibrationHelperVector.getCPtr(arg0), OptimizationMethod.getCPtr(arg1), EndCriteria.getCPtr(arg2), Constraint.getCPtr(constraint), DoubleVector.getCPtr(weights), BoolVector.getCPtr(fixParameters));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint, DoubleVector weights) {
    NQuantLibcPINVOKE.HestonModelHandle_calibrate__SWIG_1(swigCPtr, CalibrationHelperVector.getCPtr(arg0), OptimizationMethod.getCPtr(arg1), EndCriteria.getCPtr(arg2), Constraint.getCPtr(constraint), DoubleVector.getCPtr(weights));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint) {
    NQuantLibcPINVOKE.HestonModelHandle_calibrate__SWIG_2(swigCPtr, CalibrationHelperVector.getCPtr(arg0), OptimizationMethod.getCPtr(arg1), EndCriteria.getCPtr(arg2), Constraint.getCPtr(constraint));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2) {
    NQuantLibcPINVOKE.HestonModelHandle_calibrate__SWIG_3(swigCPtr, CalibrationHelperVector.getCPtr(arg0), OptimizationMethod.getCPtr(arg1), EndCriteria.getCPtr(arg2));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void setParams(QlArray params_) {
    NQuantLibcPINVOKE.HestonModelHandle_setParams(swigCPtr, QlArray.getCPtr(params_));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public double value(QlArray params_, CalibrationHelperVector arg1) {
    double ret = NQuantLibcPINVOKE.HestonModelHandle_value(swigCPtr, QlArray.getCPtr(params_), CalibrationHelperVector.getCPtr(arg1));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Constraint constraint() {
    global::System.IntPtr cPtr = NQuantLibcPINVOKE.HestonModelHandle_constraint(swigCPtr);
    Constraint ret = (cPtr == global::System.IntPtr.Zero) ? null : new Constraint(cPtr, true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public EndCriteria.Type endCriteria() {
    EndCriteria.Type ret = (EndCriteria.Type)NQuantLibcPINVOKE.HestonModelHandle_endCriteria(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public QlArray problemValues() {
    QlArray ret = new QlArray(NQuantLibcPINVOKE.HestonModelHandle_problemValues(swigCPtr), false);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public int functionEvaluation() {
    int ret = NQuantLibcPINVOKE.HestonModelHandle_functionEvaluation(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
