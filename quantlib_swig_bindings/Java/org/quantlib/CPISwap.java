/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CPISwap extends Swap {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CPISwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CPISwap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CPISwap obj) {
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
        QuantLibJNI.delete_CPISwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CPISwap(CPISwap.Type type, double nominal, boolean subtractInflationNominal, double spread, DayCounter floatDayCount, Schedule floatSchedule, BusinessDayConvention floatRoll, long fixingDays, IborIndex floatIndex, double fixedRate, double baseCPI, DayCounter fixedDayCount, Schedule fixedSchedule, BusinessDayConvention fixedRoll, Period observationLag, ZeroInflationIndex fixedIndex, CPI.InterpolationType observationInterpolation, double inflationNominal) {
    this(QuantLibJNI.new_CPISwap__SWIG_0(type.swigValue(), nominal, subtractInflationNominal, spread, DayCounter.getCPtr(floatDayCount), floatDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, floatRoll.swigValue(), fixingDays, IborIndex.getCPtr(floatIndex), floatIndex, fixedRate, baseCPI, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRoll.swigValue(), Period.getCPtr(observationLag), observationLag, ZeroInflationIndex.getCPtr(fixedIndex), fixedIndex, observationInterpolation.swigValue(), inflationNominal), true);
  }

  public CPISwap(CPISwap.Type type, double nominal, boolean subtractInflationNominal, double spread, DayCounter floatDayCount, Schedule floatSchedule, BusinessDayConvention floatRoll, long fixingDays, IborIndex floatIndex, double fixedRate, double baseCPI, DayCounter fixedDayCount, Schedule fixedSchedule, BusinessDayConvention fixedRoll, Period observationLag, ZeroInflationIndex fixedIndex, CPI.InterpolationType observationInterpolation) {
    this(QuantLibJNI.new_CPISwap__SWIG_1(type.swigValue(), nominal, subtractInflationNominal, spread, DayCounter.getCPtr(floatDayCount), floatDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, floatRoll.swigValue(), fixingDays, IborIndex.getCPtr(floatIndex), floatIndex, fixedRate, baseCPI, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRoll.swigValue(), Period.getCPtr(observationLag), observationLag, ZeroInflationIndex.getCPtr(fixedIndex), fixedIndex, observationInterpolation.swigValue()), true);
  }

  public CPISwap(CPISwap.Type type, double nominal, boolean subtractInflationNominal, double spread, DayCounter floatDayCount, Schedule floatSchedule, BusinessDayConvention floatRoll, long fixingDays, IborIndex floatIndex, double fixedRate, double baseCPI, DayCounter fixedDayCount, Schedule fixedSchedule, BusinessDayConvention fixedRoll, Period observationLag, ZeroInflationIndex fixedIndex) {
    this(QuantLibJNI.new_CPISwap__SWIG_2(type.swigValue(), nominal, subtractInflationNominal, spread, DayCounter.getCPtr(floatDayCount), floatDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, floatRoll.swigValue(), fixingDays, IborIndex.getCPtr(floatIndex), floatIndex, fixedRate, baseCPI, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRoll.swigValue(), Period.getCPtr(observationLag), observationLag, ZeroInflationIndex.getCPtr(fixedIndex), fixedIndex), true);
  }

  public double fairRate() {
    return QuantLibJNI.CPISwap_fairRate(swigCPtr, this);
  }

  public double floatLegNPV() {
    return QuantLibJNI.CPISwap_floatLegNPV(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.CPISwap_fairSpread(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.CPISwap_fixedLegNPV(swigCPtr, this);
  }

  public Leg cpiLeg() {
    return new Leg(QuantLibJNI.CPISwap_cpiLeg(swigCPtr, this), false);
  }

  public Leg floatLeg() {
    return new Leg(QuantLibJNI.CPISwap_floatLeg(swigCPtr, this), false);
  }

  public final static class Type {
    public final static CPISwap.Type Receiver = new CPISwap.Type("Receiver", QuantLibJNI.CPISwap_Receiver_get());
    public final static CPISwap.Type Payer = new CPISwap.Type("Payer", QuantLibJNI.CPISwap_Payer_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { Receiver, Payer };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}