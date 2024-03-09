package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzim implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ zzjl zzajf;

    zzim(zzij zzij, zzjl zzjl) {
        this.zzaiz = zzij;
        this.zzajf = zzjl;
    }

    public final void run() {
        this.zzajf.zzgl();
        this.zzaiz.zzaja.zzb(this.zzajf);
    }
}
