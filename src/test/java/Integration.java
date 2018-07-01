// Part of Measurement Kit <https://measurement-kit.github.io/>.
// Measurement Kit is free software under the BSD license. See AUTHORS
// and LICENSE for more information on the copying conditions.

package main;

import io.ooni.libndt.java.NdtClient;
import io.ooni.libndt.java.NdtLibrary;
import io.ooni.libndt.java.NdtSettings;

class Integration {
  static class WrapperClient extends NdtClient {

    WrapperClient() {
      super();
    }

    WrapperClient(NdtSettings s) {
      super(s);
    }

    @Override
    public void onWarning(String s) {
      System.out.println("Java: WARNING: " + s);
    }

    @Override
    public void onInfo(String s) {
      System.out.println("Java: INFO: " + s);
    }

    @Override
    public void onDebug(String s) {
      System.out.println("Java: DEBUG: " + s);
    }
  }

  public static void main(String[] args) {
    // TODO(bassosimone): here we should probably ignore SIGPIPE!
    System.loadLibrary("ndt-java");
    NdtSettings settings = new NdtSettings();
    settings.setVerbosity(NdtLibrary.getVerbosityInfo());
    settings.setNettestFlags(
            (short)(NdtLibrary.getNettestFlagDownload() |
            NdtLibrary.getNettestFlagUpload()));
    settings.setProtocolFlags(
            NdtLibrary.getProtocolFlagJson() |
            NdtLibrary.getProtocolFlagTls());
    settings.setHostname("ndt.iupui.mlab2.trn01.measurement-lab.org");
    settings.addMetadata("client.application", "measurement-kit/libndt-java");
    NdtClient client = new WrapperClient(settings);
    client.run();
  }
}
