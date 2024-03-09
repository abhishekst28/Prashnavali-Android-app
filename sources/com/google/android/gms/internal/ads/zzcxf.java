package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcxf implements Runnable {
    private final zzcxm zzgqf;

    private zzcxf(zzcxm zzcxm) {
        this.zzgqf = zzcxm;
    }

    static Runnable zzb(zzcxm zzcxm) {
        return new zzcxf(zzcxm);
    }

    public final void run() {
        this.zzgqf.onAdLoaded();
    }
}
