package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbcq implements Runnable {
    private final zzbcp zzefl;

    private zzbcq(zzbcp zzbcp) {
        this.zzefl = zzbcp;
    }

    static Runnable zza(zzbcp zzbcp) {
        return new zzbcq(zzbcp);
    }

    public final void run() {
        this.zzefl.stop();
    }
}
