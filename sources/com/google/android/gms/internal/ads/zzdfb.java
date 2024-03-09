package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdfb implements zzden<zzdey> {
    private final Executor executor;
    private final ScheduledExecutorService zzflf;
    private final zzaxg zzgvu;
    private final Context zzvr;

    public zzdfb(zzaxg zzaxg, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        this.zzgvu = zzaxg;
        this.zzvr = context;
        this.zzflf = scheduledExecutorService;
        this.executor = executor2;
    }

    public final zzdvt<zzdey> zzaqs() {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcog)).booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Did not ad Ad ID into query param."));
        }
        return zzdvc.zzg(this.zzgvu.zzal(this.zzvr)).zza(zzdfa.zzdwg, this.executor).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcoh)).longValue(), TimeUnit.MILLISECONDS, this.zzflf).zza(Throwable.class, new zzdfd(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdey zzf(Throwable th) {
        zzwe.zzpq();
        return new zzdey((AdvertisingIdClient.Info) null, zzbat.zzbn(this.zzvr));
    }
}
