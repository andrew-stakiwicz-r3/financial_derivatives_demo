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

public class Index : Observable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal Index(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.Index_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Index obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_Index(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public string name() {
    string ret = NQuantLibcPINVOKE.Index_name(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Calendar fixingCalendar() {
    Calendar ret = new Calendar(NQuantLibcPINVOKE.Index_fixingCalendar(swigCPtr), true);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public bool isValidFixingDate(Date fixingDate) {
    bool ret = NQuantLibcPINVOKE.Index_isValidFixingDate(swigCPtr, Date.getCPtr(fixingDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double fixing(Date fixingDate, bool forecastTodaysFixing) {
    double ret = NQuantLibcPINVOKE.Index_fixing__SWIG_0(swigCPtr, Date.getCPtr(fixingDate), forecastTodaysFixing);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public double fixing(Date fixingDate) {
    double ret = NQuantLibcPINVOKE.Index_fixing__SWIG_1(swigCPtr, Date.getCPtr(fixingDate));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void addFixing(Date fixingDate, double fixing, bool forceOverwrite) {
    NQuantLibcPINVOKE.Index_addFixing__SWIG_0(swigCPtr, Date.getCPtr(fixingDate), fixing, forceOverwrite);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void addFixing(Date fixingDate, double fixing) {
    NQuantLibcPINVOKE.Index_addFixing__SWIG_1(swigCPtr, Date.getCPtr(fixingDate), fixing);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public RealTimeSeries timeSeries() {
    RealTimeSeries ret = new RealTimeSeries(NQuantLibcPINVOKE.Index_timeSeries(swigCPtr), false);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void clearFixings() {
    NQuantLibcPINVOKE.Index_clearFixings(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void addFixings(DateVector fixingDates, DoubleVector fixings, bool forceOverwrite) {
    NQuantLibcPINVOKE.Index_addFixings__SWIG_0(swigCPtr, DateVector.getCPtr(fixingDates), DoubleVector.getCPtr(fixings), forceOverwrite);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public void addFixings(DateVector fixingDates, DoubleVector fixings) {
    NQuantLibcPINVOKE.Index_addFixings__SWIG_1(swigCPtr, DateVector.getCPtr(fixingDates), DoubleVector.getCPtr(fixings));
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public string __str__() {
    string ret = NQuantLibcPINVOKE.Index___str__(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
