package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbzu implements Runnable {
    private final zzbfq zzepi;

    private zzbzu(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    static Runnable zzh(zzbfq zzbfq) {
        return new zzbzu(zzbfq);
    }

    public final void run() {
        this.zzepi.destroy();
    }
}
