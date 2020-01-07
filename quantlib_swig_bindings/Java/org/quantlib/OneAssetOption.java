/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class OneAssetOption extends Option {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected OneAssetOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.OneAssetOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OneAssetOption obj) {
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
        QuantLibJNI.delete_OneAssetOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double delta() {
    return QuantLibJNI.OneAssetOption_delta(swigCPtr, this);
  }

  public double deltaForward() {
    return QuantLibJNI.OneAssetOption_deltaForward(swigCPtr, this);
  }

  public double elasticity() {
    return QuantLibJNI.OneAssetOption_elasticity(swigCPtr, this);
  }

  public double gamma() {
    return QuantLibJNI.OneAssetOption_gamma(swigCPtr, this);
  }

  public double theta() {
    return QuantLibJNI.OneAssetOption_theta(swigCPtr, this);
  }

  public double thetaPerDay() {
    return QuantLibJNI.OneAssetOption_thetaPerDay(swigCPtr, this);
  }

  public double vega() {
    return QuantLibJNI.OneAssetOption_vega(swigCPtr, this);
  }

  public double rho() {
    return QuantLibJNI.OneAssetOption_rho(swigCPtr, this);
  }

  public double dividendRho() {
    return QuantLibJNI.OneAssetOption_dividendRho(swigCPtr, this);
  }

  public double strikeSensitivity() {
    return QuantLibJNI.OneAssetOption_strikeSensitivity(swigCPtr, this);
  }

  public double itmCashProbability() {
    return QuantLibJNI.OneAssetOption_itmCashProbability(swigCPtr, this);
  }

}
