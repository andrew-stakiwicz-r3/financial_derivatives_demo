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

public class LogNormalSimulatedAnnealing : OptimizationMethod {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal LogNormalSimulatedAnnealing(global::System.IntPtr cPtr, bool cMemoryOwn) : base(NQuantLibcPINVOKE.LogNormalSimulatedAnnealing_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(LogNormalSimulatedAnnealing obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  protected override void Dispose(bool disposing) {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          NQuantLibcPINVOKE.delete_LogNormalSimulatedAnnealing(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      base.Dispose(disposing);
    }
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, uint reAnnealSteps, LogNormalSimulatedAnnealing.ResetScheme resetScheme, uint resetSteps) : this(NQuantLibcPINVOKE.new_LogNormalSimulatedAnnealing__SWIG_0(SamplerLogNormal.getCPtr(sampler), ProbabilityBoltzmannDownhill.getCPtr(probability), TemperatureExponential.getCPtr(temperature), ReannealingTrivial.getCPtr(reannealing), startTemperature, endTemperature, reAnnealSteps, (int)resetScheme, resetSteps), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, uint reAnnealSteps, LogNormalSimulatedAnnealing.ResetScheme resetScheme) : this(NQuantLibcPINVOKE.new_LogNormalSimulatedAnnealing__SWIG_1(SamplerLogNormal.getCPtr(sampler), ProbabilityBoltzmannDownhill.getCPtr(probability), TemperatureExponential.getCPtr(temperature), ReannealingTrivial.getCPtr(reannealing), startTemperature, endTemperature, reAnnealSteps, (int)resetScheme), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, uint reAnnealSteps) : this(NQuantLibcPINVOKE.new_LogNormalSimulatedAnnealing__SWIG_2(SamplerLogNormal.getCPtr(sampler), ProbabilityBoltzmannDownhill.getCPtr(probability), TemperatureExponential.getCPtr(temperature), ReannealingTrivial.getCPtr(reannealing), startTemperature, endTemperature, reAnnealSteps), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature) : this(NQuantLibcPINVOKE.new_LogNormalSimulatedAnnealing__SWIG_3(SamplerLogNormal.getCPtr(sampler), ProbabilityBoltzmannDownhill.getCPtr(probability), TemperatureExponential.getCPtr(temperature), ReannealingTrivial.getCPtr(reannealing), startTemperature, endTemperature), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature) : this(NQuantLibcPINVOKE.new_LogNormalSimulatedAnnealing__SWIG_4(SamplerLogNormal.getCPtr(sampler), ProbabilityBoltzmannDownhill.getCPtr(probability), TemperatureExponential.getCPtr(temperature), ReannealingTrivial.getCPtr(reannealing), startTemperature), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing) : this(NQuantLibcPINVOKE.new_LogNormalSimulatedAnnealing__SWIG_5(SamplerLogNormal.getCPtr(sampler), ProbabilityBoltzmannDownhill.getCPtr(probability), TemperatureExponential.getCPtr(temperature), ReannealingTrivial.getCPtr(reannealing)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature) : this(NQuantLibcPINVOKE.new_LogNormalSimulatedAnnealing__SWIG_6(SamplerLogNormal.getCPtr(sampler), ProbabilityBoltzmannDownhill.getCPtr(probability), TemperatureExponential.getCPtr(temperature)), true) {
    if (NQuantLibcPINVOKE.SWIGPendingException.Pending) throw NQuantLibcPINVOKE.SWIGPendingException.Retrieve();
  }

  public enum ResetScheme {
    NoResetScheme,
    ResetToBestPoint,
    ResetToOrigin
  }

}

}
