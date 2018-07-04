// Part of Measurement Kit <https://measurement-kit.github.io/>.
// Measurement Kit is free software under the BSD license. See AUTHORS
// and LICENSE for more information on the copying conditions.

package io.ooni.libndt.api;

import java.util.HashMap;
import java.util.Map;

public class NDTSettings {
    // Implementation note: the sizes used by Java are typically larger than
    // the uses defined inside of libndt.hpp because Java has no unsigned. Yet,
    // since we always use unsigned, and since Swig performs a type cast to
    // the original type, narrowing should occur. Thus, we end up with having
    // only the bits that we care about being set. However, as far as timeouts
    // are concerned, narrowing would imply that a shorter timeout is set.
    //
    // TODO(bassosimone): decide how to deal with this limitation.

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
