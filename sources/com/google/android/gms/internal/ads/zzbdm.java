package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbdm implements Runnable {
    private final String zzdft;
    private final zzbdl zzeiv;

    zzbdm(zzbdl zzbdl, String str) {
        this.zzeiv = zzbdl;
        this.zzdft = str;
    }

    public final void run() {
        this.zzeiv.zzfk(this.zzdft);
    }
}
