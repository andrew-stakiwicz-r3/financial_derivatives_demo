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

public class BatesProcess : HestonProcess {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal BatesProcess(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.BatesProcess_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(BatesProcess obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_BatesProcess(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public BatesProcess(YieldTermStructureHandle riskFreeRate, YieldTermStructureHandle dividendYield, QuoteHandle s0, double v0, double kappa, double theta, double sigma, double rho, double lambda, double nu, double delta) : this(NQuantLibcPINVOKE.new_BatesProcess(YieldTermStructureHandle.getCPtr(riskFreeRate), YieldTermStructureHandle.getCPtr(dividendYield), QuoteHandle.getCPtr(s0), v0, kappa, theta, sigma, rho, lambda, nu, delta), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
