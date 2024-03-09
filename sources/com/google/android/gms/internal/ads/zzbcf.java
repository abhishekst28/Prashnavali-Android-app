package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbcf implements Runnable {
    private final int zzeax;
    private final zzbcc zzefe;

    zzbcf(zzbcc zzbcc, int i) {
        this.zzefe = zzbcc;
        this.zzeax = i;
    }

    public final void run() {
        this.zzefe.zzdk(this.zzeax);
    }
}
