package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdat implements zzden<zzdaq> {
    private final Executor executor;
    private final ScheduledExecutorService zzflf;
    private final Context zzvr;

    public zzdat(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        this.zzvr = context;
        this.zzflf = scheduledExecutorService;
        this.executor = executor2;
    }

    public final zzdvt<zzdaq> zzaqs() {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwc)).booleanValue()) {
            return zzdvl.zzaf(null);
        }
        zzbbq zzbbq = new zzbbq();
        try {
            new zzdas(zzbbq).zzbm(false);
        } catch (Throwable th) {
            zzaxy.zzfc("ArCoreApk is not ready.");
            zzbbq.set(false);
        }
        return zzdvl.zzb(zzdvl.zzb(zzdvl.zza(zzbbq, 200, TimeUnit.MILLISECONDS, this.zzflf), new zzdav(this), this.executor), Throwable.class, zzdau.zzbok, this.executor);
    }
}
