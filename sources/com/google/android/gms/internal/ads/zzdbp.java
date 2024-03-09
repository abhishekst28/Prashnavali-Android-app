package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbp implements zzden<zzdbm> {
    private ApplicationInfo applicationInfo;
    private zzaya zzdza;
    private ScheduledExecutorService zzflf;
    zzdln zzfqn;
    private zzamh zzgts;

    public zzdbp(zzamh zzamh, ScheduledExecutorService scheduledExecutorService, zzaya zzaya, ApplicationInfo applicationInfo2, zzdln zzdln) {
        this.zzgts = zzamh;
        this.zzflf = scheduledExecutorService;
        this.zzdza = zzaya;
        this.applicationInfo = applicationInfo2;
        this.zzfqn = zzdln;
    }

    public final zzdvt<zzdbm> zzaqs() {
        zzdvt<V> zzdvt;
        if (!zzacd.zzczh.get().booleanValue()) {
            zzdvt = zzdvl.zzaf(null);
        } else if (!this.zzdza.zzxc()) {
            zzdvt = zzdvl.zzaf(null);
        } else {
            zzdvt = zzdvl.zzb(zzdvl.zza(this.zzgts.zza(this.applicationInfo), ((Long) zzwe.zzpu().zzd(zzaat.zzcsa)).longValue(), TimeUnit.MILLISECONDS, this.zzflf), Throwable.class, zzdbq.zzbok, zzbbi.zzedz);
        }
        return zzdvl.zzb(zzdvl.zzb(zzdvt, new zzdbr(this), (Executor) this.zzflf), zzdbo.zzdwg, (Executor) zzbbi.zzedu);
    }
}
