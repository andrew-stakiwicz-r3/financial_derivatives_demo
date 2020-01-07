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

public class FDBermudanEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal FDBermudanEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.FDBermudanEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(FDBermudanEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_FDBermudanEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public FDBermudanEngine(GeneralizedBlackScholesProcess process, uint timeSteps, uint gridPoints, bool timeDependent) : this(NQuantLibcPINVOKE.new_FDBermudanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, gridPoints, timeDependent), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FDBermudanEngine(GeneralizedBlackScholesProcess process, uint timeSteps, uint gridPoints) : this(NQuantLibcPINVOKE.new_FDBermudanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps, gridPoints), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FDBermudanEngine(GeneralizedBlackScholesProcess process, uint timeSteps) : this(NQuantLibcPINVOKE.new_FDBermudanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), timeSteps), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public FDBermudanEngine(GeneralizedBlackScholesProcess process) : this(NQuantLibcPINVOKE.new_FDBermudanEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}