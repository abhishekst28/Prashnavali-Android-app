package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzclc implements zzelo<zzbys<zzbuj>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcky> zzfmx;

    private zzclc(zzelx<zzcky> zzelx, zzelx<Executor> zzelx2) {
        this.zzfmx = zzelx;
        this.zzerr = zzelx2;
    }

    public static zzclc zzam(zzelx<zzcky> zzelx, zzelx<Executor> zzelx2) {
        return new zzclc(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
