package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdcv implements zzelo<zzdco> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzaya> zzeyo;
    private final zzelx<zzdln> zzfos;
    private final zzelx<PackageInfo> zzfse;

    public zzdcv(zzelx<zzdvw> zzelx, zzelx<zzdln> zzelx2, zzelx<PackageInfo> zzelx3, zzelx<zzaya> zzelx4) {
        this.zzerr = zzelx;
        this.zzfos = zzelx2;
        this.zzfse = zzelx3;
        this.zzeyo = zzelx4;
    }

    public final /* synthetic */ Object get() {
        return new zzdco(this.zzerr.get(), this.zzfos.get(), this.zzfse.get(), this.zzeyo.get());
    }
}
