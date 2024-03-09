package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdpo implements zzelo<zzdpf> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzdpi> zzezl;
    private final zzelx<ScheduledExecutorService> zzfnz;

    private zzdpo(zzelx<zzdvw> zzelx, zzelx<ScheduledExecutorService> zzelx2, zzelx<zzdpi> zzelx3) {
        this.zzerr = zzelx;
        this.zzfnz = zzelx2;
        this.zzezl = zzelx3;
    }

    public static zzdpo zzv(zzelx<zzdvw> zzelx, zzelx<ScheduledExecutorService> zzelx2, zzelx<zzdpi> zzelx3) {
        return new zzdpo(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        return new zzdpf(this.zzerr.get(), this.zzfnz.get(), this.zzezl.get());
    }
}
