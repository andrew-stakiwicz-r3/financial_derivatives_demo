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

public class MCPREverestEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal MCPREverestEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.MCPREverestEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(MCPREverestEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_MCPREverestEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps, uint timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_0(StochasticProcessArray.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps, uint timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_1(StochasticProcessArray.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps, uint timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples, double requiredTolerance) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_2(StochasticProcessArray.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps, uint timeStepsPerYear, bool brownianBridge, bool antitheticVariate, int requiredSamples) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_3(StochasticProcessArray.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps, uint timeStepsPerYear, bool brownianBridge, bool antitheticVariate) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_4(StochasticProcessArray.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps, uint timeStepsPerYear, bool brownianBridge) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_5(StochasticProcessArray.getCPtr(process), timeSteps, timeStepsPerYear, brownianBridge), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps, uint timeStepsPerYear) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_6(StochasticProcessArray.getCPtr(process), timeSteps, timeStepsPerYear), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process, uint timeSteps) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_7(StochasticProcessArray.getCPtr(process), timeSteps), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MCPREverestEngine(StochasticProcessArray process) : this(NQuantLibcPINVOKE.new_MCPREverestEngine__SWIG_8(StochasticProcessArray.getCPtr(process)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}