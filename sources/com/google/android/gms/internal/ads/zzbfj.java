package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbfj implements Runnable {
    private final boolean zzegf;
    private final long zzejh;
    private final zzbde zzelq;

    zzbfj(zzbde zzbde, boolean z, long j) {
        this.zzelq = zzbde;
        this.zzegf = z;
        this.zzejh = j;
    }

    public final void run() {
        this.zzelq.zza(this.zzegf, this.zzejh);
    }
}
