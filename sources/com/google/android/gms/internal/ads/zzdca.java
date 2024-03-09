package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdca implements zzelo<zzdby> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;

    private zzdca(zzelx<Context> zzelx, zzelx<zzdvw> zzelx2) {
        this.zzert = zzelx;
        this.zzerr = zzelx2;
    }

    public static zzdca zzbb(zzelx<Context> zzelx, zzelx<zzdvw> zzelx2) {
        return new zzdca(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzdby(this.zzert.get(), this.zzerr.get());
    }
}
