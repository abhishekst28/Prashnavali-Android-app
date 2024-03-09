package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzuy extends zzwk {
    private final AdListener zzcgu;

    public zzuy(AdListener adListener) {
        this.zzcgu = adListener;
    }

    public final void onAdClosed() {
        this.zzcgu.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) {
        this.zzcgu.onAdFailedToLoad(i);
    }

    public final void zzb(zzuw zzuw) {
        this.zzcgu.onAdFailedToLoad(zzuw.zzpg());
    }

    public final void onAdLeftApplication() {
        this.zzcgu.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.zzcgu.onAdLoaded();
    }

    public final void onAdOpened() {
        this.zzcgu.onAdOpened();
    }

    public final void onAdClicked() {
        this.zzcgu.onAdClicked();
    }

    public final void onAdImpression() {
        this.zzcgu.onAdImpression();
    }

    public final AdListener getAdListener() {
        return this.zzcgu;
    }
}
