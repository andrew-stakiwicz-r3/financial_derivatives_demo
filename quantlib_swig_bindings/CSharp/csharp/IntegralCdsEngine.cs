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

public class IntegralCdsEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal IntegralCdsEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.IntegralCdsEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(IntegralCdsEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_IntegralCdsEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public IntegralCdsEngine(Period integrationStep, DefaultProbabilityTermStructureHandle probability, double recoveryRate, YieldTermStructureHandle discountCurve, bool includeSettlementDateFlows) : this(NQuantLibcPINVOKE.new_IntegralCdsEngine__SWIG_0(Period.getCPtr(integrationStep), DefaultProbabilityTermStructureHandle.getCPtr(probability), recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), includeSettlementDateFlows), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public IntegralCdsEngine(Period integrationStep, DefaultProbabilityTermStructureHandle probability, double recoveryRate, YieldTermStructureHandle discountCurve) : this(NQuantLibcPINVOKE.new_IntegralCdsEngine__SWIG_1(Period.getCPtr(integrationStep), DefaultProbabilityTermStructureHandle.getCPtr(probability), recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
