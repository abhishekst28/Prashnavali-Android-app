package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbnt implements zzelo<zzbys<zzbuj>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzdkx> zzfnc;
    private final zzbnl zzfoq;
    private final zzelx<zzdln> zzfos;

    public zzbnt(zzbnl zzbnl, zzelx<Context> zzelx, zzelx<zzbbg> zzelx2, zzelx<zzdkx> zzelx3, zzelx<zzdln> zzelx4) {
        this.zzfoq = zzbnl;
        this.zzert = zzelx;
        this.zzfkr = zzelx2;
        this.zzfnc = zzelx3;
        this.zzfos = zzelx4;
    }

    public static zzbys<zzbuj> zza(zzbnl zzbnl, Context context, zzbbg zzbbg, zzdkx zzdkx, zzdln zzdln) {
        return (zzbys) zzelu.zza(new zzbys(new zzbno(context, zzbbg, zzdkx, zzdln), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzert.get(), this.zzfkr.get(), this.zzfnc.get(), this.zzfos.get());
    }
}
