package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzxs extends zzxq {
    private final MuteThisAdListener zzciz;

    public zzxs(MuteThisAdListener muteThisAdListener) {
        this.zzciz = muteThisAdListener;
    }

    public final void onAdMuted() {
        this.zzciz.onAdMuted();
    }
}
