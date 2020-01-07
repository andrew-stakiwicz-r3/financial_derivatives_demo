/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PeriodVector extends java.util.AbstractList<Period> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PeriodVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PeriodVector obj) {
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
        QuantLibJNI.delete_PeriodVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PeriodVector(Period[] initialElements) {
    this();
    reserve(initialElements.length);

    for (Period element : initialElements) {
      add(element);
    }
  }

  public PeriodVector(Iterable<Period> initialElements) {
    this();
    for (Period element : initialElements) {
      add(element);
    }
  }

  public Period get(int index) {
    return doGet(index);
  }

  public Period set(int index, Period e) {
    return doSet(index, e);
  }

  public boolean add(Period e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Period e) {
    modCount++;
    doAdd(index, e);
  }

  public Period remove(int index) {
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

  public PeriodVector() {
    this(QuantLibJNI.new_PeriodVector__SWIG_0(), true);
  }

  public PeriodVector(PeriodVector other) {
    this(QuantLibJNI.new_PeriodVector__SWIG_1(PeriodVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.PeriodVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.PeriodVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.PeriodVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.PeriodVector_clear(swigCPtr, this);
  }

  public PeriodVector(int count, Period value) {
    this(QuantLibJNI.new_PeriodVector__SWIG_2(count, Period.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.PeriodVector_doSize(swigCPtr, this);
  }

  private void doAdd(Period x) {
    QuantLibJNI.PeriodVector_doAdd__SWIG_0(swigCPtr, this, Period.getCPtr(x), x);
  }

  private void doAdd(int index, Period x) {
    QuantLibJNI.PeriodVector_doAdd__SWIG_1(swigCPtr, this, index, Period.getCPtr(x), x);
  }

  private Period doRemove(int index) {
    return new Period(QuantLibJNI.PeriodVector_doRemove(swigCPtr, this, index), true);
  }

  private Period doGet(int index) {
    return new Period(QuantLibJNI.PeriodVector_doGet(swigCPtr, this, index), false);
  }

  private Period doSet(int index, Period val) {
    return new Period(QuantLibJNI.PeriodVector_doSet(swigCPtr, this, index, Period.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.PeriodVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
