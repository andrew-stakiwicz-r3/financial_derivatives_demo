/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableCapFloorTermVolatilityStructureHandle extends CapFloorTermVolatilityStructureHandle {
  private transient long swigCPtr;

  protected RelinkableCapFloorTermVolatilityStructureHandle(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableCapFloorTermVolatilityStructureHandle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableCapFloorTermVolatilityStructureHandle obj) {
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
        QuantLibJNI.delete_RelinkableCapFloorTermVolatilityStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableCapFloorTermVolatilityStructureHandle(CapFloorTermVolatilityStructure arg0) {
    this(QuantLibJNI.new_RelinkableCapFloorTermVolatilityStructureHandle__SWIG_0(CapFloorTermVolatilityStructure.getCPtr(arg0), arg0), true);
  }

  public RelinkableCapFloorTermVolatilityStructureHandle() {
    this(QuantLibJNI.new_RelinkableCapFloorTermVolatilityStructureHandle__SWIG_1(), true);
  }

  public void linkTo(CapFloorTermVolatilityStructure arg0) {
    QuantLibJNI.RelinkableCapFloorTermVolatilityStructureHandle_linkTo(swigCPtr, this, CapFloorTermVolatilityStructure.getCPtr(arg0), arg0);
  }

  public void reset() {
    QuantLibJNI.RelinkableCapFloorTermVolatilityStructureHandle_reset(swigCPtr, this);
  }

}
