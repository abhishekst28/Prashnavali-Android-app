package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdpr implements Runnable {
    private final String zzdft;
    private final zzdps zzhie;

    zzdpr(zzdps zzdps, String str) {
        this.zzhie = zzdps;
        this.zzdft = str;
    }

    public final void run() {
        this.zzhie.zzgz(this.zzdft);
    }
}
