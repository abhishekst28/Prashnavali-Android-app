package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbrp implements zzelo<zzbys<zzbvj>> {
    private final zzelx<zzbro> zzfmx;
    private final zzbrq zzfrk;

    private zzbrp(zzbrq zzbrq, zzelx<zzbro> zzelx) {
        this.zzfrk = zzbrq;
        this.zzfmx = zzelx;
    }

    public static zzbrp zza(zzbrq zzbrq, zzelx<zzbro> zzelx) {
        return new zzbrp(zzbrq, zzelx);
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
