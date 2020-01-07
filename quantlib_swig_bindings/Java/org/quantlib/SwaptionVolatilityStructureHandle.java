/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SwaptionVolatilityStructureHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SwaptionVolatilityStructureHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwaptionVolatilityStructureHandle obj) {
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
        QuantLibJNI.delete_SwaptionVolatilityStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SwaptionVolatilityStructureHandle(SwaptionVolatilityStructure arg0) {
    this(QuantLibJNI.new_SwaptionVolatilityStructureHandle__SWIG_0(SwaptionVolatilityStructure.getCPtr(arg0), arg0), true);
  }

  public SwaptionVolatilityStructureHandle() {
    this(QuantLibJNI.new_SwaptionVolatilityStructureHandle__SWIG_1(), true);
  }

  public SwaptionVolatilityStructure __deref__() {
    long cPtr = QuantLibJNI.SwaptionVolatilityStructureHandle___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SwaptionVolatilityStructure(cPtr, true);
  }

  public boolean empty() {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    long cPtr = QuantLibJNI.SwaptionVolatilityStructureHandle_asObservable(swigCPtr, this);
    return (cPtr == 0) ? null : new Observable(cPtr, true);
  }

  public double volatility(Date start, Period length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_volatility__SWIG_0(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike, extrapolate);
  }

  public double volatility(Date start, Period length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_volatility__SWIG_1(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike);
  }

  public double volatility(double start, double length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_volatility__SWIG_2(swigCPtr, this, start, length, strike, extrapolate);
  }

  public double volatility(double start, double length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_volatility__SWIG_3(swigCPtr, this, start, length, strike);
  }

  public double blackVariance(Date start, Period length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_blackVariance__SWIG_0(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike, extrapolate);
  }

  public double blackVariance(Date start, Period length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_blackVariance__SWIG_1(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike);
  }

  public double blackVariance(double start, double length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_blackVariance__SWIG_2(swigCPtr, this, start, length, strike, extrapolate);
  }

  public double blackVariance(double start, double length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_blackVariance__SWIG_3(swigCPtr, this, start, length, strike);
  }

  public Date optionDateFromTenor(Period p) {
    return new Date(QuantLibJNI.SwaptionVolatilityStructureHandle_optionDateFromTenor(swigCPtr, this, Period.getCPtr(p), p), true);
  }

  public double minStrike() {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_minStrike(swigCPtr, this);
  }

  public double maxStrike() {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_maxStrike(swigCPtr, this);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.SwaptionVolatilityStructureHandle_dayCounter(swigCPtr, this), true);
  }

  public double timeFromReference(Date date) {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_timeFromReference(swigCPtr, this, Date.getCPtr(date), date);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.SwaptionVolatilityStructureHandle_calendar(swigCPtr, this), true);
  }

  public Date referenceDate() {
    return new Date(QuantLibJNI.SwaptionVolatilityStructureHandle_referenceDate(swigCPtr, this), true);
  }

  public Date maxDate() {
    return new Date(QuantLibJNI.SwaptionVolatilityStructureHandle_maxDate(swigCPtr, this), true);
  }

  public double maxTime() {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_maxTime(swigCPtr, this);
  }

  public void enableExtrapolation() {
    QuantLibJNI.SwaptionVolatilityStructureHandle_enableExtrapolation(swigCPtr, this);
  }

  public void disableExtrapolation() {
    QuantLibJNI.SwaptionVolatilityStructureHandle_disableExtrapolation(swigCPtr, this);
  }

  public boolean allowsExtrapolation() {
    return QuantLibJNI.SwaptionVolatilityStructureHandle_allowsExtrapolation(swigCPtr, this);
  }

}