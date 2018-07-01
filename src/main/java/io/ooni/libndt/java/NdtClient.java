/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.libndt.java;

public class NdtClient {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NdtClient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NdtClient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NdtLibraryJNI.delete_NdtClient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    NdtLibraryJNI.NdtClient_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    NdtLibraryJNI.NdtClient_change_ownership(this, swigCPtr, true);
  }

  public NdtClient() {
    this(NdtLibraryJNI.new_NdtClient__SWIG_0(), true);
    NdtLibraryJNI.NdtClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public NdtClient(NdtSettings settings) {
    this(NdtLibraryJNI.new_NdtClient__SWIG_1(NdtSettings.getCPtr(settings), settings), true);
    NdtLibraryJNI.NdtClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean run() {
    return NdtLibraryJNI.NdtClient_run(swigCPtr, this);
  }

  public void onWarning(String s) {
    if (getClass() == NdtClient.class) NdtLibraryJNI.NdtClient_onWarning(swigCPtr, this, s); else NdtLibraryJNI.NdtClient_onWarningSwigExplicitNdtClient(swigCPtr, this, s);
  }

  public void onInfo(String s) {
    if (getClass() == NdtClient.class) NdtLibraryJNI.NdtClient_onInfo(swigCPtr, this, s); else NdtLibraryJNI.NdtClient_onInfoSwigExplicitNdtClient(swigCPtr, this, s);
  }

  public void onDebug(String s) {
    if (getClass() == NdtClient.class) NdtLibraryJNI.NdtClient_onDebug(swigCPtr, this, s); else NdtLibraryJNI.NdtClient_onDebugSwigExplicitNdtClient(swigCPtr, this, s);
  }

  public void onPerformance(short tid, short nflows, double measured_bytes, double measurement_interval, double elapsed, double max_runtime) {
    if (getClass() == NdtClient.class) NdtLibraryJNI.NdtClient_onPerformance(swigCPtr, this, tid, nflows, measured_bytes, measurement_interval, elapsed, max_runtime); else NdtLibraryJNI.NdtClient_onPerformanceSwigExplicitNdtClient(swigCPtr, this, tid, nflows, measured_bytes, measurement_interval, elapsed, max_runtime);
  }

  public void onResult(String scope, String name, String value) {
    if (getClass() == NdtClient.class) NdtLibraryJNI.NdtClient_onResult(swigCPtr, this, scope, name, value); else NdtLibraryJNI.NdtClient_onResultSwigExplicitNdtClient(swigCPtr, this, scope, name, value);
  }

  public void onServerBusy(String msg) {
    if (getClass() == NdtClient.class) NdtLibraryJNI.NdtClient_onServerBusy(swigCPtr, this, msg); else NdtLibraryJNI.NdtClient_onServerBusySwigExplicitNdtClient(swigCPtr, this, msg);
  }

}
