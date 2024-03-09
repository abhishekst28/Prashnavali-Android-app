package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzip implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ int zzall;

    zzip(zzij zzij, int i) {
        this.zzaiz = zzij;
        this.zzall = i;
    }

    public final void run() {
        this.zzaiz.zzaja.zzx(this.zzall);
    }
}
