/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.libndt.java;

public class NdtLibrary {
  public static long getVersionMajor() {
    return NdtLibraryJNI.versionMajor_get();
  }

  public static long getVersionMinor() {
    return NdtLibraryJNI.versionMinor_get();
  }

  public static long getVersionPatch() {
    return NdtLibraryJNI.versionPatch_get();
  }

  public static short getNettestFlagUpload() {
    return NdtLibraryJNI.nettestFlagUpload_get();
  }

  public static short getNettestFlagDownload() {
    return NdtLibraryJNI.nettestFlagDownload_get();
  }

  public static short getNettestFlagDownloadExt() {
    return NdtLibraryJNI.nettestFlagDownloadExt_get();
  }

  public static long getVerbosityQuiet() {
    return NdtLibraryJNI.verbosityQuiet_get();
  }

  public static long getVerbosityWarning() {
    return NdtLibraryJNI.verbosityWarning_get();
  }

  public static long getVerbosityInfo() {
    return NdtLibraryJNI.verbosityInfo_get();
  }

  public static long getVerbosityDebug() {
    return NdtLibraryJNI.verbosityDebug_get();
  }

  public static long getProtocolFlagJson() {
    return NdtLibraryJNI.protocolFlagJson_get();
  }

  public static long getProtocolFlagTls() {
    return NdtLibraryJNI.protocolFlagTls_get();
  }

  public static long getProtocolFlagWebsockets() {
    return NdtLibraryJNI.protocolFlagWebsockets_get();
  }

}
