package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzqm implements Runnable {
    private final /* synthetic */ zzqg zzbmt;
    private final /* synthetic */ Surface zzbnb;

    zzqm(zzqg zzqg, Surface surface) {
        this.zzbmt = zzqg;
        this.zzbnb = surface;
    }

    public final void run() {
        this.zzbmt.zzbmu.zza(this.zzbnb);
    }
}
