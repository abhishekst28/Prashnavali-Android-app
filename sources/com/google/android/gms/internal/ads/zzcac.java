package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcac implements zzelo<zzbys<zzbuj>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzdkx> zzfnc;
    private final zzelx<zzdln> zzfos;
    private final zzbzw zzfva;

    private zzcac(zzbzw zzbzw, zzelx<Context> zzelx, zzelx<zzbbg> zzelx2, zzelx<zzdkx> zzelx3, zzelx<zzdln> zzelx4) {
        this.zzfva = zzbzw;
        this.zzert = zzelx;
        this.zzfkr = zzelx2;
        this.zzfnc = zzelx3;
        this.zzfos = zzelx4;
    }

    public static zzcac zza(zzbzw zzbzw, zzelx<Context> zzelx, zzelx<zzbbg> zzelx2, zzelx<zzdkx> zzelx3, zzelx<zzdln> zzelx4) {
        return new zzcac(zzbzw, zzelx, zzelx2, zzelx3, zzelx4);
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(new zzbzv(this.zzert.get(), this.zzfkr.get(), this.zzfnc.get(), this.zzfos.get()), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
