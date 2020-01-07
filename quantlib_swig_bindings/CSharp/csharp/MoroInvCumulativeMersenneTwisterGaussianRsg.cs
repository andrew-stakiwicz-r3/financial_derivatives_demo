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

public class MoroInvCumulativeMersenneTwisterGaussianRsg : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal MoroInvCumulativeMersenneTwisterGaussianRsg(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(MoroInvCumulativeMersenneTwisterGaussianRsg obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~MoroInvCumulativeMersenneTwisterGaussianRsg() {
    Dispose(false);
  }

  public void Dispose() {
    Dispose(true);
    global::System.GC.SuppressFinalize(this);
  }

  protected virtual void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          NQuantLibcPINVOKE.delete_MoroInvCumulativeMersenneTwisterGaussianRsg(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
    }
  }

  public MoroInvCumulativeMersenneTwisterGaussianRsg(MersenneTwisterUniformRsg uniformSequenceGenerator) : this(NQuantLibcPINVOKE.new_MoroInvCumulativeMersenneTwisterGaussianRsg__SWIG_0(MersenneTwisterUniformRsg.getCPtr(uniformSequenceGenerator)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public MoroInvCumulativeMersenneTwisterGaussianRsg(MersenneTwisterUniformRsg uniformSequenceGenerator, MoroInverseCumulativeNormal inverseCumulative) : this(NQuantLibcPINVOKE.new_MoroInvCumulativeMersenneTwisterGaussianRsg__SWIG_1(MersenneTwisterUniformRsg.getCPtr(uniformSequenceGenerator), MoroInverseCumulativeNormal.getCPtr(inverseCumulative)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public SampleRealVector nextSequence() {
    SampleRealVector ret = new SampleRealVector(NQuantLibcPINVOKE.MoroInvCumulativeMersenneTwisterGaussianRsg_nextSequence(swigCPtr), false);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public uint dimension() {
    uint ret = NQuantLibcPINVOKE.MoroInvCumulativeMersenneTwisterGaussianRsg_dimension(swigCPtr);
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
