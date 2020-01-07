/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SpreadedBackwardFlatZeroInterpolatedTermStructure extends YieldTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SpreadedBackwardFlatZeroInterpolatedTermStructure(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SpreadedBackwardFlatZeroInterpolatedTermStructure_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpreadedBackwardFlatZeroInterpolatedTermStructure obj) {
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
        QuantLibJNI.delete_SpreadedBackwardFlatZeroInterpolatedTermStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SpreadedBackwardFlatZeroInterpolatedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandleVector spreadHandles, DateVector dates, Compounding comp, Frequency freq, DayCounter dc, BackwardFlat factory) {
    this(QuantLibJNI.new_SpreadedBackwardFlatZeroInterpolatedTermStructure__SWIG_0(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandleVector.getCPtr(spreadHandles), spreadHandles, DateVector.getCPtr(dates), dates, comp.swigValue(), freq.swigValue(), DayCounter.getCPtr(dc), dc, BackwardFlat.getCPtr(factory), factory), true);
  }

  public SpreadedBackwardFlatZeroInterpolatedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandleVector spreadHandles, DateVector dates, Compounding comp, Frequency freq, DayCounter dc) {
    this(QuantLibJNI.new_SpreadedBackwardFlatZeroInterpolatedTermStructure__SWIG_1(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandleVector.getCPtr(spreadHandles), spreadHandles, DateVector.getCPtr(dates), dates, comp.swigValue(), freq.swigValue(), DayCounter.getCPtr(dc), dc), true);
  }

  public SpreadedBackwardFlatZeroInterpolatedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandleVector spreadHandles, DateVector dates, Compounding comp, Frequency freq) {
    this(QuantLibJNI.new_SpreadedBackwardFlatZeroInterpolatedTermStructure__SWIG_2(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandleVector.getCPtr(spreadHandles), spreadHandles, DateVector.getCPtr(dates), dates, comp.swigValue(), freq.swigValue()), true);
  }

  public SpreadedBackwardFlatZeroInterpolatedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandleVector spreadHandles, DateVector dates, Compounding comp) {
    this(QuantLibJNI.new_SpreadedBackwardFlatZeroInterpolatedTermStructure__SWIG_3(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandleVector.getCPtr(spreadHandles), spreadHandles, DateVector.getCPtr(dates), dates, comp.swigValue()), true);
  }

  public SpreadedBackwardFlatZeroInterpolatedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandleVector spreadHandles, DateVector dates) {
    this(QuantLibJNI.new_SpreadedBackwardFlatZeroInterpolatedTermStructure__SWIG_4(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandleVector.getCPtr(spreadHandles), spreadHandles, DateVector.getCPtr(dates), dates), true);
  }

}
