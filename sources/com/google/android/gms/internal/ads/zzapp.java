package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzapp implements zzo {
    private final /* synthetic */ zzapq zzdlx;

    zzapp(zzapq zzapq) {
        this.zzdlx = zzapq;
    }

    public final void zzui() {
        zzbbd.zzef("AdMobCustomTabsAdapter overlay is closed.");
        this.zzdlx.zzdlz.onAdClosed(this.zzdlx);
    }

    public final void onPause() {
        zzbbd.zzef("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        zzbbd.zzef("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzuj() {
        zzbbd.zzef("Opening AdMobCustomTabsAdapter overlay.");
        this.zzdlx.zzdlz.onAdOpened(this.zzdlx);
    }
}
