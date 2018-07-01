/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.libndt.java;

public class NdtLibraryJNI {
  public final static native long versionMajor_get();
  public final static native long versionMinor_get();
  public final static native long versionPatch_get();
  public final static native short nettestFlagUpload_get();
  public final static native short nettestFlagDownload_get();
  public final static native short nettestFlagDownloadExt_get();
  public final static native long verbosityQuiet_get();
  public final static native long verbosityWarning_get();
  public final static native long verbosityInfo_get();
  public final static native long verbosityDebug_get();
  public final static native long protocolFlagJson_get();
  public final static native long protocolFlagTls_get();
  public final static native long protocolFlagWebsockets_get();
  public final static native void NdtSettings_mlabnsUrl_set(long jarg1, NdtSettings jarg1_, String jarg2);
  public final static native String NdtSettings_mlabnsUrl_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_timeout_set(long jarg1, NdtSettings jarg1_, int jarg2);
  public final static native int NdtSettings_timeout_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_hostname_set(long jarg1, NdtSettings jarg1_, String jarg2);
  public final static native String NdtSettings_hostname_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_port_set(long jarg1, NdtSettings jarg1_, String jarg2);
  public final static native String NdtSettings_port_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_nettestFlags_set(long jarg1, NdtSettings jarg1_, short jarg2);
  public final static native short NdtSettings_nettestFlags_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_verbosity_set(long jarg1, NdtSettings jarg1_, long jarg2);
  public final static native long NdtSettings_verbosity_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_protocolFlags_set(long jarg1, NdtSettings jarg1_, long jarg2);
  public final static native long NdtSettings_protocolFlags_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_maxRuntime_set(long jarg1, NdtSettings jarg1_, int jarg2);
  public final static native int NdtSettings_maxRuntime_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_socks5hPort_set(long jarg1, NdtSettings jarg1_, String jarg2);
  public final static native String NdtSettings_socks5hPort_get(long jarg1, NdtSettings jarg1_);
  public final static native void NdtSettings_addMetadata(long jarg1, NdtSettings jarg1_, String jarg2, String jarg3);
  public final static native long new_NdtSettings();
  public final static native void delete_NdtSettings(long jarg1);
  public final static native long new_NdtClient__SWIG_0();
  public final static native long new_NdtClient__SWIG_1(long jarg1, NdtSettings jarg1_);
  public final static native void delete_NdtClient(long jarg1);
  public final static native boolean NdtClient_run(long jarg1, NdtClient jarg1_);
  public final static native void NdtClient_onWarning(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_onWarningSwigExplicitNdtClient(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_onInfo(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_onInfoSwigExplicitNdtClient(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_onDebug(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_onDebugSwigExplicitNdtClient(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_onPerformance(long jarg1, NdtClient jarg1_, short jarg2, short jarg3, double jarg4, double jarg5, double jarg6, double jarg7);
  public final static native void NdtClient_onPerformanceSwigExplicitNdtClient(long jarg1, NdtClient jarg1_, short jarg2, short jarg3, double jarg4, double jarg5, double jarg6, double jarg7);
  public final static native void NdtClient_onResult(long jarg1, NdtClient jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native void NdtClient_onResultSwigExplicitNdtClient(long jarg1, NdtClient jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native void NdtClient_onServerBusy(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_onServerBusySwigExplicitNdtClient(long jarg1, NdtClient jarg1_, String jarg2);
  public final static native void NdtClient_director_connect(NdtClient obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void NdtClient_change_ownership(NdtClient obj, long cptr, boolean take_or_release);

  public static void SwigDirector_NdtClient_onWarning(NdtClient jself, String s) {
    jself.onWarning(s);
  }
  public static void SwigDirector_NdtClient_onInfo(NdtClient jself, String s) {
    jself.onInfo(s);
  }
  public static void SwigDirector_NdtClient_onDebug(NdtClient jself, String s) {
    jself.onDebug(s);
  }
  public static void SwigDirector_NdtClient_onPerformance(NdtClient jself, short tid, short nflows, double measured_bytes, double measurement_interval, double elapsed, double max_runtime) {
    jself.onPerformance(tid, nflows, measured_bytes, measurement_interval, elapsed, max_runtime);
  }
  public static void SwigDirector_NdtClient_onResult(NdtClient jself, String scope, String name, String value) {
    jself.onResult(scope, name, value);
  }
  public static void SwigDirector_NdtClient_onServerBusy(NdtClient jself, String msg) {
    jself.onServerBusy(msg);
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
