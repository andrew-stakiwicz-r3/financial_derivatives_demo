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

public class ZabrShortMaturityLognormalInterpolatedSmileSection : SmileSection {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal ZabrShortMaturityLognormalInterpolatedSmileSection(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(ZabrShortMaturityLognormalInterpolatedSmileSection obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_ZabrShortMaturityLognormalInterpolatedSmileSection(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, OptimizationMethod method, DayCounter dc) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_0(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), OptimizationMethod.getCPtr(method), DayCounter.getCPtr(dc)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, OptimizationMethod method) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_1(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), OptimizationMethod.getCPtr(method)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_2(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_3(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_4(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_5(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_6(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_7(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_8(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma, isAlphaFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, QuoteHandle forward, DoubleVector strikes, bool hasFloatingStrikes, QuoteHandle atmVolatility, QuoteHandleVector volHandles, double alpha, double beta, double nu, double rho, double gamma) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_9(Date.getCPtr(optionDate), QuoteHandle.getCPtr(forward), DoubleVector.getCPtr(strikes), hasFloatingStrikes, QuoteHandle.getCPtr(atmVolatility), QuoteHandleVector.getCPtr(volHandles), alpha, beta, nu, rho, gamma), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, OptimizationMethod method, DayCounter dc) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_10(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), OptimizationMethod.getCPtr(method), DayCounter.getCPtr(dc)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria, OptimizationMethod method) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_11(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria), OptimizationMethod.getCPtr(method)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t endCriteria) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_12(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted, SWIGTYPE_p_boost__shared_ptrT_EndCriteria_t.getCPtr(endCriteria)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed, bool vegaWeighted) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_13(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed, vegaWeighted), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed, bool isGammaFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_14(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed, isGammaFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed, bool isRhoFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_15(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed, isRhoFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed, bool isNuFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_16(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed, isNuFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed, bool isBetaFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_17(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed, isBetaFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma, bool isAlphaFixed) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_18(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma, isAlphaFixed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public ZabrShortMaturityLognormalInterpolatedSmileSection(Date optionDate, double forward, DoubleVector strikes, bool hasFloatingStrikes, double atmVolatility, DoubleVector vols, double alpha, double beta, double nu, double rho, double gamma) : this(NQuantLibcPINVOKE.new_ZabrShortMaturityLognormalInterpolatedSmileSection__SWIG_19(Date.getCPtr(optionDate), forward, DoubleVector.getCPtr(strikes), hasFloatingStrikes, atmVolatility, DoubleVector.getCPtr(vols), alpha, beta, nu, rho, gamma), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public double alpha() {
    double ret = NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_alpha(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double beta() {
    double ret = NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_beta(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double nu() {
    double ret = NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_nu(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double rho() {
    double ret = NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_rho(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double rmsError() {
    double ret = NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_rmsError(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double maxError() {
    double ret = NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_maxError(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public EndCriteria.Type endCriteria() {
    EndCriteria.Type ret = (EndCriteria.Type)NQuantLibcPINVOKE.ZabrShortMaturityLognormalInterpolatedSmileSection_endCriteria(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
