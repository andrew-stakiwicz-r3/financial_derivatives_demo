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

public class Gaussian1dModel : TermStructureConsistentModel {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal Gaussian1dModel(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.Gaussian1dModel_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Gaussian1dModel obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_Gaussian1dModel(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public StochasticProcess1D stateProcess() {
    global::System.IntPtr cPtr = NQuantLibcPINVOKE.Gaussian1dModel_stateProcess(swigCPtr);
    StochasticProcess1D ret = (cPtr == global::System.IntPtr.Zero) ? null : new StochasticProcess1D(cPtr, true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double numeraire(double t, double y, YieldTermStructureHandle yts) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_numeraire__SWIG_0(swigCPtr, t, y, YieldTermStructureHandle.getCPtr(yts));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double numeraire(double t, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_numeraire__SWIG_1(swigCPtr, t, y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double numeraire(double t) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_numeraire__SWIG_2(swigCPtr, t);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(double T, double t, double y, YieldTermStructureHandle yts) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_0(swigCPtr, T, t, y, YieldTermStructureHandle.getCPtr(yts));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(double T, double t, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_1(swigCPtr, T, t, y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(double T, double t) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_2(swigCPtr, T, t);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(double T) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_3(swigCPtr, T);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double numeraire(Date referenceDate, double y, YieldTermStructureHandle yts) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_numeraire__SWIG_3(swigCPtr, Date.getCPtr(referenceDate), y, YieldTermStructureHandle.getCPtr(yts));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double numeraire(Date referenceDate, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_numeraire__SWIG_4(swigCPtr, Date.getCPtr(referenceDate), y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double numeraire(Date referenceDate) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_numeraire__SWIG_5(swigCPtr, Date.getCPtr(referenceDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(Date maturity, Date referenceDate, double y, YieldTermStructureHandle yts) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_4(swigCPtr, Date.getCPtr(maturity), Date.getCPtr(referenceDate), y, YieldTermStructureHandle.getCPtr(yts));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(Date maturity, Date referenceDate, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_5(swigCPtr, Date.getCPtr(maturity), Date.getCPtr(referenceDate), y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(Date maturity, Date referenceDate) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_6(swigCPtr, Date.getCPtr(maturity), Date.getCPtr(referenceDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobond(Date maturity) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobond__SWIG_7(swigCPtr, Date.getCPtr(maturity));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike, Date referenceDate, double y, YieldTermStructureHandle yts, double yStdDevs, uint yGridPoints, bool extrapolatePayoff, bool flatPayoffExtrapolation) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_0(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike, Date.getCPtr(referenceDate), y, YieldTermStructureHandle.getCPtr(yts), yStdDevs, yGridPoints, extrapolatePayoff, flatPayoffExtrapolation);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike, Date referenceDate, double y, YieldTermStructureHandle yts, double yStdDevs, uint yGridPoints, bool extrapolatePayoff) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_1(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike, Date.getCPtr(referenceDate), y, YieldTermStructureHandle.getCPtr(yts), yStdDevs, yGridPoints, extrapolatePayoff);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike, Date referenceDate, double y, YieldTermStructureHandle yts, double yStdDevs, uint yGridPoints) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_2(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike, Date.getCPtr(referenceDate), y, YieldTermStructureHandle.getCPtr(yts), yStdDevs, yGridPoints);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike, Date referenceDate, double y, YieldTermStructureHandle yts, double yStdDevs) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_3(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike, Date.getCPtr(referenceDate), y, YieldTermStructureHandle.getCPtr(yts), yStdDevs);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike, Date referenceDate, double y, YieldTermStructureHandle yts) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_4(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike, Date.getCPtr(referenceDate), y, YieldTermStructureHandle.getCPtr(yts));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike, Date referenceDate, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_5(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike, Date.getCPtr(referenceDate), y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike, Date referenceDate) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_6(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike, Date.getCPtr(referenceDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double zerobondOption(Option.Type type, Date expiry, Date valueDate, Date maturity, double strike) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_zerobondOption__SWIG_7(swigCPtr, (int)type, Date.getCPtr(expiry), Date.getCPtr(valueDate), Date.getCPtr(maturity), strike);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double forwardRate(Date fixing, Date referenceDate, double y, IborIndex iborIdx) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_forwardRate__SWIG_0(swigCPtr, Date.getCPtr(fixing), Date.getCPtr(referenceDate), y, IborIndex.getCPtr(iborIdx));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double forwardRate(Date fixing, Date referenceDate, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_forwardRate__SWIG_1(swigCPtr, Date.getCPtr(fixing), Date.getCPtr(referenceDate), y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double forwardRate(Date fixing, Date referenceDate) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_forwardRate__SWIG_2(swigCPtr, Date.getCPtr(fixing), Date.getCPtr(referenceDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double forwardRate(Date fixing) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_forwardRate__SWIG_3(swigCPtr, Date.getCPtr(fixing));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapRate(Date fixing, Period tenor, Date referenceDate, double y, SwapIndex swapIdx) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapRate__SWIG_0(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor), Date.getCPtr(referenceDate), y, SwapIndex.getCPtr(swapIdx));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapRate(Date fixing, Period tenor, Date referenceDate, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapRate__SWIG_1(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor), Date.getCPtr(referenceDate), y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapRate(Date fixing, Period tenor, Date referenceDate) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapRate__SWIG_2(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor), Date.getCPtr(referenceDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapRate(Date fixing, Period tenor) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapRate__SWIG_3(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapAnnuity(Date fixing, Period tenor, Date referenceDate, double y, SwapIndex swapIdx) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapAnnuity__SWIG_0(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor), Date.getCPtr(referenceDate), y, SwapIndex.getCPtr(swapIdx));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapAnnuity(Date fixing, Period tenor, Date referenceDate, double y) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapAnnuity__SWIG_1(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor), Date.getCPtr(referenceDate), y);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapAnnuity(Date fixing, Period tenor, Date referenceDate) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapAnnuity__SWIG_2(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor), Date.getCPtr(referenceDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double swapAnnuity(Date fixing, Period tenor) {
    double ret = NQuantLibcPINVOKE.Gaussian1dModel_swapAnnuity__SWIG_3(swigCPtr, Date.getCPtr(fixing), Period.getCPtr(tenor));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
