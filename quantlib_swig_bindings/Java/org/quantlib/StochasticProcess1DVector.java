/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class StochasticProcess1DVector extends java.util.AbstractList<StochasticProcess1D> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StochasticProcess1DVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StochasticProcess1DVector obj) {
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
        QuantLibJNI.delete_StochasticProcess1DVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StochasticProcess1DVector(StochasticProcess1D[] initialElements) {
    this();
    reserve(initialElements.length);

    for (StochasticProcess1D element : initialElements) {
      add(element);
    }
  }

  public StochasticProcess1DVector(Iterable<StochasticProcess1D> initialElements) {
    this();
    for (StochasticProcess1D element : initialElements) {
      add(element);
    }
  }

  public StochasticProcess1D get(int index) {
    return doGet(index);
  }

  public StochasticProcess1D set(int index, StochasticProcess1D e) {
    return doSet(index, e);
  }

  public boolean add(StochasticProcess1D e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, StochasticProcess1D e) {
    modCount++;
    doAdd(index, e);
  }

  public StochasticProcess1D remove(int index) {
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

  public StochasticProcess1DVector() {
    this(QuantLibJNI.new_StochasticProcess1DVector__SWIG_0(), true);
  }

  public StochasticProcess1DVector(StochasticProcess1DVector other) {
    this(QuantLibJNI.new_StochasticProcess1DVector__SWIG_1(StochasticProcess1DVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.StochasticProcess1DVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.StochasticProcess1DVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.StochasticProcess1DVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.StochasticProcess1DVector_clear(swigCPtr, this);
  }

  public StochasticProcess1DVector(int count, StochasticProcess1D value) {
    this(QuantLibJNI.new_StochasticProcess1DVector__SWIG_2(count, StochasticProcess1D.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.StochasticProcess1DVector_doSize(swigCPtr, this);
  }

  private void doAdd(StochasticProcess1D x) {
    QuantLibJNI.StochasticProcess1DVector_doAdd__SWIG_0(swigCPtr, this, StochasticProcess1D.getCPtr(x), x);
  }

  private void doAdd(int index, StochasticProcess1D x) {
    QuantLibJNI.StochasticProcess1DVector_doAdd__SWIG_1(swigCPtr, this, index, StochasticProcess1D.getCPtr(x), x);
  }

  private StochasticProcess1D doRemove(int index) {
    long cPtr = QuantLibJNI.StochasticProcess1DVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new StochasticProcess1D(cPtr, true);
  }

  private StochasticProcess1D doGet(int index) {
    long cPtr = QuantLibJNI.StochasticProcess1DVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new StochasticProcess1D(cPtr, true);
  }

  private StochasticProcess1D doSet(int index, StochasticProcess1D val) {
    long cPtr = QuantLibJNI.StochasticProcess1DVector_doSet(swigCPtr, this, index, StochasticProcess1D.getCPtr(val), val);
    return (cPtr == 0) ? null : new StochasticProcess1D(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.StochasticProcess1DVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}