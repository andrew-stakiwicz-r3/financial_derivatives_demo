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

public class FraRateHelper : RateHelper {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal FraRateHelper(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.FraRateHelper_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(FraRateHelper obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_FraRateHelper(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public FraRateHelper(QuoteHandle rate, uint monthsToStart, uint monthsToEnd, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, Pillar.Choice pillar, Date customPillarDate) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_0(QuoteHandle.getCPtr(rate), monthsToStart, monthsToEnd, fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), (int)pillar, Date.getCPtr(customPillarDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(QuoteHandle rate, uint monthsToStart, uint monthsToEnd, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, Pillar.Choice pillar) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_1(QuoteHandle.getCPtr(rate), monthsToStart, monthsToEnd, fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), (int)pillar), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(QuoteHandle rate, uint monthsToStart, uint monthsToEnd, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_2(QuoteHandle.getCPtr(rate), monthsToStart, monthsToEnd, fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(double rate, uint monthsToStart, uint monthsToEnd, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, Pillar.Choice pillar, Date customPillarDate) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_3(rate, monthsToStart, monthsToEnd, fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), (int)pillar, Date.getCPtr(customPillarDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(double rate, uint monthsToStart, uint monthsToEnd, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, Pillar.Choice pillar) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_4(rate, monthsToStart, monthsToEnd, fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), (int)pillar), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(double rate, uint monthsToStart, uint monthsToEnd, uint fixingDays, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_5(rate, monthsToStart, monthsToEnd, fixingDays, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(QuoteHandle rate, uint monthsToStart, IborIndex index, Pillar.Choice pillar, Date customPillarDate) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_6(QuoteHandle.getCPtr(rate), monthsToStart, IborIndex.getCPtr(index), (int)pillar, Date.getCPtr(customPillarDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(QuoteHandle rate, uint monthsToStart, IborIndex index, Pillar.Choice pillar) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_7(QuoteHandle.getCPtr(rate), monthsToStart, IborIndex.getCPtr(index), (int)pillar), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(QuoteHandle rate, uint monthsToStart, IborIndex index) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_8(QuoteHandle.getCPtr(rate), monthsToStart, IborIndex.getCPtr(index)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(double rate, uint monthsToStart, IborIndex index, Pillar.Choice pillar, Date customPillarDate) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_9(rate, monthsToStart, IborIndex.getCPtr(index), (int)pillar, Date.getCPtr(customPillarDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(double rate, uint monthsToStart, IborIndex index, Pillar.Choice pillar) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_10(rate, monthsToStart, IborIndex.getCPtr(index), (int)pillar), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FraRateHelper(double rate, uint monthsToStart, IborIndex index) : this(NQuantLibcPINVOKE.new_FraRateHelper__SWIG_11(rate, monthsToStart, IborIndex.getCPtr(index)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}