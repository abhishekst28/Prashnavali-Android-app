package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbds implements Runnable {
    private final int zzeax;
    private final zzbdl zzeiv;

    zzbds(zzbdl zzbdl, int i) {
        this.zzeiv = zzbdl;
        this.zzeax = i;
    }

    public final void run() {
        this.zzeiv.zzdr(this.zzeax);
    }
}
