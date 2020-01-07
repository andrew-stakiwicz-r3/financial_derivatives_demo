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

public class DefaultProbabilityTermStructure : TermStructure {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal DefaultProbabilityTermStructure(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.DefaultProbabilityTermStructure_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DefaultProbabilityTermStructure obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_DefaultProbabilityTermStructure(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public double defaultProbability(Date arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_0(swigCPtr, Date.getCPtr(arg0), extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultProbability(Date arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_1(swigCPtr, Date.getCPtr(arg0));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultProbability(double arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_2(swigCPtr, arg0, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultProbability(double arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_3(swigCPtr, arg0);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultProbability(Date arg0, Date arg1, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_4(swigCPtr, Date.getCPtr(arg0), Date.getCPtr(arg1), extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultProbability(Date arg0, Date arg1) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_5(swigCPtr, Date.getCPtr(arg0), Date.getCPtr(arg1));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultProbability(double arg0, double arg1, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_6(swigCPtr, arg0, arg1, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultProbability(double arg0, double arg1) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultProbability__SWIG_7(swigCPtr, arg0, arg1);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double survivalProbability(Date arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_survivalProbability__SWIG_0(swigCPtr, Date.getCPtr(arg0), extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double survivalProbability(Date arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_survivalProbability__SWIG_1(swigCPtr, Date.getCPtr(arg0));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double survivalProbability(double arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_survivalProbability__SWIG_2(swigCPtr, arg0, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double survivalProbability(double arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_survivalProbability__SWIG_3(swigCPtr, arg0);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultDensity(Date arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultDensity__SWIG_0(swigCPtr, Date.getCPtr(arg0), extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultDensity(Date arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultDensity__SWIG_1(swigCPtr, Date.getCPtr(arg0));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultDensity(double arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultDensity__SWIG_2(swigCPtr, arg0, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double defaultDensity(double arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_defaultDensity__SWIG_3(swigCPtr, arg0);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double hazardRate(Date arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_hazardRate__SWIG_0(swigCPtr, Date.getCPtr(arg0), extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double hazardRate(Date arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_hazardRate__SWIG_1(swigCPtr, Date.getCPtr(arg0));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double hazardRate(double arg0, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_hazardRate__SWIG_2(swigCPtr, arg0, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double hazardRate(double arg0) {
    double ret = NQuantLibcPINVOKE.DefaultProbabilityTermStructure_hazardRate__SWIG_3(swigCPtr, arg0);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}