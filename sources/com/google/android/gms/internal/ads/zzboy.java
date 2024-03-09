package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzboy implements zzbuj, zzqu {
    private final zzdkx zzflh;
    private final zzbtl zzfpk;
    private final zzbun zzfpl;
    private final AtomicBoolean zzfpm = new AtomicBoolean();
    private final AtomicBoolean zzfpn = new AtomicBoolean();

    public zzboy(zzdkx zzdkx, zzbtl zzbtl, zzbun zzbun) {
        this.zzflh = zzdkx;
        this.zzfpk = zzbtl;
        this.zzfpl = zzbun;
    }

    public final synchronized void onAdLoaded() {
        if (this.zzflh.zzhah != 1) {
            zzaij();
        }
    }

    public final void zza(zzqr zzqr) {
        if (this.zzflh.zzhah == 1 && zzqr.zzbrk) {
            zzaij();
        }
        if (zzqr.zzbrk && this.zzfpn.compareAndSet(false, true)) {
            this.zzfpl.zzajl();
        }
    }

    private final void zzaij() {
        if (this.zzfpm.compareAndSet(false, true)) {
            this.zzfpk.onAdImpression();
        }
    }
}
