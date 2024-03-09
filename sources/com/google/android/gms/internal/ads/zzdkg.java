package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdkg implements Runnable {
    private final zzuw zzgqk;
    private final zzdke zzgzr;

    zzdkg(zzdke zzdke, zzuw zzuw) {
        this.zzgzr = zzdke;
        this.zzgqk = zzuw;
    }

    public final void run() {
        zzdke zzdke = this.zzgzr;
        zzdke.zzgzq.zzgzn.zzg(this.zzgqk);
    }
}
