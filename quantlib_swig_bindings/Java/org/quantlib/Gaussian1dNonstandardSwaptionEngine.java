/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Gaussian1dNonstandardSwaptionEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Gaussian1dNonstandardSwaptionEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Gaussian1dNonstandardSwaptionEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Gaussian1dNonstandardSwaptionEngine obj) {
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
        QuantLibJNI.delete_Gaussian1dNonstandardSwaptionEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation, QuoteHandle oas, YieldTermStructureHandle discountCurve, Gaussian1dNonstandardSwaptionEngine.Probabilities probabilities) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_0(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation, QuoteHandle.getCPtr(oas), oas, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, probabilities.swigValue()), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation, QuoteHandle oas, YieldTermStructureHandle discountCurve) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_1(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation, QuoteHandle.getCPtr(oas), oas, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation, QuoteHandle oas) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_2(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation, QuoteHandle.getCPtr(oas), oas), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_3(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_4(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_5(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_6(Gaussian1dModel.getCPtr(model), model, integrationPoints), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_7(Gaussian1dModel.getCPtr(model), model), true);
  }

  public final static class Probabilities {
    public final static Gaussian1dNonstandardSwaptionEngine.Probabilities None = new Gaussian1dNonstandardSwaptionEngine.Probabilities("None");
    public final static Gaussian1dNonstandardSwaptionEngine.Probabilities Naive = new Gaussian1dNonstandardSwaptionEngine.Probabilities("Naive");
    public final static Gaussian1dNonstandardSwaptionEngine.Probabilities Digital = new Gaussian1dNonstandardSwaptionEngine.Probabilities("Digital");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Probabilities swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Probabilities.class + " with value " + swigValue);
    }

    private Probabilities(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Probabilities(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Probabilities(String swigName, Probabilities swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Probabilities[] swigValues = { None, Naive, Digital };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
