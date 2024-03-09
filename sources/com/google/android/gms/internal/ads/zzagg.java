package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzagg extends zzaev {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzddo;

    public zzagg(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzddo = onAppInstallAdLoadedListener;
    }

    public final void zza(zzaek zzaek) {
        this.zzddo.onAppInstallAdLoaded(new zzael(zzaek));
    }
}
