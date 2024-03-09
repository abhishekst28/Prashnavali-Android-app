package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbrr implements zzelo<zzdsl<zzdkx, zzayy>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzdln> zzfos;

    public zzbrr(zzelx<Context> zzelx, zzelx<zzbbg> zzelx2, zzelx<zzdln> zzelx3) {
        this.zzert = zzelx;
        this.zzfkr = zzelx2;
        this.zzfos = zzelx3;
    }

    public final /* synthetic */ Object get() {
        return (zzdsl) zzelu.zza(new zzbrs(this.zzert.get(), this.zzfkr.get(), this.zzfos.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
