package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdez implements zzelo<zzdex> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;

    private zzdez(zzelx<zzdvw> zzelx, zzelx<Context> zzelx2) {
        this.zzerr = zzelx;
        this.zzert = zzelx2;
    }

    public static zzdez zzbi(zzelx<zzdvw> zzelx, zzelx<Context> zzelx2) {
        return new zzdez(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzdex(this.zzerr.get(), this.zzert.get());
    }
}
