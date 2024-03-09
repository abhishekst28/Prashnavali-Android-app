package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zztf extends zzbbq<InputStream> {
    private final /* synthetic */ zztg zzbvg;

    zztf(zztg zztg) {
        this.zzbvg = zztg;
    }

    public final boolean cancel(boolean z) {
        this.zzbvg.disconnect();
        return super.cancel(z);
    }
}
