/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FloatingRateBond extends Bond {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FloatingRateBond(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FloatingRateBond_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FloatingRateBond obj) {
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
        QuantLibJNI.delete_FloatingRateBond(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, double redemption, Date issueDate) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_0(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, redemption, Date.getCPtr(issueDate), issueDate), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, double redemption) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_1(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, redemption), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_2(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_3(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_4(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_5(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_6(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_7(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_8(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue()), true);
  }

  public FloatingRateBond(long settlementDays, double faceAmount, Schedule schedule, IborIndex index, DayCounter paymentDayCounter) {
    this(QuantLibJNI.new_FloatingRateBond__SWIG_9(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter), true);
  }

}
