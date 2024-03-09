package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcmh implements Runnable {
    private final zzcmi zzgfz;
    private final zzaim zzgga;

    zzcmh(zzcmi zzcmi, zzaim zzaim) {
        this.zzgfz = zzcmi;
        this.zzgga = zzaim;
    }

    public final void run() {
        this.zzgfz.zzc(this.zzgga);
    }
}
