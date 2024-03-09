package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbot implements zzelo<zzboo> {
    private final zzelx<zzbpg> zzewy;
    private final zzelx<Runnable> zzfhy;
    private final zzelx<zzafq> zzfmx;
    private final zzelx<Executor> zzfol;

    public zzbot(zzelx<zzbpg> zzelx, zzelx<zzafq> zzelx2, zzelx<Runnable> zzelx3, zzelx<Executor> zzelx4) {
        this.zzewy = zzelx;
        this.zzfmx = zzelx2;
        this.zzfhy = zzelx3;
        this.zzfol = zzelx4;
    }

    public final /* synthetic */ Object get() {
        return new zzboo(this.zzewy.get(), this.zzfmx.get(), this.zzfhy.get(), this.zzfol.get());
    }
}
