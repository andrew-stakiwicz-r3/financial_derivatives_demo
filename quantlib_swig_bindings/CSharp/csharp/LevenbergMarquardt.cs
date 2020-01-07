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

public class LevenbergMarquardt : OptimizationMethod {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal LevenbergMarquardt(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.LevenbergMarquardt_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(LevenbergMarquardt obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_LevenbergMarquardt(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public LevenbergMarquardt(double epsfcn, double xtol, double gtol, bool useCostFunctionsJacobian) : this(NQuantLibcPINVOKE.new_LevenbergMarquardt__SWIG_0(epsfcn, xtol, gtol, useCostFunctionsJacobian), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LevenbergMarquardt(double epsfcn, double xtol, double gtol) : this(NQuantLibcPINVOKE.new_LevenbergMarquardt__SWIG_1(epsfcn, xtol, gtol), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LevenbergMarquardt(double epsfcn, double xtol) : this(NQuantLibcPINVOKE.new_LevenbergMarquardt__SWIG_2(epsfcn, xtol), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LevenbergMarquardt(double epsfcn) : this(NQuantLibcPINVOKE.new_LevenbergMarquardt__SWIG_3(epsfcn), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LevenbergMarquardt() : this(NQuantLibcPINVOKE.new_LevenbergMarquardt__SWIG_4(), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
