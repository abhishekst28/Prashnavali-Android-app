package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbt implements zzelo<zzdbp> {
    private final zzelx<zzamh> zzesv;
    private final zzelx<zzaya> zzeyo;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzdln> zzfos;
    private final zzelx<ApplicationInfo> zzghj;

    private zzdbt(zzelx<zzamh> zzelx, zzelx<ScheduledExecutorService> zzelx2, zzelx<zzaya> zzelx3, zzelx<ApplicationInfo> zzelx4, zzelx<zzdln> zzelx5) {
        this.zzesv = zzelx;
        this.zzflu = zzelx2;
        this.zzeyo = zzelx3;
        this.zzghj = zzelx4;
        this.zzfos = zzelx5;
    }

    public static zzdbt zzi(zzelx<zzamh> zzelx, zzelx<ScheduledExecutorService> zzelx2, zzelx<zzaya> zzelx3, zzelx<ApplicationInfo> zzelx4, zzelx<zzdln> zzelx5) {
        return new zzdbt(zzelx, zzelx2, zzelx3, zzelx4, zzelx5);
    }

    public final /* synthetic */ Object get() {
        return new zzdbp(this.zzesv.get(), this.zzflu.get(), this.zzeyo.get(), this.zzghj.get(), this.zzfos.get());
    }
}
