// Part of Measurement Kit <https://measurement-kit.github.io/>.
// Measurement Kit is free software under the BSD license. See AUTHORS
// and LICENSE for more information on the copying conditions.

package io.ooni.libndt.api;

import io.ooni.libndt.swig.SwigClient;
import io.ooni.libndt.swig.SwigSettings;

public class NDTClient {

    public NDTClient(NDTSettings settings) {
        settings_ = settings;
    }

    public NDTClient() {
        settings_ = new NDTSettings();
    }

    public void onWarning(String s) {
        // Nothing
    }

    public void onInfo(String s) {
        // Nothing
    }

    public void onDebug(String s) {
        // Nothing
    }

    public void onPerformance(short tid, short nflows, double measuredBytes,
            double measurementInterval, double elapsed,
            double maxRuntime) {
        // Nothing
    }

    public void onResult(String scope, String name, String value) {
        // Nothing
    }

    public void onServerBusy(String msg) {
        // Nothing
    }

    public boolean run() {
        SwigSettings swigSettings = new SwigSettings();

        if (!settings_.mlabnsURL.isEmpty()) {
            swigSettings.setMlabnsUrl(settings_.mlabnsURL);
        }
        if (!settings_.hostname.isEmpty()) {
            swigSettings.setHostname(settings_.hostname);
        }
        if (settings_.maxRuntime > 0) {
            swigSettings.setMaxRuntime(settings_.maxRuntime);
        }
        for (String key : settings_.metadata.keySet()) {
            String value = settings_.metadata.get(key);
            swigSettings.addMetadata(key, value);
        }
        if (settings_.nettestFlags > 0) {
            swigSettings.setNettestFlags(settings_.nettestFlags);
        }
        if (!settings_.port.isEmpty()) {
            swigSettings.setPort(settings_.port);
        }
        if (settings_.protocolFlags > 0) {
            swigSettings.setProtocolFlags(settings_.protocolFlags);
        }
        if (!settings_.socks5hPort.isEmpty()) {
            swigSettings.setSocks5hPort(settings_.socks5hPort);
        }
        if (settings_.timeout > 0) {
            swigSettings.setTimeout(settings_.timeout);
        }
        if (settings_.verbosity > 0) {
            swigSettings.setVerbosity(settings_.verbosity);
        }

        MyClient myClient = new MyClient(this, swigSettings);
        boolean rv = myClient.run();
        myClient.detach();
        return rv;
    }

    class MyClient extends SwigClient {
        public MyClient(NDTClient parent, SwigSettings swigSettings) {
            super(swigSettings);
            p_ = parent;
        }

        @Override
        public void onWarning(String s) {
            p_.onWarning(s);
        }

        @Override
        public void onInfo(String s) {
            p_.onInfo(s);
        }

        @Override
        public void onDebug(String s) {
            p_.onDebug(s);
        }

        @Override
        public void onPerformance(short tid, short nflows, double measuredBytes,
                double measurementInterval, double elapsed,
                double maxRuntime) {
            p_.onPerformance(tid, nflows, measuredBytes, measurementInterval,
                    elapsed, maxRuntime);
        }

        @Override
        public void onResult(String scope, String name, String value) {
            p_.onResult(scope, name, value);
        }

        @Override
        public void onServerBusy(String msg) {
            p_.onServerBusy(msg);
        }

        public void detach() {
            p_ = null;
        }

        private NDTClient p_;
    }

    private NDTSettings settings_;
}
