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

public class FalsePosition : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal FalsePosition(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(FalsePosition obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~FalsePosition() {
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
          NQuantLibcPINVOKE.delete_FalsePosition(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
    }
  }

  public void setMaxEvaluations(uint evaluations) {
    NQuantLibcPINVOKE.FalsePosition_setMaxEvaluations(swigCPtr, evaluations);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void setLowerBound(double lowerBound) {
    NQuantLibcPINVOKE.FalsePosition_setLowerBound(swigCPtr, lowerBound);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void setUpperBound(double upperBound) {
    NQuantLibcPINVOKE.FalsePosition_setUpperBound(swigCPtr, upperBound);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public double solve(UnaryFunctionDelegate function, double xAccuracy, double guess, double step) {
    double ret = NQuantLibcPINVOKE.FalsePosition_solve__SWIG_0(swigCPtr, UnaryFunctionDelegate.getCPtr(function), xAccuracy, guess, step);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double solve(UnaryFunctionDelegate function, double xAccuracy, double guess, double xMin, double xMax) {
    double ret = NQuantLibcPINVOKE.FalsePosition_solve__SWIG_1(swigCPtr, UnaryFunctionDelegate.getCPtr(function), xAccuracy, guess, xMin, xMax);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public FalsePosition() : this(NQuantLibcPINVOKE.new_FalsePosition(), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
