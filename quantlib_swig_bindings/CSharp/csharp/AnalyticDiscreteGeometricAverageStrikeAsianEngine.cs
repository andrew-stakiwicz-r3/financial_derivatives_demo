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

public class AnalyticDiscreteGeometricAverageStrikeAsianEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal AnalyticDiscreteGeometricAverageStrikeAsianEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.AnalyticDiscreteGeometricAverageStrikeAsianEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(AnalyticDiscreteGeometricAverageStrikeAsianEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_AnalyticDiscreteGeometricAverageStrikeAsianEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public AnalyticDiscreteGeometricAverageStrikeAsianEngine(GeneralizedBlackScholesProcess process) : this(NQuantLibcPINVOKE.new_AnalyticDiscreteGeometricAverageStrikeAsianEngine(GeneralizedBlackScholesProcess.getCPtr(process)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
