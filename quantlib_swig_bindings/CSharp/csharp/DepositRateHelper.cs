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

public class DepositRateHelper : RateHelper {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal DepositRateHelper(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.DepositRateHelper_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DepositRateHelper obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_DepositRateHelper(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public DepositRateHelper(QuoteHandle rate, Period tenor, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_DepositRateHelper__SWIG_0(QuoteHandle.getCPtr(rate), Period.getCPtr(tenor), fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DepositRateHelper(double rate, Period tenor, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_DepositRateHelper__SWIG_1(rate, Period.getCPtr(tenor), fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DepositRateHelper(QuoteHandle rate, IborIndex index) : this(NQuantLibcPINVOKE.new_DepositRateHelper__SWIG_2(QuoteHandle.getCPtr(rate), IborIndex.getCPtr(index)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DepositRateHelper(double rate, IborIndex index) : this(NQuantLibcPINVOKE.new_DepositRateHelper__SWIG_3(rate, IborIndex.getCPtr(index)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}