package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzyu implements Runnable {
    private final zzyv zzcjw;
    private final Context zzcjx;

    zzyu(zzyv zzyv, Context context) {
        this.zzcjw = zzyv;
        this.zzcjx = context;
    }

    public final void run() {
        this.zzcjw.getRewardedVideoAdInstance(this.zzcjx);
    }
}
