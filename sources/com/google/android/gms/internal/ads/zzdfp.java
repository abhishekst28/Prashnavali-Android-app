package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdfp implements zzden<zzdfm> {
    private final Executor executor;
    private final zzaxk zzbps;
    private final ScheduledExecutorService zzflf;
    private final int zzgjp;
    private final zzaxg zzgvu;
    private final Context zzvr;

    public zzdfp(zzaxg zzaxg, int i, Context context, zzaxk zzaxk, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        this.zzgvu = zzaxg;
        this.zzgjp = i;
        this.zzvr = context;
        this.zzbps = zzaxk;
        this.zzflf = scheduledExecutorService;
        this.executor = executor2;
    }

    public final zzdvt<zzdfm> zzaqs() {
        return zzdvc.zzg(zzdvl.zza(new zzdfo(this), this.executor)).zza(zzdfr.zzdwg, this.executor).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcoh)).longValue(), TimeUnit.MILLISECONDS, this.zzflf).zza(Exception.class, new zzdfq(this), zzdvv.zzaxm());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdfm zzb(Exception exc) {
        this.zzbps.zza(exc, "AttestationTokenSignal");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzarm() throws Exception {
        return this.zzgvu.zza(this.zzvr, this.zzgjp);
    }
}
