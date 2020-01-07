/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DoublePairVector extends java.util.AbstractList<DoublePair> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DoublePairVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DoublePairVector obj) {
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
        QuantLibJNI.delete_DoublePairVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoublePairVector(DoublePair[] initialElements) {
    this();
    reserve(initialElements.length);

    for (DoublePair element : initialElements) {
      add(element);
    }
  }

  public DoublePairVector(Iterable<DoublePair> initialElements) {
    this();
    for (DoublePair element : initialElements) {
      add(element);
    }
  }

  public DoublePair get(int index) {
    return doGet(index);
  }

  public DoublePair set(int index, DoublePair e) {
    return doSet(index, e);
  }

  public boolean add(DoublePair e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, DoublePair e) {
    modCount++;
    doAdd(index, e);
  }

  public DoublePair remove(int index) {
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

  public DoublePairVector() {
    this(QuantLibJNI.new_DoublePairVector__SWIG_0(), true);
  }

  public DoublePairVector(DoublePairVector other) {
    this(QuantLibJNI.new_DoublePairVector__SWIG_1(DoublePairVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.DoublePairVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.DoublePairVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.DoublePairVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.DoublePairVector_clear(swigCPtr, this);
  }

  public DoublePairVector(int count, DoublePair value) {
    this(QuantLibJNI.new_DoublePairVector__SWIG_2(count, DoublePair.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.DoublePairVector_doSize(swigCPtr, this);
  }

  private void doAdd(DoublePair x) {
    QuantLibJNI.DoublePairVector_doAdd__SWIG_0(swigCPtr, this, DoublePair.getCPtr(x), x);
  }

  private void doAdd(int index, DoublePair x) {
    QuantLibJNI.DoublePairVector_doAdd__SWIG_1(swigCPtr, this, index, DoublePair.getCPtr(x), x);
  }

  private DoublePair doRemove(int index) {
    return new DoublePair(QuantLibJNI.DoublePairVector_doRemove(swigCPtr, this, index), true);
  }

  private DoublePair doGet(int index) {
    return new DoublePair(QuantLibJNI.DoublePairVector_doGet(swigCPtr, this, index), false);
  }

  private DoublePair doSet(int index, DoublePair val) {
    return new DoublePair(QuantLibJNI.DoublePairVector_doSet(swigCPtr, this, index, DoublePair.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.DoublePairVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
