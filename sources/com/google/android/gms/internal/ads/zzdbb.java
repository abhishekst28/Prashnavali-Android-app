package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbb implements zzelo<zzdaz> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;

    private zzdbb(zzelx<zzdvw> zzelx, zzelx<Context> zzelx2) {
        this.zzerr = zzelx;
        this.zzert = zzelx2;
    }

    public static zzdbb zzaz(zzelx<zzdvw> zzelx, zzelx<Context> zzelx2) {
        return new zzdbb(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzdaz(this.zzerr.get(), this.zzert.get());
    }
}
