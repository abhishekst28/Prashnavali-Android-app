package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbqq implements zzbsu, zzbtm, zzbuj, zzbvj, zzut {
    private final Clock zzbpw;
    private final zzaxj zzfrd;

    public zzbqq(Clock clock, zzaxj zzaxj) {
        this.zzbpw = clock;
        this.zzfrd = zzaxj;
    }

    public final void onAdClicked() {
        this.zzfrd.zzwa();
    }

    public final void onAdLoaded() {
        this.zzfrd.zzan(true);
    }

    public final void onAdImpression() {
        this.zzfrd.zzvz();
    }

    public final void zzf(zzvc zzvc) {
        this.zzfrd.zze(zzvc);
    }

    public final void zzd(zzasp zzasp) {
    }

    public final void zzb(zzdlj zzdlj) {
        this.zzfrd.zzey(this.zzbpw.elapsedRealtime());
    }

    public final void onAdClosed() {
        this.zzfrd.zzwb();
    }

    public final void onAdOpened() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void zzb(zzatj zzatj, String str, String str2) {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final String zzwc() {
        return this.zzfrd.zzwc();
    }
}
