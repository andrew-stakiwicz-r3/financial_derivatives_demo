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

public class AnalyticHestonEngine : PricingEngine {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal AnalyticHestonEngine(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.AnalyticHestonEngine_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(AnalyticHestonEngine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_AnalyticHestonEngine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public class AnalyticHestonEngine_Integration : global::System.IDisposable {
    private global::System.Runtime.InteropServices.HandleRef swigCPtr;
    protected bool swigCMemOwn;
  
    internal AnalyticHestonEngine_Integration(global::System.IntPtr cPtr, bool cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
    }
  
    internal static global::System.Runtime.InteropServices.HandleRef getCPtr(AnalyticHestonEngine_Integration obj) {
      return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
    }
  
    ~AnalyticHestonEngine_Integration() {
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
            NQuantLibcPINVOKE.delete_AnalyticHestonEngine_AnalyticHestonEngine_Integration(swigCPtr);
          }
          swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
        }
      }
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussLaguerre(uint integrationOrder) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussLaguerre__SWIG_0(integrationOrder), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussLaguerre() {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussLaguerre__SWIG_1(), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussLegendre(uint integrationOrder) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussLegendre__SWIG_0(integrationOrder), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussLegendre() {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussLegendre__SWIG_1(), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussChebyshev(uint integrationOrder) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussChebyshev__SWIG_0(integrationOrder), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussChebyshev() {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussChebyshev__SWIG_1(), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussChebyshev2nd(uint integrationOrder) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussChebyshev2nd__SWIG_0(integrationOrder), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussChebyshev2nd() {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussChebyshev2nd__SWIG_1(), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussLobatto(double relTolerance, double absTolerance, uint maxEvaluations) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussLobatto__SWIG_0(relTolerance, absTolerance, maxEvaluations), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussLobatto(double relTolerance, double absTolerance) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussLobatto__SWIG_1(relTolerance, absTolerance), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussKronrod(double absTolerance, uint maxEvaluations) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussKronrod__SWIG_0(absTolerance, maxEvaluations), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration gaussKronrod(double absTolerance) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_gaussKronrod__SWIG_1(absTolerance), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration simpson(double absTolerance, uint maxEvaluations) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_simpson__SWIG_0(absTolerance, maxEvaluations), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration simpson(double absTolerance) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_simpson__SWIG_1(absTolerance), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration trapezoid(double absTolerance, uint maxEvaluations) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_trapezoid__SWIG_0(absTolerance, maxEvaluations), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration trapezoid(double absTolerance) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_trapezoid__SWIG_1(absTolerance), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration discreteSimpson(uint evaluation) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_discreteSimpson__SWIG_0(evaluation), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration discreteSimpson() {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_discreteSimpson__SWIG_1(), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration discreteTrapezoid(uint evaluation) {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_discreteTrapezoid__SWIG_0(evaluation), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static AnalyticHestonEngine.AnalyticHestonEngine_Integration discreteTrapezoid() {
      AnalyticHestonEngine.AnalyticHestonEngine_Integration ret = new AnalyticHestonEngine.AnalyticHestonEngine_Integration(NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_discreteTrapezoid__SWIG_1(), true);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public static double andersenPiterbargIntegrationLimit(double c_inf, double epsilon, double v0, double t) {
      double ret = NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_andersenPiterbargIntegrationLimit(c_inf, epsilon, v0, t);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public double calculate(double c_inf, SWIGTYPE_p_boost__functionT_double_fdoubleF_t f, double maxBound) {
      double ret = NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_calculate__SWIG_0(swigCPtr, c_inf, SWIGTYPE_p_boost__functionT_double_fdoubleF_t.getCPtr(f), maxBound);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public double calculate(double c_inf, SWIGTYPE_p_boost__functionT_double_fdoubleF_t f) {
      double ret = NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_calculate__SWIG_1(swigCPtr, c_inf, SWIGTYPE_p_boost__functionT_double_fdoubleF_t.getCPtr(f));
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public uint numberOfEvaluations() {
      uint ret = NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_numberOfEvaluations(swigCPtr);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
    public bool isAdaptiveIntegration() {
      bool ret = NQuantLibcPINVOKE.AnalyticHestonEngine_AnalyticHestonEngine_Integration_isAdaptiveIntegration(swigCPtr);
      if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    }
  
  }

  public AnalyticHestonEngine(HestonModel model, uint integrationOrder) : this(NQuantLibcPINVOKE.new_AnalyticHestonEngine__SWIG_0(HestonModel.getCPtr(model), integrationOrder), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AnalyticHestonEngine(HestonModel model) : this(NQuantLibcPINVOKE.new_AnalyticHestonEngine__SWIG_1(HestonModel.getCPtr(model)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AnalyticHestonEngine(HestonModel model, double relTolerance, uint maxEvaluations) : this(NQuantLibcPINVOKE.new_AnalyticHestonEngine__SWIG_2(HestonModel.getCPtr(model), relTolerance, maxEvaluations), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AnalyticHestonEngine(HestonModel model, AnalyticHestonEngine.ComplexLogFormula cpxLog, AnalyticHestonEngine.AnalyticHestonEngine_Integration itg, double andersenPiterbargEpsilon) : this(NQuantLibcPINVOKE.new_AnalyticHestonEngine__SWIG_3(HestonModel.getCPtr(model), (int)cpxLog, AnalyticHestonEngine.AnalyticHestonEngine_Integration.getCPtr(itg), andersenPiterbargEpsilon), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public AnalyticHestonEngine(HestonModel model, AnalyticHestonEngine.ComplexLogFormula cpxLog, AnalyticHestonEngine.AnalyticHestonEngine_Integration itg) : this(NQuantLibcPINVOKE.new_AnalyticHestonEngine__SWIG_4(HestonModel.getCPtr(model), (int)cpxLog, AnalyticHestonEngine.AnalyticHestonEngine_Integration.getCPtr(itg)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public enum ComplexLogFormula {
    Gatheral,
    BranchCorrection,
    AndersenPiterbarg
  }

}

}
