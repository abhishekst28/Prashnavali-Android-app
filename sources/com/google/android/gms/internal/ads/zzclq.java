package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzclq implements Runnable {
    private final String zzdft;
    private final zzcln zzgfp;

    zzclq(zzcln zzcln, String str) {
        this.zzgfp = zzcln;
        this.zzdft = str;
    }

    public final void run() {
        this.zzgfp.zzgi(this.zzdft);
    }
}
