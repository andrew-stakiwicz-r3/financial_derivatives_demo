/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmSquareRootFwdOp {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FdmSquareRootFwdOp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmSquareRootFwdOp obj) {
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
        QuantLibJNI.delete_FdmSquareRootFwdOp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public final static class TransformationType {
    public final static FdmSquareRootFwdOp.TransformationType Plain = new FdmSquareRootFwdOp.TransformationType("Plain");
    public final static FdmSquareRootFwdOp.TransformationType Power = new FdmSquareRootFwdOp.TransformationType("Power");
    public final static FdmSquareRootFwdOp.TransformationType Log = new FdmSquareRootFwdOp.TransformationType("Log");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static TransformationType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + TransformationType.class + " with value " + swigValue);
    }

    private TransformationType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private TransformationType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private TransformationType(String swigName, TransformationType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static TransformationType[] swigValues = { Plain, Power, Log };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
