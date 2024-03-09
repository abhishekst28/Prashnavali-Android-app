package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcot implements zzelo<zzcou> {
    private final zzelx<Context> zzert;
    private final zzelx<zzawb> zzfku;

    private zzcot(zzelx<Context> zzelx, zzelx<zzawb> zzelx2) {
        this.zzert = zzelx;
        this.zzfku = zzelx2;
    }

    public static zzcot zzar(zzelx<Context> zzelx, zzelx<zzawb> zzelx2) {
        return new zzcot(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzcou(this.zzert.get(), this.zzfku.get());
    }
}
