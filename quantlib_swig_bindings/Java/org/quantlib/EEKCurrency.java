/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EEKCurrency extends Currency {
  private transient long swigCPtr;

  protected EEKCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EEKCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EEKCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_EEKCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EEKCurrency() {
    this(QuantLibJNI.new_EEKCurrency(), true);
  }

}