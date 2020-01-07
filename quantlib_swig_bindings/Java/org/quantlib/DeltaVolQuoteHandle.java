/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DeltaVolQuoteHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DeltaVolQuoteHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DeltaVolQuoteHandle obj) {
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
        QuantLibJNI.delete_DeltaVolQuoteHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DeltaVolQuoteHandle(DeltaVolQuote arg0) {
    this(QuantLibJNI.new_DeltaVolQuoteHandle__SWIG_0(DeltaVolQuote.getCPtr(arg0), arg0), true);
  }

  public DeltaVolQuoteHandle() {
    this(QuantLibJNI.new_DeltaVolQuoteHandle__SWIG_1(), true);
  }

  public DeltaVolQuote __deref__() {
    long cPtr = QuantLibJNI.DeltaVolQuoteHandle___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new DeltaVolQuote(cPtr, true);
  }

  public boolean empty() {
    return QuantLibJNI.DeltaVolQuoteHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    long cPtr = QuantLibJNI.DeltaVolQuoteHandle_asObservable(swigCPtr, this);
    return (cPtr == 0) ? null : new Observable(cPtr, true);
  }

  public double value() {
    return QuantLibJNI.DeltaVolQuoteHandle_value(swigCPtr, this);
  }

  public boolean isValid() {
    return QuantLibJNI.DeltaVolQuoteHandle_isValid(swigCPtr, this);
  }

}
