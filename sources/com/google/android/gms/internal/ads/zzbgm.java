package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbgm implements Runnable {
    private final int zzeax;
    private final int zzeay;
    private final boolean zzemt;
    private final boolean zzemu;
    private final zzbgk zzeph;

    zzbgm(zzbgk zzbgk, int i, int i2, boolean z, boolean z2) {
        this.zzeph = zzbgk;
        this.zzeax = i;
        this.zzeay = i2;
        this.zzemt = z;
        this.zzemu = z2;
    }

    public final void run() {
        this.zzeph.zzb(this.zzeax, this.zzeay, this.zzemt, this.zzemu);
    }
}
