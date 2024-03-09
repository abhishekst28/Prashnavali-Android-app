package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdvz extends zzdwa implements zzdvw, ScheduledExecutorService {
    private final ScheduledExecutorService zzhqf;

    zzdvz(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.zzhqf = (ScheduledExecutorService) zzdsv.checkNotNull(scheduledExecutorService);
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdwb zzdwb = new zzdwb(runnable);
        return new zzdwc(zzdwb, this.zzhqf.scheduleWithFixedDelay(zzdwb, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdwb zzdwb = new zzdwb(runnable);
        return new zzdwc(zzdwb, this.zzhqf.scheduleAtFixedRate(zzdwb, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzdwh zzf = zzdwh.zzf(callable);
        return new zzdwc(zzf, this.zzhqf.schedule(zzf, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzdwh zza = zzdwh.zza(runnable, null);
        return new zzdwc(zza, this.zzhqf.schedule(zza, j, timeUnit));
    }
}
