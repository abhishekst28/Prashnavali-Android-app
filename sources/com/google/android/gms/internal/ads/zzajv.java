package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzajv implements Runnable {
    private final zzajw zzdfw;
    private final zzahf zzdfx;
    private final Map zzdfy;

    zzajv(zzajw zzajw, zzahf zzahf, Map map) {
        this.zzdfw = zzajw;
        this.zzdfx = zzahf;
        this.zzdfy = map;
    }

    public final void run() {
        this.zzdfw.zza(this.zzdfx, this.zzdfy);
    }
}
