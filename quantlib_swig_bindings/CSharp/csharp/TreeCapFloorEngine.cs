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

public class TreeCapFloorEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal TreeCapFloorEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.TreeCapFloorEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(TreeCapFloorEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_TreeCapFloorEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public TreeCapFloorEngine(ShortRateModel model, uint timeSteps, YieldTermStructureHandle termStructure) : this(NQuantLibcPINVOKE.new_TreeCapFloorEngine__SWIG_0(ShortRateModel.getCPtr(model), timeSteps, YieldTermStructureHandle.getCPtr(termStructure)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public TreeCapFloorEngine(ShortRateModel model, uint timeSteps) : this(NQuantLibcPINVOKE.new_TreeCapFloorEngine__SWIG_1(ShortRateModel.getCPtr(model), timeSteps), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public TreeCapFloorEngine(ShortRateModel model, TimeGrid grid, YieldTermStructureHandle termStructure) : this(NQuantLibcPINVOKE.new_TreeCapFloorEngine__SWIG_2(ShortRateModel.getCPtr(model), TimeGrid.getCPtr(grid), YieldTermStructureHandle.getCPtr(termStructure)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public TreeCapFloorEngine(ShortRateModel model, TimeGrid grid) : this(NQuantLibcPINVOKE.new_TreeCapFloorEngine__SWIG_3(ShortRateModel.getCPtr(model), TimeGrid.getCPtr(grid)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
