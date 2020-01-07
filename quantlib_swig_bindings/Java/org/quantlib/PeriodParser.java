/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PeriodParser {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PeriodParser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PeriodParser obj) {
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
        QuantLibJNI.delete_PeriodParser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static Period parse(String str) {
    return new Period(QuantLibJNI.PeriodParser_parse(str), true);
  }

  public PeriodParser() {
    this(QuantLibJNI.new_PeriodParser(), true);
  }

}
