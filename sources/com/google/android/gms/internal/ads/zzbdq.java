package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbdq implements Runnable {
    private final int zzeax;
    private final int zzeay;
    private final zzbdl zzeiv;

    zzbdq(zzbdl zzbdl, int i, int i2) {
        this.zzeiv = zzbdl;
        this.zzeax = i;
        this.zzeay = i2;
    }

    public final void run() {
        this.zzeiv.zzp(this.zzeax, this.zzeay);
    }
}
