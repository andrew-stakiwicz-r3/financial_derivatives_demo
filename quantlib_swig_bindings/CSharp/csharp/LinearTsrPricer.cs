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

public class LinearTsrPricer : CmsCouponPricer {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal LinearTsrPricer(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.LinearTsrPricer_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(LinearTsrPricer obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_LinearTsrPricer(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public LinearTsrPricer(SwaptionVolatilityStructureHandle swaptionVol, QuoteHandle meanReversion, YieldTermStructureHandle couponDiscountCurve, Settings settings) : this(NQuantLibcPINVOKE.new_LinearTsrPricer__SWIG_0(SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), QuoteHandle.getCPtr(meanReversion), YieldTermStructureHandle.getCPtr(couponDiscountCurve), Settings.getCPtr(settings)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LinearTsrPricer(SwaptionVolatilityStructureHandle swaptionVol, QuoteHandle meanReversion, YieldTermStructureHandle couponDiscountCurve) : this(NQuantLibcPINVOKE.new_LinearTsrPricer__SWIG_1(SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), QuoteHandle.getCPtr(meanReversion), YieldTermStructureHandle.getCPtr(couponDiscountCurve)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LinearTsrPricer(SwaptionVolatilityStructureHandle swaptionVol, QuoteHandle meanReversion) : this(NQuantLibcPINVOKE.new_LinearTsrPricer__SWIG_2(SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), QuoteHandle.getCPtr(meanReversion)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}