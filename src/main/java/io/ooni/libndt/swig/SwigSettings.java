/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ooni.libndt.swig;

public class SwigSettings {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SwigSettings(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwigSettings obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibndtJNI.delete_SwigSettings(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMlabnsUrl(String value) {
    LibndtJNI.SwigSettings_mlabnsUrl_set(swigCPtr, this, value);
  }

  public String getMlabnsUrl() {
    return LibndtJNI.SwigSettings_mlabnsUrl_get(swigCPtr, this);
  }

  public void setTimeout(long value) {
    LibndtJNI.SwigSettings_timeout_set(swigCPtr, this, value);
  }

  public long getTimeout() {
    return LibndtJNI.SwigSettings_timeout_get(swigCPtr, this);
  }

  public void setHostname(String value) {
    LibndtJNI.SwigSettings_hostname_set(swigCPtr, this, value);
  }

  public String getHostname() {
    return LibndtJNI.SwigSettings_hostname_get(swigCPtr, this);
  }

  public void setPort(String value) {
    LibndtJNI.SwigSettings_port_set(swigCPtr, this, value);
  }

  public String getPort() {
    return LibndtJNI.SwigSettings_port_get(swigCPtr, this);
  }

  public void setNettestFlags(short value) {
    LibndtJNI.SwigSettings_nettestFlags_set(swigCPtr, this, value);
  }

  public short getNettestFlags() {
    return LibndtJNI.SwigSettings_nettestFlags_get(swigCPtr, this);
  }

  public void setVerbosity(long value) {
    LibndtJNI.SwigSettings_verbosity_set(swigCPtr, this, value);
  }

  public long getVerbosity() {
    return LibndtJNI.SwigSettings_verbosity_get(swigCPtr, this);
  }

  public void setProtocolFlags(long value) {
    LibndtJNI.SwigSettings_protocolFlags_set(swigCPtr, this, value);
  }

  public long getProtocolFlags() {
    return LibndtJNI.SwigSettings_protocolFlags_get(swigCPtr, this);
  }

  public void setMaxRuntime(long value) {
    LibndtJNI.SwigSettings_maxRuntime_set(swigCPtr, this, value);
  }

  public long getMaxRuntime() {
    return LibndtJNI.SwigSettings_maxRuntime_get(swigCPtr, this);
  }

  public void setSocks5hPort(String value) {
    LibndtJNI.SwigSettings_socks5hPort_set(swigCPtr, this, value);
  }

  public String getSocks5hPort() {
    return LibndtJNI.SwigSettings_socks5hPort_get(swigCPtr, this);
  }

  public void addMetadata(String k, String v) {
    LibndtJNI.SwigSettings_addMetadata(swigCPtr, this, k, v);
  }

  public SwigSettings() {
    this(LibndtJNI.new_SwigSettings(), true);
  }

}