package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzin implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ int zzajg;
    private final /* synthetic */ long zzajh;
    private final /* synthetic */ long zzaji;

    zzin(zzij zzij, int i, long j, long j2) {
        this.zzaiz = zzij;
        this.zzajg = i;
        this.zzajh = j;
        this.zzaji = j2;
    }

    public final void run() {
        this.zzaiz.zzaja.zza(this.zzajg, this.zzajh, this.zzaji);
    }
}
