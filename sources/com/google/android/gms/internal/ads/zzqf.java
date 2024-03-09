package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzqf implements Runnable {
    private final /* synthetic */ zzjl zzaiy;
    private final /* synthetic */ zzqg zzbmt;

    zzqf(zzqg zzqg, zzjl zzjl) {
        this.zzbmt = zzqg;
        this.zzaiy = zzjl;
    }

    public final void run() {
        this.zzbmt.zzbmu.zze(this.zzaiy);
    }
}
