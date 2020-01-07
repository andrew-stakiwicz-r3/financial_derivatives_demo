/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZeroHelperVector extends java.util.AbstractList<ZeroHelper> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ZeroHelperVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroHelperVector obj) {
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
        QuantLibJNI.delete_ZeroHelperVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ZeroHelperVector(ZeroHelper[] initialElements) {
    this();
    reserve(initialElements.length);

    for (ZeroHelper element : initialElements) {
      add(element);
    }
  }

  public ZeroHelperVector(Iterable<ZeroHelper> initialElements) {
    this();
    for (ZeroHelper element : initialElements) {
      add(element);
    }
  }

  public ZeroHelper get(int index) {
    return doGet(index);
  }

  public ZeroHelper set(int index, ZeroHelper e) {
    return doSet(index, e);
  }

  public boolean add(ZeroHelper e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, ZeroHelper e) {
    modCount++;
    doAdd(index, e);
  }

  public ZeroHelper remove(int index) {
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

  public ZeroHelperVector() {
    this(QuantLibJNI.new_ZeroHelperVector__SWIG_0(), true);
  }

  public ZeroHelperVector(ZeroHelperVector other) {
    this(QuantLibJNI.new_ZeroHelperVector__SWIG_1(ZeroHelperVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.ZeroHelperVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.ZeroHelperVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.ZeroHelperVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.ZeroHelperVector_clear(swigCPtr, this);
  }

  public ZeroHelperVector(int count, ZeroHelper value) {
    this(QuantLibJNI.new_ZeroHelperVector__SWIG_2(count, ZeroHelper.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.ZeroHelperVector_doSize(swigCPtr, this);
  }

  private void doAdd(ZeroHelper x) {
    QuantLibJNI.ZeroHelperVector_doAdd__SWIG_0(swigCPtr, this, ZeroHelper.getCPtr(x), x);
  }

  private void doAdd(int index, ZeroHelper x) {
    QuantLibJNI.ZeroHelperVector_doAdd__SWIG_1(swigCPtr, this, index, ZeroHelper.getCPtr(x), x);
  }

  private ZeroHelper doRemove(int index) {
    long cPtr = QuantLibJNI.ZeroHelperVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new ZeroHelper(cPtr, true);
  }

  private ZeroHelper doGet(int index) {
    long cPtr = QuantLibJNI.ZeroHelperVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new ZeroHelper(cPtr, true);
  }

  private ZeroHelper doSet(int index, ZeroHelper val) {
    long cPtr = QuantLibJNI.ZeroHelperVector_doSet(swigCPtr, this, index, ZeroHelper.getCPtr(val), val);
    return (cPtr == 0) ? null : new ZeroHelper(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.ZeroHelperVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}