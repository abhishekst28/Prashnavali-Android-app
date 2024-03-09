package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzegz extends IOException {
    private zzehz zzigo = null;

    public zzegz(String str) {
        super(str);
    }

    public final zzegz zzl(zzehz zzehz) {
        this.zzigo = zzehz;
        return this;
    }

    static zzegz zzbgb() {
        return new zzegz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzegz zzbgc() {
        return new zzegz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzegz zzbgd() {
        return new zzegz("CodedInputStream encountered a malformed varint.");
    }

    static zzegz zzbge() {
        return new zzegz("Protocol message contained an invalid tag (zero).");
    }

    static zzegz zzbgf() {
        return new zzegz("Protocol message end-group tag did not match expected tag.");
    }

    static zzehc zzbgg() {
        return new zzehc("Protocol message tag had invalid wire type.");
    }

    static zzegz zzbgh() {
        return new zzegz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzegz zzbgi() {
        return new zzegz("Failed to parse the message.");
    }

    static zzegz zzbgj() {
        return new zzegz("Protocol message had invalid UTF-8.");
    }
}
