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

public class HestonProcess : StochasticProcess {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal HestonProcess(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.HestonProcess_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(HestonProcess obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_HestonProcess(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public HestonProcess(YieldTermStructureHandle riskFreeTS, YieldTermStructureHandle dividendTS, QuoteHandle s0, double v0, double kappa, double theta, double sigma, double rho) : this(NQuantLibcPINVOKE.new_HestonProcess(YieldTermStructureHandle.getCPtr(riskFreeTS), YieldTermStructureHandle.getCPtr(dividendTS), QuoteHandle.getCPtr(s0), v0, kappa, theta, sigma, rho), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public QuoteHandle s0() {
    QuoteHandle ret = new QuoteHandle(NQuantLibcPINVOKE.HestonProcess_s0(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public YieldTermStructureHandle dividendYield() {
    YieldTermStructureHandle ret = new YieldTermStructureHandle(NQuantLibcPINVOKE.HestonProcess_dividendYield(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public YieldTermStructureHandle riskFreeRate() {
    YieldTermStructureHandle ret = new YieldTermStructureHandle(NQuantLibcPINVOKE.HestonProcess_riskFreeRate(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
