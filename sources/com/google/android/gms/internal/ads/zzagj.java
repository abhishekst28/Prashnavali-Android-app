package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzagj extends zzafu {
    private final UnifiedNativeAd.UnconfirmedClickListener zzddt;

    public zzagj(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zzddt = unconfirmedClickListener;
    }

    public final void onUnconfirmedClickReceived(String str) {
        this.zzddt.onUnconfirmedClickReceived(str);
    }

    public final void onUnconfirmedClickCancelled() {
        this.zzddt.onUnconfirmedClickCancelled();
    }
}
