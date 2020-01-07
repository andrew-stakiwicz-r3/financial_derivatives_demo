/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SimpleCashFlow extends CashFlow {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SimpleCashFlow(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SimpleCashFlow_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimpleCashFlow obj) {
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
        QuantLibJNI.delete_SimpleCashFlow(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SimpleCashFlow(double amount, Date date) {
    this(QuantLibJNI.new_SimpleCashFlow(amount, Date.getCPtr(date), date), true);
  }

}
