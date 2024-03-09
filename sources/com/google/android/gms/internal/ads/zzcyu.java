package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcyu implements Runnable {
    private final zzcyk zzgri;
    private final zzchc[] zzgrr;

    zzcyu(zzcyk zzcyk, zzchc[] zzchcArr) {
        this.zzgri = zzcyk;
        this.zzgrr = zzchcArr;
    }

    public final void run() {
        this.zzgri.zza(this.zzgrr);
    }
}
