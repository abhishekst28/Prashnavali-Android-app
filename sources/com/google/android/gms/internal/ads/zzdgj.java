package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdgj implements zzden<zzdgg> {
    private ApplicationInfo applicationInfo;
    private boolean zzdte;
    private ScheduledExecutorService zzflf;
    private zzamh zzgts;

    public zzdgj(zzamh zzamh, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo2) {
        this.zzgts = zzamh;
        this.zzflf = scheduledExecutorService;
        this.zzdte = z;
        this.applicationInfo = applicationInfo2;
    }

    public final zzdvt<zzdgg> zzaqs() {
        if (!zzacd.zzczi.get().booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.zzdte) {
            return zzdvl.immediateFailedFuture(new Exception("Auto Collect Location is false."));
        }
        return zzdvl.zzb(zzdvl.zza(this.zzgts.zza(this.applicationInfo), ((Long) zzwe.zzpu().zzd(zzaat.zzcsa)).longValue(), TimeUnit.MILLISECONDS, this.zzflf), zzdgi.zzdwg, (Executor) zzbbi.zzedu);
    }
}
