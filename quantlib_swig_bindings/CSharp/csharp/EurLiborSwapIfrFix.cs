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

public class EurLiborSwapIfrFix : SwapIndex {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal EurLiborSwapIfrFix(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.EurLiborSwapIfrFix_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(EurLiborSwapIfrFix obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_EurLiborSwapIfrFix(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public EurLiborSwapIfrFix(Period tenor, YieldTermStructureHandle h) : this(NQuantLibcPINVOKE.new_EurLiborSwapIfrFix__SWIG_0(Period.getCPtr(tenor), YieldTermStructureHandle.getCPtr(h)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public EurLiborSwapIfrFix(Period tenor) : this(NQuantLibcPINVOKE.new_EurLiborSwapIfrFix__SWIG_1(Period.getCPtr(tenor)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public EurLiborSwapIfrFix(Period tenor, YieldTermStructureHandle h1, YieldTermStructureHandle h2) : this(NQuantLibcPINVOKE.new_EurLiborSwapIfrFix__SWIG_2(Period.getCPtr(tenor), YieldTermStructureHandle.getCPtr(h1), YieldTermStructureHandle.getCPtr(h2)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
