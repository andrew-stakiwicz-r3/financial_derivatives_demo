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

public class FlatHazardRate : DefaultProbabilityTermStructure {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal FlatHazardRate(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.FlatHazardRate_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(FlatHazardRate obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_FlatHazardRate(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public FlatHazardRate(int settlementDays, Calendar calendar, QuoteHandle hazardRate, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FlatHazardRate__SWIG_0(settlementDays, Calendar.getCPtr(calendar), QuoteHandle.getCPtr(hazardRate), DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FlatHazardRate(Date todaysDate, QuoteHandle hazardRate, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FlatHazardRate__SWIG_1(Date.getCPtr(todaysDate), QuoteHandle.getCPtr(hazardRate), DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
