package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbgn implements Runnable {
    private final Map zzedp;
    private final zzbgk zzeph;

    zzbgn(zzbgk zzbgk, Map map) {
        this.zzeph = zzbgk;
        this.zzedp = map;
    }

    public final void run() {
        this.zzeph.zzk(this.zzedp);
    }
}
