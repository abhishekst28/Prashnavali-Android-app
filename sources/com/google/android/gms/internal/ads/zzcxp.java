package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcxp implements Runnable {
    private final zzcxn zzgqt;

    zzcxp(zzcxn zzcxn) {
        this.zzgqt = zzcxn;
    }

    public final void run() {
        this.zzgqt.zzgqp.zzgqq.onAdLoaded();
    }
}
