// Part of Measurement Kit <https://measurement-kit.github.io/>.
// Measurement Kit is free software under the BSD license. See AUTHORS
// and LICENSE for more information on the copying conditions.

package io.ooni.libndt.api;

import java.util.HashMap;
import java.util.Map;

public class NDTSettings {
    // XXX: what about conversion of wider types?
    public String mlabnsURL = new String();
    public String hostname = new String();
    public long maxRuntime = 0;
    public Map<String, String> metadata = new HashMap<String, String>();
    public short nettestFlags = 0;
    public String port = new String();
    public long protocolFlags = 0;
    public String socks5hPort = new String();
    public long timeout = 0;
    public long verbosity = 0;
}
