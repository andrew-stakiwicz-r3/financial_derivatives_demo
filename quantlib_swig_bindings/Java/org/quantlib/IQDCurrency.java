/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class IQDCurrency extends Currency {
  private transient long swigCPtr;

  protected IQDCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.IQDCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IQDCurrency obj) {
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
        QuantLibJNI.delete_IQDCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IQDCurrency() {
    this(QuantLibJNI.new_IQDCurrency(), true);
  }

}
