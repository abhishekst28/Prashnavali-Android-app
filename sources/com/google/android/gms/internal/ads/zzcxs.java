package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcxs implements Runnable {
    private final zzuw zzgqk;
    private final zzcxn zzgqt;

    zzcxs(zzcxn zzcxn, zzuw zzuw) {
        this.zzgqt = zzcxn;
        this.zzgqk = zzuw;
    }

    public final void run() {
        zzcxn zzcxn = this.zzgqt;
        zzcxn.zzgqp.zzgpw.zzg(this.zzgqk);
    }
}
