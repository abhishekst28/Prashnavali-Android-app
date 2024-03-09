package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdam implements zzelo<zzdal> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzaxk> zzgsp;

    private zzdam(zzelx<Executor> zzelx, zzelx<zzaxk> zzelx2) {
        this.zzerr = zzelx;
        this.zzgsp = zzelx2;
    }

    public static zzdam zzay(zzelx<Executor> zzelx, zzelx<zzaxk> zzelx2) {
        return new zzdam(zzelx, zzelx2);
    }

    public static zzdal zza(Executor executor, zzaxk zzaxk) {
        return new zzdal(executor, zzaxk);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzerr.get(), this.zzgsp.get());
    }
}
