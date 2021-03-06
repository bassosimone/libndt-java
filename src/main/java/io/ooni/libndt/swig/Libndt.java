/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.libndt.swig;

public class Libndt {
  public static long getVersionMajor() {
    return LibndtJNI.versionMajor_get();
  }

  public static long getVersionMinor() {
    return LibndtJNI.versionMinor_get();
  }

  public static long getVersionPatch() {
    return LibndtJNI.versionPatch_get();
  }

  public static short getNettestFlagUpload() {
    return LibndtJNI.nettestFlagUpload_get();
  }

  public static short getNettestFlagDownload() {
    return LibndtJNI.nettestFlagDownload_get();
  }

  public static short getNettestFlagDownloadExt() {
    return LibndtJNI.nettestFlagDownloadExt_get();
  }

  public static long getVerbosityQuiet() {
    return LibndtJNI.verbosityQuiet_get();
  }

  public static long getVerbosityWarning() {
    return LibndtJNI.verbosityWarning_get();
  }

  public static long getVerbosityInfo() {
    return LibndtJNI.verbosityInfo_get();
  }

  public static long getVerbosityDebug() {
    return LibndtJNI.verbosityDebug_get();
  }

  public static long getProtocolFlagJson() {
    return LibndtJNI.protocolFlagJson_get();
  }

  public static long getProtocolFlagTls() {
    return LibndtJNI.protocolFlagTls_get();
  }

  public static long getProtocolFlagWebsockets() {
    return LibndtJNI.protocolFlagWebsockets_get();
  }

}
