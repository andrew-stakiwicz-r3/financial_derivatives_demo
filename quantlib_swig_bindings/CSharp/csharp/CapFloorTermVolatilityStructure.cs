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

public class CapFloorTermVolatilityStructure : VolatilityTermStructure {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal CapFloorTermVolatilityStructure(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.CapFloorTermVolatilityStructure_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(CapFloorTermVolatilityStructure obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_CapFloorTermVolatilityStructure(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public double volatility(Period length, double strike, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.CapFloorTermVolatilityStructure_volatility__SWIG_0(swigCPtr, Period.getCPtr(length), strike, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double volatility(Period length, double strike) {
    double ret = NQuantLibcPINVOKE.CapFloorTermVolatilityStructure_volatility__SWIG_1(swigCPtr, Period.getCPtr(length), strike);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double volatility(Date end, double strike, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.CapFloorTermVolatilityStructure_volatility__SWIG_2(swigCPtr, Date.getCPtr(end), strike, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double volatility(Date end, double strike) {
    double ret = NQuantLibcPINVOKE.CapFloorTermVolatilityStructure_volatility__SWIG_3(swigCPtr, Date.getCPtr(end), strike);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double volatility(double end, double strike, bool extrapolate) {
    double ret = NQuantLibcPINVOKE.CapFloorTermVolatilityStructure_volatility__SWIG_4(swigCPtr, end, strike, extrapolate);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double volatility(double end, double strike) {
    double ret = NQuantLibcPINVOKE.CapFloorTermVolatilityStructure_volatility__SWIG_5(swigCPtr, end, strike);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
