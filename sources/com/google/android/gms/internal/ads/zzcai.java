package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcai implements zzelo<zzavy> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdln> zzfos;
    private final zzbzw zzfva;

    private zzcai(zzbzw zzbzw, zzelx<Context> zzelx, zzelx<zzdln> zzelx2) {
        this.zzfva = zzbzw;
        this.zzert = zzelx;
        this.zzfos = zzelx2;
    }

    public static zzcai zza(zzbzw zzbzw, zzelx<Context> zzelx, zzelx<zzdln> zzelx2) {
        return new zzcai(zzbzw, zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return (zzavy) zzelu.zza(new zzavy(this.zzert.get(), this.zzfos.get().zzhbv), "Cannot return null from a non-@Nullable @Provides method");
    }
}
