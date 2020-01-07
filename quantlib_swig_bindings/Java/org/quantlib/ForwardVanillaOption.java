/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ForwardVanillaOption extends OneAssetOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ForwardVanillaOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ForwardVanillaOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ForwardVanillaOption obj) {
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
        QuantLibJNI.delete_ForwardVanillaOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ForwardVanillaOption(double moneyness, Date resetDate, StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_ForwardVanillaOption(moneyness, Date.getCPtr(resetDate), resetDate, StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}