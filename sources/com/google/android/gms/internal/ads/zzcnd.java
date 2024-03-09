package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcnd implements zzelo<zzdvt<String>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzeg> zzfly;
    private final zzelx<zzdvw> zzfru;

    private zzcnd(zzelx<zzeg> zzelx, zzelx<Context> zzelx2, zzelx<zzdvw> zzelx3) {
        this.zzfly = zzelx;
        this.zzert = zzelx2;
        this.zzfru = zzelx3;
    }

    public static zzcnd zzo(zzelx<zzeg> zzelx, zzelx<Context> zzelx2, zzelx<zzdvw> zzelx3) {
        return new zzcnd(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        return (zzdvt) zzelu.zza(this.zzfru.get().zze(new zzcne(this.zzfly.get(), this.zzert.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
