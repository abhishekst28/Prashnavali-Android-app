package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzik implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ zzho zzajb;

    zzik(zzij zzij, zzho zzho) {
        this.zzaiz = zzij;
        this.zzajb = zzho;
    }

    public final void run() {
        this.zzaiz.zzaja.zzb(this.zzajb);
    }
}
