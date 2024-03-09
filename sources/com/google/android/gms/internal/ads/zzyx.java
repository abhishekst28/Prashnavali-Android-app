package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzyx implements Runnable {
    private final zzyv zzcjw;
    private final OnInitializationCompleteListener zzckd;

    zzyx(zzyv zzyv, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zzcjw = zzyv;
        this.zzckd = onInitializationCompleteListener;
    }

    public final void run() {
        this.zzcjw.zza(this.zzckd);
    }
}
