/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InterestRateVector extends java.util.AbstractList<InterestRate> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InterestRateVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InterestRateVector obj) {
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
        QuantLibJNI.delete_InterestRateVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InterestRateVector(InterestRate[] initialElements) {
    this();
    reserve(initialElements.length);

    for (InterestRate element : initialElements) {
      add(element);
    }
  }

  public InterestRateVector(Iterable<InterestRate> initialElements) {
    this();
    for (InterestRate element : initialElements) {
      add(element);
    }
  }

  public InterestRate get(int index) {
    return doGet(index);
  }

  public InterestRate set(int index, InterestRate e) {
    return doSet(index, e);
  }

  public boolean add(InterestRate e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, InterestRate e) {
    modCount++;
    doAdd(index, e);
  }

  public InterestRate remove(int index) {
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

  public InterestRateVector() {
    this(QuantLibJNI.new_InterestRateVector__SWIG_0(), true);
  }

  public InterestRateVector(InterestRateVector other) {
    this(QuantLibJNI.new_InterestRateVector__SWIG_1(InterestRateVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.InterestRateVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.InterestRateVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.InterestRateVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.InterestRateVector_clear(swigCPtr, this);
  }

  public InterestRateVector(int count, InterestRate value) {
    this(QuantLibJNI.new_InterestRateVector__SWIG_2(count, InterestRate.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.InterestRateVector_doSize(swigCPtr, this);
  }

  private void doAdd(InterestRate x) {
    QuantLibJNI.InterestRateVector_doAdd__SWIG_0(swigCPtr, this, InterestRate.getCPtr(x), x);
  }

  private void doAdd(int index, InterestRate x) {
    QuantLibJNI.InterestRateVector_doAdd__SWIG_1(swigCPtr, this, index, InterestRate.getCPtr(x), x);
  }

  private InterestRate doRemove(int index) {
    return new InterestRate(QuantLibJNI.InterestRateVector_doRemove(swigCPtr, this, index), true);
  }

  private InterestRate doGet(int index) {
    return new InterestRate(QuantLibJNI.InterestRateVector_doGet(swigCPtr, this, index), false);
  }

  private InterestRate doSet(int index, InterestRate val) {
    return new InterestRate(QuantLibJNI.InterestRateVector_doSet(swigCPtr, this, index, InterestRate.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.InterestRateVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
