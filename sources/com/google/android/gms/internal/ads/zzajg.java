package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.instream.InstreamAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzajg extends zzajc {
    private final InstreamAd.InstreamAdLoadCallback zzdfn;

    public zzajg(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        this.zzdfn = instreamAdLoadCallback;
    }

    public final void zza(zzait zzait) {
        this.zzdfn.onInstreamAdLoaded(new zzaje(zzait));
    }

    public final void onInstreamAdFailedToLoad(int i) {
        this.zzdfn.onInstreamAdFailedToLoad(i);
    }

    public final void zzc(zzuw zzuw) {
        this.zzdfn.onInstreamAdFailedToLoad(zzuw.zzpg());
    }
}
