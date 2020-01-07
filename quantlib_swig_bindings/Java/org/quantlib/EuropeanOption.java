/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EuropeanOption extends VanillaOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected EuropeanOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EuropeanOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EuropeanOption obj) {
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
        QuantLibJNI.delete_EuropeanOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EuropeanOption(StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_EuropeanOption(StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}
