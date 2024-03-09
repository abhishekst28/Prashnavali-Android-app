package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcdu implements Runnable {
    private final zzcdr zzfzk;
    private final zzcep zzfzm;

    zzcdu(zzcdr zzcdr, zzcep zzcep) {
        this.zzfzk = zzcdr;
        this.zzfzm = zzcep;
    }

    public final void run() {
        this.zzfzk.zze(this.zzfzm);
    }
}
