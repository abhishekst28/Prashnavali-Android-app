package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzql implements Runnable {
    private final /* synthetic */ zzjl zzajf;
    private final /* synthetic */ zzqg zzbmt;

    zzql(zzqg zzqg, zzjl zzjl) {
        this.zzbmt = zzqg;
        this.zzajf = zzjl;
    }

    public final void run() {
        this.zzajf.zzgl();
        this.zzbmt.zzbmu.zzf(this.zzajf);
    }
}
