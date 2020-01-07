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

public class DiscountingSwapEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal DiscountingSwapEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.DiscountingSwapEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DiscountingSwapEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_DiscountingSwapEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public DiscountingSwapEngine(YieldTermStructureHandle discountCurve, bool includeSettlementDateFlows, Date settlementDate, Date npvDate) : this(NQuantLibcPINVOKE.new_DiscountingSwapEngine__SWIG_0(YieldTermStructureHandle.getCPtr(discountCurve), includeSettlementDateFlows, Date.getCPtr(settlementDate), Date.getCPtr(npvDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DiscountingSwapEngine(YieldTermStructureHandle discountCurve, bool includeSettlementDateFlows, Date settlementDate) : this(NQuantLibcPINVOKE.new_DiscountingSwapEngine__SWIG_1(YieldTermStructureHandle.getCPtr(discountCurve), includeSettlementDateFlows, Date.getCPtr(settlementDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DiscountingSwapEngine(YieldTermStructureHandle discountCurve, bool includeSettlementDateFlows) : this(NQuantLibcPINVOKE.new_DiscountingSwapEngine__SWIG_2(YieldTermStructureHandle.getCPtr(discountCurve), includeSettlementDateFlows), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DiscountingSwapEngine(YieldTermStructureHandle discountCurve, Date settlementDate, Date npvDate) : this(NQuantLibcPINVOKE.new_DiscountingSwapEngine__SWIG_3(YieldTermStructureHandle.getCPtr(discountCurve), Date.getCPtr(settlementDate), Date.getCPtr(npvDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DiscountingSwapEngine(YieldTermStructureHandle discountCurve, Date settlementDate) : this(NQuantLibcPINVOKE.new_DiscountingSwapEngine__SWIG_4(YieldTermStructureHandle.getCPtr(discountCurve), Date.getCPtr(settlementDate)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public DiscountingSwapEngine(YieldTermStructureHandle discountCurve) : this(NQuantLibcPINVOKE.new_DiscountingSwapEngine__SWIG_5(YieldTermStructureHandle.getCPtr(discountCurve)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
