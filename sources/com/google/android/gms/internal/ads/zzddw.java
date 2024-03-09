package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddw implements zzelo<zzddu> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzawb> zzfku;

    private zzddw(zzelx<zzawb> zzelx, zzelx<zzdvw> zzelx2, zzelx<Context> zzelx3) {
        this.zzfku = zzelx;
        this.zzerr = zzelx2;
        this.zzert = zzelx3;
    }

    public static zzddw zzt(zzelx<zzawb> zzelx, zzelx<zzdvw> zzelx2, zzelx<Context> zzelx3) {
        return new zzddw(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        return new zzddu(this.zzfku.get(), this.zzerr.get(), this.zzert.get());
    }
}
