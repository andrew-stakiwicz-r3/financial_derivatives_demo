/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class VannaVolgaIKDoubleBarrierEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected VannaVolgaIKDoubleBarrierEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.VannaVolgaIKDoubleBarrierEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VannaVolgaIKDoubleBarrierEngine obj) {
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
        QuantLibJNI.delete_VannaVolgaIKDoubleBarrierEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VannaVolgaIKDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS, boolean adaptVanDelta, double bsPriceWithSmile, int series) {
    this(QuantLibJNI.new_VannaVolgaIKDoubleBarrierEngine__SWIG_0(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS, adaptVanDelta, bsPriceWithSmile, series), true);
  }

  public VannaVolgaIKDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS, boolean adaptVanDelta, double bsPriceWithSmile) {
    this(QuantLibJNI.new_VannaVolgaIKDoubleBarrierEngine__SWIG_1(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS, adaptVanDelta, bsPriceWithSmile), true);
  }

  public VannaVolgaIKDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS, boolean adaptVanDelta) {
    this(QuantLibJNI.new_VannaVolgaIKDoubleBarrierEngine__SWIG_2(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS, adaptVanDelta), true);
  }

  public VannaVolgaIKDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS) {
    this(QuantLibJNI.new_VannaVolgaIKDoubleBarrierEngine__SWIG_3(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS), true);
  }

}