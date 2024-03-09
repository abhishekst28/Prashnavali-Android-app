package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzyt extends zzwh {
    private final /* synthetic */ zzyq zzcjv;

    zzyt(zzyq zzyq) {
        this.zzcjv = zzyq;
    }

    public final void onAdLoaded() {
        this.zzcjv.zzcjj.zza(this.zzcjv.zzdt());
        super.onAdLoaded();
    }

    public final void onAdFailedToLoad(int i) {
        this.zzcjv.zzcjj.zza(this.zzcjv.zzdt());
        super.onAdFailedToLoad(i);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzcjv.zzcjj.zza(this.zzcjv.zzdt());
        super.onAdFailedToLoad(loadAdError);
    }
}
