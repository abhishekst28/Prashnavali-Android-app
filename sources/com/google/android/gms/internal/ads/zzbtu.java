package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbtu extends zzbxe<zzbsu> {
    public zzbtu(Set<zzbys<zzbsu>> set) {
        super(set);
    }

    public final void onAdClosed() {
        zza(zzbtx.zzfst);
    }

    public final void onAdLeftApplication() {
        zza(zzbtw.zzfst);
    }

    public final void onAdOpened() {
        zza(zzbtz.zzfst);
    }

    public final void onRewardedVideoStarted() {
        zza(zzbty.zzfst);
    }

    public final void zzb(zzatj zzatj, String str, String str2) {
        zza(new zzbub(zzatj, str, str2));
    }

    public final void onRewardedVideoCompleted() {
        zza(zzbua.zzfst);
    }
}
