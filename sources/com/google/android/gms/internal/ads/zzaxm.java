package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaxm extends zzaxu {
    private final /* synthetic */ zzaxk zzdym;

    zzaxm(zzaxk zzaxk) {
        this.zzdym = zzaxk;
    }

    public final void zzuy() {
        zzaax zzaax = new zzaax(this.zzdym.zzvr, this.zzdym.zzbpa.zzbra);
        synchronized (this.zzdym.lock) {
            try {
                zzp.zzky();
                zzabc.zza(this.zzdym.zzdxz, zzaax);
            } catch (IllegalArgumentException e) {
                zzaxy.zzd("Cannot config CSI reporter.", e);
            }
        }
    }
}
