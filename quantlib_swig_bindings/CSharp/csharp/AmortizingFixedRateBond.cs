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

public class AmortizingFixedRateBond : Bond {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal AmortizingFixedRateBond(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.AmortizingFixedRateBond_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(AmortizingFixedRateBond obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_AmortizingFixedRateBond(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate) : this(NQuantLibcPINVOKE.new_AmortizingFixedRateBond__SWIG_0(settlementDays, DoubleVector.getCPtr(notionals), Schedule.getCPtr(schedule), DoubleVector.getCPtr(coupons), DayCounter.getCPtr(accrualDayCounter), (int)paymentConvention, Date.getCPtr(issueDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention) : this(NQuantLibcPINVOKE.new_AmortizingFixedRateBond__SWIG_1(settlementDays, DoubleVector.getCPtr(notionals), Schedule.getCPtr(schedule), DoubleVector.getCPtr(coupons), DayCounter.getCPtr(accrualDayCounter), (int)paymentConvention), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter) : this(NQuantLibcPINVOKE.new_AmortizingFixedRateBond__SWIG_2(settlementDays, DoubleVector.getCPtr(notionals), Schedule.getCPtr(schedule), DoubleVector.getCPtr(coupons), DayCounter.getCPtr(accrualDayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AmortizingFixedRateBond(int settlementDays, Calendar paymentCalendar, double faceAmount, Date startDate, Period bondTenor, Frequency sinkingFrequency, double coupon, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate) : this(NQuantLibcPINVOKE.new_AmortizingFixedRateBond__SWIG_3(settlementDays, Calendar.getCPtr(paymentCalendar), faceAmount, Date.getCPtr(startDate), Period.getCPtr(bondTenor), (int)sinkingFrequency, coupon, DayCounter.getCPtr(accrualDayCounter), (int)paymentConvention, Date.getCPtr(issueDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AmortizingFixedRateBond(int settlementDays, Calendar paymentCalendar, double faceAmount, Date startDate, Period bondTenor, Frequency sinkingFrequency, double coupon, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention) : this(NQuantLibcPINVOKE.new_AmortizingFixedRateBond__SWIG_4(settlementDays, Calendar.getCPtr(paymentCalendar), faceAmount, Date.getCPtr(startDate), Period.getCPtr(bondTenor), (int)sinkingFrequency, coupon, DayCounter.getCPtr(accrualDayCounter), (int)paymentConvention), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AmortizingFixedRateBond(int settlementDays, Calendar paymentCalendar, double faceAmount, Date startDate, Period bondTenor, Frequency sinkingFrequency, double coupon, DayCounter accrualDayCounter) : this(NQuantLibcPINVOKE.new_AmortizingFixedRateBond__SWIG_5(settlementDays, Calendar.getCPtr(paymentCalendar), faceAmount, Date.getCPtr(startDate), Period.getCPtr(bondTenor), (int)sinkingFrequency, coupon, DayCounter.getCPtr(accrualDayCounter)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public Frequency frequency() {
    Frequency ret = (Frequency)NQuantLibcPINVOKE.AmortizingFixedRateBond_frequency(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public DayCounter dayCounter() {
    DayCounter ret = new DayCounter(NQuantLibcPINVOKE.AmortizingFixedRateBond_dayCounter(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}