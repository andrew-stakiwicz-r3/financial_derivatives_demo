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

public class ZeroCouponInflationSwap : Swap {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal ZeroCouponInflationSwap(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.ZeroCouponInflationSwap_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(ZeroCouponInflationSwap obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_ZeroCouponInflationSwap(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public ZeroCouponInflationSwap(ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, bool adjustInfObsDates, Calendar infCalendar, BusinessDayConvention infConvention) : this(NQuantLibcPINVOKE.new_ZeroCouponInflationSwap__SWIG_0((int)type, nominal, Date.getCPtr(start), Date.getCPtr(maturity), Calendar.getCPtr(calendar), (int)convention, DayCounter.getCPtr(dayCounter), fixedRate, ZeroInflationIndex.getCPtr(index), Period.getCPtr(lag), adjustInfObsDates, Calendar.getCPtr(infCalendar), (int)infConvention), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZeroCouponInflationSwap(ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, bool adjustInfObsDates, Calendar infCalendar) : this(NQuantLibcPINVOKE.new_ZeroCouponInflationSwap__SWIG_1((int)type, nominal, Date.getCPtr(start), Date.getCPtr(maturity), Calendar.getCPtr(calendar), (int)convention, DayCounter.getCPtr(dayCounter), fixedRate, ZeroInflationIndex.getCPtr(index), Period.getCPtr(lag), adjustInfObsDates, Calendar.getCPtr(infCalendar)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZeroCouponInflationSwap(ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, bool adjustInfObsDates) : this(NQuantLibcPINVOKE.new_ZeroCouponInflationSwap__SWIG_2((int)type, nominal, Date.getCPtr(start), Date.getCPtr(maturity), Calendar.getCPtr(calendar), (int)convention, DayCounter.getCPtr(dayCounter), fixedRate, ZeroInflationIndex.getCPtr(index), Period.getCPtr(lag), adjustInfObsDates), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZeroCouponInflationSwap(ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag) : this(NQuantLibcPINVOKE.new_ZeroCouponInflationSwap__SWIG_3((int)type, nominal, Date.getCPtr(start), Date.getCPtr(maturity), Calendar.getCPtr(calendar), (int)convention, DayCounter.getCPtr(dayCounter), fixedRate, ZeroInflationIndex.getCPtr(index), Period.getCPtr(lag)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public double fairRate() {
    double ret = NQuantLibcPINVOKE.ZeroCouponInflationSwap_fairRate(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double fixedLegNPV() {
    double ret = NQuantLibcPINVOKE.ZeroCouponInflationSwap_fixedLegNPV(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double inflationLegNPV() {
    double ret = NQuantLibcPINVOKE.ZeroCouponInflationSwap_inflationLegNPV(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Leg fixedLeg() {
    Leg ret = new Leg(NQuantLibcPINVOKE.ZeroCouponInflationSwap_fixedLeg(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Leg inflationLeg() {
    Leg ret = new Leg(NQuantLibcPINVOKE.ZeroCouponInflationSwap_inflationLeg(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public ZeroCouponInflationSwap.Type type() {
    ZeroCouponInflationSwap.Type ret = (ZeroCouponInflationSwap.Type)NQuantLibcPINVOKE.ZeroCouponInflationSwap_type(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public enum Type {
    Receiver = -1,
    Payer = 1
  }

}

}