/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcMarketDataAveragePriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataAveragePriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataAveragePriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcMarketDataAveragePriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAveragePrice(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataAveragePriceField_AveragePrice_set(swigCPtr, this, value);
  }

  public double getAveragePrice() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataAveragePriceField_AveragePrice_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataAveragePriceField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcMarketDataAveragePriceField(), true);
  }

}
