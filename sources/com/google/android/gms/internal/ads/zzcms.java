package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcms implements Runnable {
    private final String zzdft;
    private final zzcmp zzggu;

    zzcms(zzcmp zzcmp, String str) {
        this.zzggu = zzcmp;
        this.zzdft = str;
    }

    public final void run() {
        zzcmp zzcmp = this.zzggu;
        zzcmp.zzggp.zzgl(this.zzdft);
    }
}
