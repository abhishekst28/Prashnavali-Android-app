package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbcv implements Runnable {
    private final /* synthetic */ zzbcr zzegd;

    zzbcv(zzbcr zzbcr) {
        this.zzegd = zzbcr;
    }

    public final void run() {
        this.zzegd.zzd("surfaceDestroyed", new String[0]);
    }
}
