/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class OvernightIndexedSwap extends Swap {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected OvernightIndexedSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.OvernightIndexedSwap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OvernightIndexedSwap obj) {
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
        QuantLibJNI.delete_OvernightIndexedSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, double nominal, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag, BusinessDayConvention paymentAdjustment, Calendar paymentCalendar, boolean telescopicValueDates) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_0(type.swigValue(), nominal, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag, paymentAdjustment.swigValue(), Calendar.getCPtr(paymentCalendar), paymentCalendar, telescopicValueDates), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, double nominal, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag, BusinessDayConvention paymentAdjustment, Calendar paymentCalendar) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_1(type.swigValue(), nominal, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag, paymentAdjustment.swigValue(), Calendar.getCPtr(paymentCalendar), paymentCalendar), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, double nominal, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag, BusinessDayConvention paymentAdjustment) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_2(type.swigValue(), nominal, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag, paymentAdjustment.swigValue()), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, double nominal, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_3(type.swigValue(), nominal, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, double nominal, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_4(type.swigValue(), nominal, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, double nominal, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_5(type.swigValue(), nominal, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, DoubleVector nominals, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag, BusinessDayConvention paymentAdjustment, Calendar paymentCalendar, boolean telescopicValueDates) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_6(type.swigValue(), DoubleVector.getCPtr(nominals), nominals, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag, paymentAdjustment.swigValue(), Calendar.getCPtr(paymentCalendar), paymentCalendar, telescopicValueDates), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, DoubleVector nominals, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag, BusinessDayConvention paymentAdjustment, Calendar paymentCalendar) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_7(type.swigValue(), DoubleVector.getCPtr(nominals), nominals, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag, paymentAdjustment.swigValue(), Calendar.getCPtr(paymentCalendar), paymentCalendar), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, DoubleVector nominals, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag, BusinessDayConvention paymentAdjustment) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_8(type.swigValue(), DoubleVector.getCPtr(nominals), nominals, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag, paymentAdjustment.swigValue()), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, DoubleVector nominals, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread, long paymentLag) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_9(type.swigValue(), DoubleVector.getCPtr(nominals), nominals, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread, paymentLag), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, DoubleVector nominals, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index, double spread) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_10(type.swigValue(), DoubleVector.getCPtr(nominals), nominals, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index, spread), true);
  }

  public OvernightIndexedSwap(OvernightIndexedSwap.Type type, DoubleVector nominals, Schedule schedule, double fixedRate, DayCounter fixedDC, OvernightIndex index) {
    this(QuantLibJNI.new_OvernightIndexedSwap__SWIG_11(type.swigValue(), DoubleVector.getCPtr(nominals), nominals, Schedule.getCPtr(schedule), schedule, fixedRate, DayCounter.getCPtr(fixedDC), fixedDC, OvernightIndex.getCPtr(index), index), true);
  }

  public double fixedLegBPS() {
    return QuantLibJNI.OvernightIndexedSwap_fixedLegBPS(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.OvernightIndexedSwap_fixedLegNPV(swigCPtr, this);
  }

  public double fairRate() {
    return QuantLibJNI.OvernightIndexedSwap_fairRate(swigCPtr, this);
  }

  public double overnightLegBPS() {
    return QuantLibJNI.OvernightIndexedSwap_overnightLegBPS(swigCPtr, this);
  }

  public double overnightLegNPV() {
    return QuantLibJNI.OvernightIndexedSwap_overnightLegNPV(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.OvernightIndexedSwap_fairSpread(swigCPtr, this);
  }

  public OvernightIndexedSwap.Type type() {
    return OvernightIndexedSwap.Type.swigToEnum(QuantLibJNI.OvernightIndexedSwap_type(swigCPtr, this));
  }

  public double nominal() {
    return QuantLibJNI.OvernightIndexedSwap_nominal(swigCPtr, this);
  }

  public DoubleVector nominals() {
    return new DoubleVector(QuantLibJNI.OvernightIndexedSwap_nominals(swigCPtr, this), true);
  }

  public Frequency paymentFrequency() {
    return Frequency.swigToEnum(QuantLibJNI.OvernightIndexedSwap_paymentFrequency(swigCPtr, this));
  }

  public double fixedRate() {
    return QuantLibJNI.OvernightIndexedSwap_fixedRate(swigCPtr, this);
  }

  public DayCounter fixedDayCount() {
    return new DayCounter(QuantLibJNI.OvernightIndexedSwap_fixedDayCount(swigCPtr, this), false);
  }

  public double spread() {
    return QuantLibJNI.OvernightIndexedSwap_spread(swigCPtr, this);
  }

  public Leg fixedLeg() {
    return new Leg(QuantLibJNI.OvernightIndexedSwap_fixedLeg(swigCPtr, this), false);
  }

  public Leg overnightLeg() {
    return new Leg(QuantLibJNI.OvernightIndexedSwap_overnightLeg(swigCPtr, this), false);
  }

  public final static class Type {
    public final static OvernightIndexedSwap.Type Receiver = new OvernightIndexedSwap.Type("Receiver", QuantLibJNI.OvernightIndexedSwap_Receiver_get());
    public final static OvernightIndexedSwap.Type Payer = new OvernightIndexedSwap.Type("Payer", QuantLibJNI.OvernightIndexedSwap_Payer_get());

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
