package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcxi implements Runnable {
    private final zzcxg zzgqj;
    private final zzuw zzgqk;

    zzcxi(zzcxg zzcxg, zzuw zzuw) {
        this.zzgqj = zzcxg;
        this.zzgqk = zzuw;
    }

    public final void run() {
        zzcxg zzcxg = this.zzgqj;
        zzcxg.zzgqh.zzgpw.zzg(this.zzgqk);
    }
}
