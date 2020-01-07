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

public class MCLDEuropeanEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal MCLDEuropeanEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.MCLDEuropeanEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(MCLDEuropeanEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_MCLDEuropeanEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples, double requiredTolerance) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, bool brownianBridge, bool antitheticVariate) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, bool brownianBridge) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, timeStepsPerYear), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process, int timeSteps) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_7(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCLDEuropeanEngine(GeneralizedBlackScholesProcess process) : this(NQuantLibcPINVOKE.new_MCLDEuropeanEngine__SWIG_8(GeneralizedBlackScholesProcess.getCPtr(process)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
