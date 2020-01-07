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

public class BinomialCRRDoubleBarrierEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal BinomialCRRDoubleBarrierEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.BinomialCRRDoubleBarrierEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(BinomialCRRDoubleBarrierEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_BinomialCRRDoubleBarrierEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public BinomialCRRDoubleBarrierEngine(GeneralizedBlackScholesProcess arg0, uint steps) : this(NQuantLibcPINVOKE.new_BinomialCRRDoubleBarrierEngine(GeneralizedBlackScholesProcess.getCPtr(arg0), steps), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}