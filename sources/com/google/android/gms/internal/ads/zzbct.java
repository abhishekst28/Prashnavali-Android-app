package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbct implements Runnable {
    private final zzbcr zzege;
    private final boolean zzegf;

    zzbct(zzbcr zzbcr, boolean z) {
        this.zzege = zzbcr;
        this.zzegf = z;
    }

    public final void run() {
        this.zzege.zzau(this.zzegf);
    }
}
