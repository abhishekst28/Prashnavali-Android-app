package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctd implements zzelo<zzctc> {
    private final zzelx<Context> zzert;
    private final zzelx<zzcar> zzglj;

    public zzctd(zzelx<Context> zzelx, zzelx<zzcar> zzelx2) {
        this.zzert = zzelx;
        this.zzglj = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return new zzctc(this.zzert.get(), this.zzglj.get());
    }
}
