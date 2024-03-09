package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcht implements Runnable {
    private final zzbfq zzepi;

    private zzcht(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    static Runnable zzh(zzbfq zzbfq) {
        return new zzcht(zzbfq);
    }

    public final void run() {
        this.zzepi.destroy();
    }
}
