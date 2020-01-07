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

public class ConstantSwaptionVolatility : SwaptionVolatilityStructure {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal ConstantSwaptionVolatility(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.ConstantSwaptionVolatility_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(ConstantSwaptionVolatility obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_ConstantSwaptionVolatility(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public ConstantSwaptionVolatility(uint settlementDays, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type, double shift) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_0(settlementDays, Calendar.getCPtr(cal), (int)bdc, QuoteHandle.getCPtr(volatility), DayCounter.getCPtr(dc), (int)type, shift), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(uint settlementDays, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_1(settlementDays, Calendar.getCPtr(cal), (int)bdc, QuoteHandle.getCPtr(volatility), DayCounter.getCPtr(dc), (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(uint settlementDays, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_2(settlementDays, Calendar.getCPtr(cal), (int)bdc, QuoteHandle.getCPtr(volatility), DayCounter.getCPtr(dc)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type, double shift) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_3(Date.getCPtr(referenceDate), Calendar.getCPtr(cal), (int)bdc, QuoteHandle.getCPtr(volatility), DayCounter.getCPtr(dc), (int)type, shift), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_4(Date.getCPtr(referenceDate), Calendar.getCPtr(cal), (int)bdc, QuoteHandle.getCPtr(volatility), DayCounter.getCPtr(dc), (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_5(Date.getCPtr(referenceDate), Calendar.getCPtr(cal), (int)bdc, QuoteHandle.getCPtr(volatility), DayCounter.getCPtr(dc)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(uint settlementDays, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type, double shift) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_6(settlementDays, Calendar.getCPtr(cal), (int)bdc, volatility, DayCounter.getCPtr(dc), (int)type, shift), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(uint settlementDays, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_7(settlementDays, Calendar.getCPtr(cal), (int)bdc, volatility, DayCounter.getCPtr(dc), (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(uint settlementDays, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_8(settlementDays, Calendar.getCPtr(cal), (int)bdc, volatility, DayCounter.getCPtr(dc)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type, double shift) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_9(Date.getCPtr(referenceDate), Calendar.getCPtr(cal), (int)bdc, volatility, DayCounter.getCPtr(dc), (int)type, shift), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_10(Date.getCPtr(referenceDate), Calendar.getCPtr(cal), (int)bdc, volatility, DayCounter.getCPtr(dc), (int)type), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc) : this(NQuantLibcPINVOKE.new_ConstantSwaptionVolatility__SWIG_11(Date.getCPtr(referenceDate), Calendar.getCPtr(cal), (int)bdc, volatility, DayCounter.getCPtr(dc)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}