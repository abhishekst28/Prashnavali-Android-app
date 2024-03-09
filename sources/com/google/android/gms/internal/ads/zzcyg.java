package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcyg implements Runnable {
    private final zzcyd zzgrh;

    zzcyg(zzcyd zzcyd) {
        this.zzgrh = zzcyd;
    }

    public final void run() {
        this.zzgrh.zzgrg.zzgrc.zzaqi().onAdLoaded();
    }
}
