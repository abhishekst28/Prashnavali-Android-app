package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbdv implements Runnable {
    private final boolean zzegf;
    private final zzbdl zzeiv;
    private final long zzejh;

    zzbdv(zzbdl zzbdl, boolean z, long j) {
        this.zzeiv = zzbdl;
        this.zzegf = z;
        this.zzejh = j;
    }

    public final void run() {
        this.zzeiv.zzc(this.zzegf, this.zzejh);
    }
}
