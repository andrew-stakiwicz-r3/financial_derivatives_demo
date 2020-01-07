/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FaceValueClaim extends Claim {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FaceValueClaim(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FaceValueClaim_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FaceValueClaim obj) {
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
        QuantLibJNI.delete_FaceValueClaim(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FaceValueClaim() {
    this(QuantLibJNI.new_FaceValueClaim(), true);
  }

}