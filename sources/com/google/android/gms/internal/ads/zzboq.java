package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzboq implements Runnable {
    private final Runnable zzfkq;
    private final zzboo zzfpc;

    zzboq(zzboo zzboo, Runnable runnable) {
        this.zzfpc = zzboo;
        this.zzfkq = runnable;
    }

    public final void run() {
        this.zzfpc.zze(this.zzfkq);
    }
}
