package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbru implements zzbsu, zzbti, zzbwt, zzbyh {
    private final Executor executor;
    /* access modifiers changed from: private */
    public final zzbtl zzfrn;
    private final zzdkx zzfro;
    private final ScheduledExecutorService zzfrp;
    private zzdwe<Boolean> zzfrq = zzdwe.zzaxn();
    private ScheduledFuture<?> zzfrr;

    public zzbru(zzbtl zzbtl, zzdkx zzdkx, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        this.zzfrn = zzbtl;
        this.zzfro = zzdkx;
        this.zzfrp = scheduledExecutorService;
        this.executor = executor2;
    }

    public final void onAdOpened() {
        if (this.zzfro.zzhaz == 0 || this.zzfro.zzhaz == 1) {
            this.zzfrn.onAdImpression();
        }
    }

    public final void zzaix() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpx)).booleanValue() && this.zzfro.zzhaz == 2) {
            if (this.zzfro.zzham == 0) {
                this.zzfrn.onAdImpression();
                return;
            }
            zzdvl.zza(this.zzfrq, new zzbrw(this), this.executor);
            this.zzfrr = this.zzfrp.schedule(new zzbrt(this), (long) this.zzfro.zzham, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void zzf(zzuw zzuw) {
        if (!this.zzfrq.isDone()) {
            if (this.zzfrr != null) {
                this.zzfrr.cancel(true);
            }
            this.zzfrq.setException(new Exception());
        }
    }

    public final synchronized void zzaiy() {
        if (!this.zzfrq.isDone()) {
            if (this.zzfrr != null) {
                this.zzfrr.cancel(true);
            }
            this.zzfrq.set(true);
        }
    }

    public final void onAdClosed() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void zzb(zzatj zzatj, String str, String str2) {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void zzaiz() {
    }

    public final void zzaja() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzajb() {
        synchronized (this) {
            if (!this.zzfrq.isDone()) {
                this.zzfrq.set(true);
            }
        }
    }
}
