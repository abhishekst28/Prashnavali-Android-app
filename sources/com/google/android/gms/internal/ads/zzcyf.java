package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcyf implements Runnable {
    private final zzuw zzgqk;
    private final zzcyd zzgrh;

    zzcyf(zzcyd zzcyd, zzuw zzuw) {
        this.zzgrh = zzcyd;
        this.zzgqk = zzuw;
    }

    public final void run() {
        zzcyd zzcyd = this.zzgrh;
        zzcyd.zzgrg.zzgrc.zzaqj().zzg(this.zzgqk);
    }
}
