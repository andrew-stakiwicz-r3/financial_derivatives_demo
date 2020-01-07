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

public class CompositeInstrument : Instrument {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal CompositeInstrument(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.CompositeInstrument_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(CompositeInstrument obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_CompositeInstrument(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public CompositeInstrument() : this(NQuantLibcPINVOKE.new_CompositeInstrument(), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void add(Instrument instrument, double multiplier) {
    NQuantLibcPINVOKE.CompositeInstrument_add__SWIG_0(swigCPtr, Instrument.getCPtr(instrument), multiplier);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void add(Instrument instrument) {
    NQuantLibcPINVOKE.CompositeInstrument_add__SWIG_1(swigCPtr, Instrument.getCPtr(instrument));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void subtract(Instrument instrument, double multiplier) {
    NQuantLibcPINVOKE.CompositeInstrument_subtract__SWIG_0(swigCPtr, Instrument.getCPtr(instrument), multiplier);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void subtract(Instrument instrument) {
    NQuantLibcPINVOKE.CompositeInstrument_subtract__SWIG_1(swigCPtr, Instrument.getCPtr(instrument));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
