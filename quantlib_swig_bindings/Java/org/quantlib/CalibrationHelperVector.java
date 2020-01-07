/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CalibrationHelperVector extends java.util.AbstractList<CalibrationHelperBase> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CalibrationHelperVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CalibrationHelperVector obj) {
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
        QuantLibJNI.delete_CalibrationHelperVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CalibrationHelperVector(CalibrationHelperBase[] initialElements) {
    this();
    reserve(initialElements.length);

    for (CalibrationHelperBase element : initialElements) {
      add(element);
    }
  }

  public CalibrationHelperVector(Iterable<CalibrationHelperBase> initialElements) {
    this();
    for (CalibrationHelperBase element : initialElements) {
      add(element);
    }
  }

  public CalibrationHelperBase get(int index) {
    return doGet(index);
  }

  public CalibrationHelperBase set(int index, CalibrationHelperBase e) {
    return doSet(index, e);
  }

  public boolean add(CalibrationHelperBase e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, CalibrationHelperBase e) {
    modCount++;
    doAdd(index, e);
  }

  public CalibrationHelperBase remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public CalibrationHelperVector() {
    this(QuantLibJNI.new_CalibrationHelperVector__SWIG_0(), true);
  }

  public CalibrationHelperVector(CalibrationHelperVector other) {
    this(QuantLibJNI.new_CalibrationHelperVector__SWIG_1(CalibrationHelperVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.CalibrationHelperVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.CalibrationHelperVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.CalibrationHelperVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.CalibrationHelperVector_clear(swigCPtr, this);
  }

  public CalibrationHelperVector(int count, CalibrationHelperBase value) {
    this(QuantLibJNI.new_CalibrationHelperVector__SWIG_2(count, CalibrationHelperBase.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.CalibrationHelperVector_doSize(swigCPtr, this);
  }

  private void doAdd(CalibrationHelperBase x) {
    QuantLibJNI.CalibrationHelperVector_doAdd__SWIG_0(swigCPtr, this, CalibrationHelperBase.getCPtr(x), x);
  }

  private void doAdd(int index, CalibrationHelperBase x) {
    QuantLibJNI.CalibrationHelperVector_doAdd__SWIG_1(swigCPtr, this, index, CalibrationHelperBase.getCPtr(x), x);
  }

  private CalibrationHelperBase doRemove(int index) {
    long cPtr = QuantLibJNI.CalibrationHelperVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CalibrationHelperBase(cPtr, true);
  }

  private CalibrationHelperBase doGet(int index) {
    long cPtr = QuantLibJNI.CalibrationHelperVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CalibrationHelperBase(cPtr, true);
  }

  private CalibrationHelperBase doSet(int index, CalibrationHelperBase val) {
    long cPtr = QuantLibJNI.CalibrationHelperVector_doSet(swigCPtr, this, index, CalibrationHelperBase.getCPtr(val), val);
    return (cPtr == 0) ? null : new CalibrationHelperBase(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.CalibrationHelperVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
