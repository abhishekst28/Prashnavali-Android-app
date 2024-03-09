package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdhg implements Runnable {
    private final zzuw zzgqk;
    private final zzdhh zzgwz;

    zzdhg(zzdhh zzdhh, zzuw zzuw) {
        this.zzgwz = zzdhh;
        this.zzgqk = zzuw;
    }

    public final void run() {
        zzdhh zzdhh = this.zzgwz;
        zzdhh.zzgxb.zzgww.zzg(this.zzgqk);
    }
}
