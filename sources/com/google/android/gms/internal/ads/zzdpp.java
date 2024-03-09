package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdpp implements zzelo<zzalu> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfsr;
    private final zzdpq zzhid;

    public zzdpp(zzdpq zzdpq, zzelx<Context> zzelx, zzelx<zzbbg> zzelx2) {
        this.zzhid = zzdpq;
        this.zzert = zzelx;
        this.zzfsr = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return (zzalu) zzelu.zza(new zzall().zzb(this.zzert.get(), this.zzfsr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
