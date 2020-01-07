/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FlatSmileSection extends SmileSection {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FlatSmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FlatSmileSection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FlatSmileSection obj) {
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
        QuantLibJNI.delete_FlatSmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FlatSmileSection(Date d, double vol, DayCounter dc, Date referenceDate, double atmLevel, VolatilityType type, double shift) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_0(Date.getCPtr(d), d, vol, DayCounter.getCPtr(dc), dc, Date.getCPtr(referenceDate), referenceDate, atmLevel, type.swigValue(), shift), true);
  }

  public FlatSmileSection(Date d, double vol, DayCounter dc, Date referenceDate, double atmLevel, VolatilityType type) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_1(Date.getCPtr(d), d, vol, DayCounter.getCPtr(dc), dc, Date.getCPtr(referenceDate), referenceDate, atmLevel, type.swigValue()), true);
  }

  public FlatSmileSection(Date d, double vol, DayCounter dc, Date referenceDate, double atmLevel) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_2(Date.getCPtr(d), d, vol, DayCounter.getCPtr(dc), dc, Date.getCPtr(referenceDate), referenceDate, atmLevel), true);
  }

  public FlatSmileSection(Date d, double vol, DayCounter dc, Date referenceDate) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_3(Date.getCPtr(d), d, vol, DayCounter.getCPtr(dc), dc, Date.getCPtr(referenceDate), referenceDate), true);
  }

  public FlatSmileSection(Date d, double vol, DayCounter dc) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_4(Date.getCPtr(d), d, vol, DayCounter.getCPtr(dc), dc), true);
  }

  public FlatSmileSection(double exerciseTime, double vol, DayCounter dc, double atmLevel, VolatilityType type, double shift) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_5(exerciseTime, vol, DayCounter.getCPtr(dc), dc, atmLevel, type.swigValue(), shift), true);
  }

  public FlatSmileSection(double exerciseTime, double vol, DayCounter dc, double atmLevel, VolatilityType type) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_6(exerciseTime, vol, DayCounter.getCPtr(dc), dc, atmLevel, type.swigValue()), true);
  }

  public FlatSmileSection(double exerciseTime, double vol, DayCounter dc, double atmLevel) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_7(exerciseTime, vol, DayCounter.getCPtr(dc), dc, atmLevel), true);
  }

  public FlatSmileSection(double exerciseTime, double vol, DayCounter dc) {
    this(QuantLibJNI.new_FlatSmileSection__SWIG_8(exerciseTime, vol, DayCounter.getCPtr(dc), dc), true);
  }

}
