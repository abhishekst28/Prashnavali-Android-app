package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzqi implements Runnable {
    private final /* synthetic */ String zzajc;
    private final /* synthetic */ long zzajd;
    private final /* synthetic */ long zzaje;
    private final /* synthetic */ zzqg zzbmt;

    zzqi(zzqg zzqg, String str, long j, long j2) {
        this.zzbmt = zzqg;
        this.zzajc = str;
        this.zzajd = j;
        this.zzaje = j2;
    }

    public final void run() {
        this.zzbmt.zzbmu.zzd(this.zzajc, this.zzajd, this.zzaje);
    }
}
