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

public class FuturesRateHelper : RateHelper {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal FuturesRateHelper(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.FuturesRateHelper_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(FuturesRateHelper obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_FuturesRateHelper(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, uint nMonths, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, QuoteHandle convexityAdjustment, Futures.Type type) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_0(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), nMonths, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), QuoteHandle.getCPtr(convexityAdjustment), (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, uint nMonths, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, QuoteHandle convexityAdjustment) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_1(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), nMonths, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), QuoteHandle.getCPtr(convexityAdjustment)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, uint nMonths, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_2(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), nMonths, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, uint nMonths, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, double convexityAdjustment, Futures.Type type) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_3(price, Date.getCPtr(iborStartDate), nMonths, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), convexityAdjustment, (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, uint nMonths, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter, double convexityAdjustment) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_4(price, Date.getCPtr(iborStartDate), nMonths, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter), convexityAdjustment), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, uint nMonths, Calendar calendar, BusinessDayConvention convention, bool endOfMonth, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_5(price, Date.getCPtr(iborStartDate), nMonths, Calendar.getCPtr(calendar), (int)convention, endOfMonth, DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, Date iborEndDate, DayCounter dayCounter, QuoteHandle convexityAdjustment, Futures.Type type) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_6(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), Date.getCPtr(iborEndDate), DayCounter.getCPtr(dayCounter), QuoteHandle.getCPtr(convexityAdjustment), (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, Date iborEndDate, DayCounter dayCounter, QuoteHandle convexityAdjustment) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_7(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), Date.getCPtr(iborEndDate), DayCounter.getCPtr(dayCounter), QuoteHandle.getCPtr(convexityAdjustment)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, Date iborEndDate, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_8(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), Date.getCPtr(iborEndDate), DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, Date iborEndDate, DayCounter dayCounter, double convexityAdjustment, Futures.Type type) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_9(price, Date.getCPtr(iborStartDate), Date.getCPtr(iborEndDate), DayCounter.getCPtr(dayCounter), convexityAdjustment, (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, Date iborEndDate, DayCounter dayCounter, double convexityAdjustment) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_10(price, Date.getCPtr(iborStartDate), Date.getCPtr(iborEndDate), DayCounter.getCPtr(dayCounter), convexityAdjustment), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, Date iborEndDate, DayCounter dayCounter) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_11(price, Date.getCPtr(iborStartDate), Date.getCPtr(iborEndDate), DayCounter.getCPtr(dayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, IborIndex index, QuoteHandle convexityAdjustment, Futures.Type type) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_12(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), IborIndex.getCPtr(index), QuoteHandle.getCPtr(convexityAdjustment), (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, IborIndex index, QuoteHandle convexityAdjustment) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_13(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), IborIndex.getCPtr(index), QuoteHandle.getCPtr(convexityAdjustment)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(QuoteHandle price, Date iborStartDate, IborIndex index) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_14(QuoteHandle.getCPtr(price), Date.getCPtr(iborStartDate), IborIndex.getCPtr(index)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, IborIndex index, double convexityAdjustment, Futures.Type type) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_15(price, Date.getCPtr(iborStartDate), IborIndex.getCPtr(index), convexityAdjustment, (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, IborIndex index, double convexityAdjustment) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_16(price, Date.getCPtr(iborStartDate), IborIndex.getCPtr(index), convexityAdjustment), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FuturesRateHelper(double price, Date iborStartDate, IborIndex index) : this(NQuantLibcPINVOKE.new_FuturesRateHelper__SWIG_17(price, Date.getCPtr(iborStartDate), IborIndex.getCPtr(index)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
