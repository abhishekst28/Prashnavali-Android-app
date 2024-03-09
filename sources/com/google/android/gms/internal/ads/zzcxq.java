package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcxq implements Runnable {
    private final zzcxn zzgqt;

    zzcxq(zzcxn zzcxn) {
        this.zzgqt = zzcxn;
    }

    public final void run() {
        this.zzgqt.zzgqp.zzgpw.onAdLoaded();
    }
}
