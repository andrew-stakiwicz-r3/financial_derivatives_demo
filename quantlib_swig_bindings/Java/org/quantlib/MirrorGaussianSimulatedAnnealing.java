/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MirrorGaussianSimulatedAnnealing extends OptimizationMethod {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MirrorGaussianSimulatedAnnealing(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MirrorGaussianSimulatedAnnealing_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MirrorGaussianSimulatedAnnealing obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_MirrorGaussianSimulatedAnnealing(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MirrorGaussianSimulatedAnnealing(SamplerMirrorGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps, MirrorGaussianSimulatedAnnealing.ResetScheme resetScheme, long resetSteps) {
    this(QuantLibJNI.new_MirrorGaussianSimulatedAnnealing__SWIG_0(SamplerMirrorGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps, resetScheme.swigValue(), resetSteps), true);
  }

  public MirrorGaussianSimulatedAnnealing(SamplerMirrorGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps, MirrorGaussianSimulatedAnnealing.ResetScheme resetScheme) {
    this(QuantLibJNI.new_MirrorGaussianSimulatedAnnealing__SWIG_1(SamplerMirrorGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps, resetScheme.swigValue()), true);
  }

  public MirrorGaussianSimulatedAnnealing(SamplerMirrorGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps) {
    this(QuantLibJNI.new_MirrorGaussianSimulatedAnnealing__SWIG_2(SamplerMirrorGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps), true);
  }

  public MirrorGaussianSimulatedAnnealing(SamplerMirrorGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature) {
    this(QuantLibJNI.new_MirrorGaussianSimulatedAnnealing__SWIG_3(SamplerMirrorGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature), true);
  }

  public MirrorGaussianSimulatedAnnealing(SamplerMirrorGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature) {
    this(QuantLibJNI.new_MirrorGaussianSimulatedAnnealing__SWIG_4(SamplerMirrorGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature), true);
  }

  public MirrorGaussianSimulatedAnnealing(SamplerMirrorGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing) {
    this(QuantLibJNI.new_MirrorGaussianSimulatedAnnealing__SWIG_5(SamplerMirrorGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing), true);
  }

  public MirrorGaussianSimulatedAnnealing(SamplerMirrorGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature) {
    this(QuantLibJNI.new_MirrorGaussianSimulatedAnnealing__SWIG_6(SamplerMirrorGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature), true);
  }

  public final static class ResetScheme {
    public final static MirrorGaussianSimulatedAnnealing.ResetScheme NoResetScheme = new MirrorGaussianSimulatedAnnealing.ResetScheme("NoResetScheme");
    public final static MirrorGaussianSimulatedAnnealing.ResetScheme ResetToBestPoint = new MirrorGaussianSimulatedAnnealing.ResetScheme("ResetToBestPoint");
    public final static MirrorGaussianSimulatedAnnealing.ResetScheme ResetToOrigin = new MirrorGaussianSimulatedAnnealing.ResetScheme("ResetToOrigin");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ResetScheme swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ResetScheme.class + " with value " + swigValue);
    }

    private ResetScheme(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ResetScheme(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ResetScheme(String swigName, ResetScheme swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ResetScheme[] swigValues = { NoResetScheme, ResetToBestPoint, ResetToOrigin };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
