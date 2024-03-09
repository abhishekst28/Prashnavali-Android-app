package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdkh implements Runnable {
    private final zzdke zzgzr;

    zzdkh(zzdke zzdke) {
        this.zzgzr = zzdke;
    }

    public final void run() {
        this.zzgzr.zzgzq.zzgzn.onAdLoaded();
    }
}
