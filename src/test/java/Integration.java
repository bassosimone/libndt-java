// Part of Measurement Kit <https://measurement-kit.github.io/>.
// Measurement Kit is free software under the BSD license. See AUTHORS
// and LICENSE for more information on the copying conditions.

package main;

import io.ooni.libndt.api.NDTClient;
import io.ooni.libndt.api.NDTConstants;
import io.ooni.libndt.api.NDTSettings;

class Integration {
  static class WrapperClient extends NDTClient {

    WrapperClient() {
      super();
    }

    WrapperClient(NDTSettings s) {
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
    NDTSettings settings = new NDTSettings();
    settings.verbosity = NDTConstants.verbosityInfo;
    settings.nettestFlags = (short)(NDTConstants.nettestFlagDownload | NDTConstants.nettestFlagUpload);
    settings.protocolFlags = NDTConstants.protocolFlagJSON;
    settings.hostname = "ndt.iupui.mlab2.trn01.measurement-lab.org";
    settings.metadata.put("client.application", "measurement-kit/libndt-java");
    NDTClient client = new WrapperClient(settings);
    client.run();
  }
}
