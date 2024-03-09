package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzii implements Runnable {
    private final /* synthetic */ zzjl zzaiy;
    private final /* synthetic */ zzij zzaiz;

    zzii(zzij zzij, zzjl zzjl) {
        this.zzaiz = zzij;
        this.zzaiy = zzjl;
    }

    public final void run() {
        this.zzaiz.zzaja.zza(this.zzaiy);
    }
}
