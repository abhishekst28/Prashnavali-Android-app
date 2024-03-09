package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzagf extends zzafa {
    private final NativeContentAd.OnContentAdLoadedListener zzddn;

    public zzagf(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzddn = onContentAdLoadedListener;
    }

    public final void zza(zzaeo zzaeo) {
        this.zzddn.onContentAdLoaded(new zzaep(zzaeo));
    }
}
