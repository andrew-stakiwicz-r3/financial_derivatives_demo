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

public class HestonBlackVolSurface : BlackVolTermStructure {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal HestonBlackVolSurface(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.HestonBlackVolSurface_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(HestonBlackVolSurface obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_HestonBlackVolSurface(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public HestonBlackVolSurface(HestonModelHandle hestonModel, AnalyticHestonEngine.ComplexLogFormula cpxLogFormula, AnalyticHestonEngine.AnalyticHestonEngine_Integration integration) : this(NQuantLibcPINVOKE.new_HestonBlackVolSurface__SWIG_0(HestonModelHandle.getCPtr(hestonModel), (int)cpxLogFormula, AnalyticHestonEngine.AnalyticHestonEngine_Integration.getCPtr(integration)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public HestonBlackVolSurface(HestonModelHandle hestonModel, AnalyticHestonEngine.ComplexLogFormula cpxLogFormula) : this(NQuantLibcPINVOKE.new_HestonBlackVolSurface__SWIG_1(HestonModelHandle.getCPtr(hestonModel), (int)cpxLogFormula), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public HestonBlackVolSurface(HestonModelHandle hestonModel) : this(NQuantLibcPINVOKE.new_HestonBlackVolSurface__SWIG_2(HestonModelHandle.getCPtr(hestonModel)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}