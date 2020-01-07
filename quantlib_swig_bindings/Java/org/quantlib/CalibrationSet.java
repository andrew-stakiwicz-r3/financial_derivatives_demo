/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CalibrationSet extends java.util.AbstractList<CalibrationPair> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CalibrationSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CalibrationSet obj) {
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
        QuantLibJNI.delete_CalibrationSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CalibrationSet(CalibrationPair[] initialElements) {
    this();
    reserve(initialElements.length);

    for (CalibrationPair element : initialElements) {
      add(element);
    }
  }

  public CalibrationSet(Iterable<CalibrationPair> initialElements) {
    this();
    for (CalibrationPair element : initialElements) {
      add(element);
    }
  }

  public CalibrationPair get(int index) {
    return doGet(index);
  }

  public CalibrationPair set(int index, CalibrationPair e) {
    return doSet(index, e);
  }

  public boolean add(CalibrationPair e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, CalibrationPair e) {
    modCount++;
    doAdd(index, e);
  }

  public CalibrationPair remove(int index) {
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

  public CalibrationSet() {
    this(QuantLibJNI.new_CalibrationSet__SWIG_0(), true);
  }

  public CalibrationSet(CalibrationSet other) {
    this(QuantLibJNI.new_CalibrationSet__SWIG_1(CalibrationSet.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.CalibrationSet_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.CalibrationSet_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.CalibrationSet_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.CalibrationSet_clear(swigCPtr, this);
  }

  public CalibrationSet(int count, CalibrationPair value) {
    this(QuantLibJNI.new_CalibrationSet__SWIG_2(count, CalibrationPair.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.CalibrationSet_doSize(swigCPtr, this);
  }

  private void doAdd(CalibrationPair x) {
    QuantLibJNI.CalibrationSet_doAdd__SWIG_0(swigCPtr, this, CalibrationPair.getCPtr(x), x);
  }

  private void doAdd(int index, CalibrationPair x) {
    QuantLibJNI.CalibrationSet_doAdd__SWIG_1(swigCPtr, this, index, CalibrationPair.getCPtr(x), x);
  }

  private CalibrationPair doRemove(int index) {
    return new CalibrationPair(QuantLibJNI.CalibrationSet_doRemove(swigCPtr, this, index), true);
  }

  private CalibrationPair doGet(int index) {
    return new CalibrationPair(QuantLibJNI.CalibrationSet_doGet(swigCPtr, this, index), false);
  }

  private CalibrationPair doSet(int index, CalibrationPair val) {
    return new CalibrationPair(QuantLibJNI.CalibrationSet_doSet(swigCPtr, this, index, CalibrationPair.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.CalibrationSet_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
