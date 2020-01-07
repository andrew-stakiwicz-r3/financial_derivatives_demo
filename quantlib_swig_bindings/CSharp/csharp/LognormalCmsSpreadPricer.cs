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

public class LognormalCmsSpreadPricer : CmsSpreadCouponPricer {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal LognormalCmsSpreadPricer(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.LognormalCmsSpreadPricer_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(LognormalCmsSpreadPricer obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_LognormalCmsSpreadPricer(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public LognormalCmsSpreadPricer(CmsCouponPricer cmsPricer, QuoteHandle correlation, YieldTermStructureHandle couponDiscountCurve, uint IntegrationPoints, SWIGTYPE_p_boost__optionalT_VolatilityType_t volatilityType, double shift1, double shift2) : this(NQuantLibcPINVOKE.new_LognormalCmsSpreadPricer__SWIG_0(CmsCouponPricer.getCPtr(cmsPricer), QuoteHandle.getCPtr(correlation), YieldTermStructureHandle.getCPtr(couponDiscountCurve), IntegrationPoints, SWIGTYPE_p_boost__optionalT_VolatilityType_t.getCPtr(volatilityType), shift1, shift2), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LognormalCmsSpreadPricer(CmsCouponPricer cmsPricer, QuoteHandle correlation, YieldTermStructureHandle couponDiscountCurve, uint IntegrationPoints, SWIGTYPE_p_boost__optionalT_VolatilityType_t volatilityType, double shift1) : this(NQuantLibcPINVOKE.new_LognormalCmsSpreadPricer__SWIG_1(CmsCouponPricer.getCPtr(cmsPricer), QuoteHandle.getCPtr(correlation), YieldTermStructureHandle.getCPtr(couponDiscountCurve), IntegrationPoints, SWIGTYPE_p_boost__optionalT_VolatilityType_t.getCPtr(volatilityType), shift1), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LognormalCmsSpreadPricer(CmsCouponPricer cmsPricer, QuoteHandle correlation, YieldTermStructureHandle couponDiscountCurve, uint IntegrationPoints, SWIGTYPE_p_boost__optionalT_VolatilityType_t volatilityType) : this(NQuantLibcPINVOKE.new_LognormalCmsSpreadPricer__SWIG_2(CmsCouponPricer.getCPtr(cmsPricer), QuoteHandle.getCPtr(correlation), YieldTermStructureHandle.getCPtr(couponDiscountCurve), IntegrationPoints, SWIGTYPE_p_boost__optionalT_VolatilityType_t.getCPtr(volatilityType)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LognormalCmsSpreadPricer(CmsCouponPricer cmsPricer, QuoteHandle correlation, YieldTermStructureHandle couponDiscountCurve, uint IntegrationPoints) : this(NQuantLibcPINVOKE.new_LognormalCmsSpreadPricer__SWIG_3(CmsCouponPricer.getCPtr(cmsPricer), QuoteHandle.getCPtr(correlation), YieldTermStructureHandle.getCPtr(couponDiscountCurve), IntegrationPoints), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LognormalCmsSpreadPricer(CmsCouponPricer cmsPricer, QuoteHandle correlation, YieldTermStructureHandle couponDiscountCurve) : this(NQuantLibcPINVOKE.new_LognormalCmsSpreadPricer__SWIG_4(CmsCouponPricer.getCPtr(cmsPricer), QuoteHandle.getCPtr(correlation), YieldTermStructureHandle.getCPtr(couponDiscountCurve)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LognormalCmsSpreadPricer(CmsCouponPricer cmsPricer, QuoteHandle correlation) : this(NQuantLibcPINVOKE.new_LognormalCmsSpreadPricer__SWIG_5(CmsCouponPricer.getCPtr(cmsPricer), QuoteHandle.getCPtr(correlation)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public double swapletPrice() {
    double ret = NQuantLibcPINVOKE.LognormalCmsSpreadPricer_swapletPrice(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapletRate() {
    double ret = NQuantLibcPINVOKE.LognormalCmsSpreadPricer_swapletRate(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double capletPrice(double effectiveCap) {
    double ret = NQuantLibcPINVOKE.LognormalCmsSpreadPricer_capletPrice(swigCPtr, effectiveCap);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double capletRate(double effectiveCap) {
    double ret = NQuantLibcPINVOKE.LognormalCmsSpreadPricer_capletRate(swigCPtr, effectiveCap);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double floorletPrice(double effectiveFloor) {
    double ret = NQuantLibcPINVOKE.LognormalCmsSpreadPricer_floorletPrice(swigCPtr, effectiveFloor);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double floorletRate(double effectiveFloor) {
    double ret = NQuantLibcPINVOKE.LognormalCmsSpreadPricer_floorletRate(swigCPtr, effectiveFloor);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}