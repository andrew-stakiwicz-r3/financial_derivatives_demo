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

public class DeltaVolQuote : Quote {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal DeltaVolQuote(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.DeltaVolQuote_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DeltaVolQuote obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_DeltaVolQuote(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public DeltaVolQuote(double delta, QuoteHandle vol, double maturity, DeltaVolQuote.DeltaType deltaType) : this(NQuantLibcPINVOKE.new_DeltaVolQuote__SWIG_0(delta, QuoteHandle.getCPtr(vol), maturity, (int)deltaType), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DeltaVolQuote(QuoteHandle vol, DeltaVolQuote.DeltaType deltaType, double maturity, DeltaVolQuote.AtmType atmType) : this(NQuantLibcPINVOKE.new_DeltaVolQuote__SWIG_1(QuoteHandle.getCPtr(vol), (int)deltaType, maturity, (int)atmType), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public enum DeltaType {
    Spot,
    Fwd,
    PaSpot,
    PaFwd
  }

  public enum AtmType {
    AtmNull,
    AtmSpot,
    AtmFwd,
    AtmDeltaNeutral,
    AtmVegaMax,
    AtmGammaMax,
    AtmPutCall50
  }

}

}