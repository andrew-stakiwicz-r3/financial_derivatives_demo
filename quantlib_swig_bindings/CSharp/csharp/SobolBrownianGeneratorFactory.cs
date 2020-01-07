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

public class SobolBrownianGeneratorFactory : BrownianGeneratorFactory {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal SobolBrownianGeneratorFactory(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.SobolBrownianGeneratorFactory_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(SobolBrownianGeneratorFactory obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_SobolBrownianGeneratorFactory(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public SobolBrownianGeneratorFactory(SobolBrownianGenerator.Ordering ordering, uint seed, SobolRsg.DirectionIntegers directionIntegers) : this(NQuantLibcPINVOKE.new_SobolBrownianGeneratorFactory__SWIG_0((int)ordering, seed, (int)directionIntegers), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public SobolBrownianGeneratorFactory(SobolBrownianGenerator.Ordering ordering, uint seed) : this(NQuantLibcPINVOKE.new_SobolBrownianGeneratorFactory__SWIG_1((int)ordering, seed), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public SobolBrownianGeneratorFactory(SobolBrownianGenerator.Ordering ordering) : this(NQuantLibcPINVOKE.new_SobolBrownianGeneratorFactory__SWIG_2((int)ordering), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
