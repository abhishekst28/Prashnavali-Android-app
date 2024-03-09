package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzqk implements Runnable {
    private final /* synthetic */ zzqg zzbmt;
    private final /* synthetic */ int zzbmz;
    private final /* synthetic */ long zzbna;

    zzqk(zzqg zzqg, int i, long j) {
        this.zzbmt = zzqg;
        this.zzbmz = i;
        this.zzbna = j;
    }

    public final void run() {
        this.zzbmt.zzbmu.zze(this.zzbmz, this.zzbna);
    }
}
