package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzqh implements Runnable {
    private final /* synthetic */ zzho zzajb;
    private final /* synthetic */ zzqg zzbmt;

    zzqh(zzqg zzqg, zzho zzho) {
        this.zzbmt = zzqg;
        this.zzajb = zzho;
    }

    public final void run() {
        this.zzbmt.zzbmu.zzk(this.zzajb);
    }
}
