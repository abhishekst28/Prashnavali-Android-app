package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbpo {
    private final Executor executor;
    private volatile boolean zzaey = true;
    private final ScheduledExecutorService zzflf;
    private final zzdvt<zzbpj> zzfqb;

    public zzbpo(Executor executor2, ScheduledExecutorService scheduledExecutorService, zzdvt<zzbpj> zzdvt) {
        this.executor = executor2;
        this.zzflf = scheduledExecutorService;
        this.zzfqb = zzdvt;
    }

    public final void zza(zzdvi<zzbpd> zzdvi) {
        zzdvl.zza(this.zzfqb, new zzbpr(this, zzdvi), this.executor);
    }

    /* access modifiers changed from: private */
    public final void zza(List<? extends zzdvt<? extends zzbpd>> list, zzdvi<zzbpd> zzdvi) {
        if (list == null || list.isEmpty()) {
            this.executor.execute(new zzbpn(zzdvi));
            return;
        }
        zzdvt<O> zzaf = zzdvl.zzaf(null);
        for (zzdvt zzbpp : list) {
            zzaf = zzdvl.zzb(zzdvl.zzb(zzaf, Throwable.class, new zzbpq(zzdvi), this.executor), new zzbpp(this, zzdvi, zzbpp), this.executor);
        }
        zzdvl.zza(zzaf, new zzbpu(this, zzdvi), this.executor);
    }

    public final boolean isLoading() {
        return this.zzaey;
    }

    /* access modifiers changed from: private */
    public final void zzaip() {
        zzbbi.zzedy.execute(new zzbps(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaiq() {
        this.zzaey = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdvi zzdvi, zzdvt zzdvt, zzbpd zzbpd) throws Exception {
        if (zzbpd != null) {
            zzdvi.onSuccess(zzbpd);
        }
        return zzdvl.zza(zzdvt, zzacx.zzdbv.get().longValue(), TimeUnit.MILLISECONDS, this.zzflf);
    }
}
