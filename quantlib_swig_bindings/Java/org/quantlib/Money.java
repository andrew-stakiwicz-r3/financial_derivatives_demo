/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Money {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Money(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Money obj) {
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
        QuantLibJNI.delete_Money(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Money(Currency currency, double value) {
    this(QuantLibJNI.new_Money__SWIG_0(Currency.getCPtr(currency), currency, value), true);
  }

  public Money(double value, Currency currency) {
    this(QuantLibJNI.new_Money__SWIG_1(value, Currency.getCPtr(currency), currency), true);
  }

  public Currency currency() {
    return new Currency(QuantLibJNI.Money_currency(swigCPtr, this), false);
  }

  public double value() {
    return QuantLibJNI.Money_value(swigCPtr, this);
  }

  public Money rounded() {
    return new Money(QuantLibJNI.Money_rounded(swigCPtr, this), true);
  }

  public Money add() {
    return new Money(QuantLibJNI.Money_add__SWIG_0(swigCPtr, this), true);
  }

  public Money subtract() {
    return new Money(QuantLibJNI.Money_subtract__SWIG_0(swigCPtr, this), true);
  }

  public Money add(Money m) {
    return new Money(QuantLibJNI.Money_add__SWIG_1(swigCPtr, this, Money.getCPtr(m), m), true);
  }

  public Money subtract(Money m) {
    return new Money(QuantLibJNI.Money_subtract__SWIG_1(swigCPtr, this, Money.getCPtr(m), m), true);
  }

  public Money multiply(double x) {
    return new Money(QuantLibJNI.Money_multiply(swigCPtr, this, x), true);
  }

  public Money divide(double x) {
    return new Money(QuantLibJNI.Money_divide__SWIG_0(swigCPtr, this, x), true);
  }

  public double divide(Money m) {
    return QuantLibJNI.Money_divide__SWIG_1(swigCPtr, this, Money.getCPtr(m), m);
  }

  public int compare(Money other) {
    return QuantLibJNI.Money_compare(swigCPtr, this, Money.getCPtr(other), other);
  }

  public String toString() {
    return QuantLibJNI.Money_toString(swigCPtr, this);
  }

  public static void setConversionType(Money.ConversionType type) {
    QuantLibJNI.Money_setConversionType(type.swigValue());
  }

  public static void setBaseCurrency(Currency c) {
    QuantLibJNI.Money_setBaseCurrency(Currency.getCPtr(c), c);
  }

  public final static class ConversionType {
    public final static Money.ConversionType NoConversion = new Money.ConversionType("NoConversion");
    public final static Money.ConversionType BaseCurrencyConversion = new Money.ConversionType("BaseCurrencyConversion");
    public final static Money.ConversionType AutomatedConversion = new Money.ConversionType("AutomatedConversion");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ConversionType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ConversionType.class + " with value " + swigValue);
    }

    private ConversionType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ConversionType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ConversionType(String swigName, ConversionType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ConversionType[] swigValues = { NoConversion, BaseCurrencyConversion, AutomatedConversion };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
