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

public class Libor : IborIndex {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal Libor(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.Libor_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Libor obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_Libor(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public Libor(string familyName, Period tenor, uint settlementDays, Currency currency, Calendar financialCenterCalendar, DayCounter dayCounter, YieldTermStructureHandle h) : this(NQuantLibcPINVOKE.new_Libor__SWIG_0(familyName, Period.getCPtr(tenor), settlementDays, Currency.getCPtr(currency), Calendar.getCPtr(financialCenterCalendar), DayCounter.getCPtr(dayCounter), YieldTermStructureHandle.getCPtr(h)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public Libor(string familyName, Period tenor, uint settlementDays, Currency currency, Calendar financialCenterCalendar, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_Libor__SWIG_1(familyName, Period.getCPtr(tenor), settlementDays, Currency.getCPtr(currency), Calendar.getCPtr(financialCenterCalendar), DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
