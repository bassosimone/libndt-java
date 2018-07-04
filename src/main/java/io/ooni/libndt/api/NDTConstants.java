// Part of Measurement Kit <https://measurement-kit.github.io/>.
// Measurement Kit is free software under the BSD license. See AUTHORS
// and LICENSE for more information on the copying conditions.

package io.ooni.libndt.api;

import io.ooni.libndt.swig.Libndt;

public final class NDTConstants {

    public static final long versionMajor = Libndt.getVersionMajor();

    public static final long versionMinor = Libndt.getVersionMinor();

    public static final long versionPatch = Libndt.getVersionPatch();

    public static final short nettestFlagUpload = Libndt.getNettestFlagUpload();

    public static final short nettestFlagDownload = Libndt.getNettestFlagDownload();

    public static final short nettestFlagDownloadExt = Libndt.getNettestFlagDownloadExt();

    public static final long verbosityQuiet = Libndt.getVerbosityQuiet();

    public static final long verbosityWarning = Libndt.getVerbosityWarning();

    public static final long verbosityInfo = Libndt.getVerbosityInfo();

    public static final long verbosityDebug = Libndt.getVerbosityDebug();

    public static final long protocolFlagJSON = Libndt.getProtocolFlagJson();

    public static final long protocolFlagTLS = Libndt.getProtocolFlagTls();

    public static final long protocolFlagWebSockets = Libndt.getProtocolFlagWebsockets();
}
