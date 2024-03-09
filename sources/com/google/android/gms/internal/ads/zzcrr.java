package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcrr implements Runnable {
    private final zzbfq zzepi;

    private zzcrr(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    static Runnable zzh(zzbfq zzbfq) {
        return new zzcrr(zzbfq);
    }

    public final void run() {
        this.zzepi.zzabr();
    }
}
