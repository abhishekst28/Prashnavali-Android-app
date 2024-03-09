package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcsl implements zzelo<zzcsh> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzboe> zzfhd;
    private final zzelx<zzcrn> zzfhh;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzbsx> zzglz;

    public zzcsl(zzelx<zzboe> zzelx, zzelx<zzcrn> zzelx2, zzelx<zzbsx> zzelx3, zzelx<ScheduledExecutorService> zzelx4, zzelx<zzdvw> zzelx5) {
        this.zzfhd = zzelx;
        this.zzfhh = zzelx2;
        this.zzglz = zzelx3;
        this.zzflu = zzelx4;
        this.zzerr = zzelx5;
    }

    public final /* synthetic */ Object get() {
        return new zzcsh(this.zzfhd.get(), this.zzfhh.get(), this.zzglz.get(), this.zzflu.get(), this.zzerr.get());
    }
}
