package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbrk implements zzelo<zzbys<zzbwt>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzckw> zzfmx;

    private zzbrk(zzelx<zzckw> zzelx, zzelx<Executor> zzelx2) {
        this.zzfmx = zzelx;
        this.zzerr = zzelx2;
    }

    public static zzbrk zzs(zzelx<zzckw> zzelx, zzelx<Executor> zzelx2) {
        return new zzbrk(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
