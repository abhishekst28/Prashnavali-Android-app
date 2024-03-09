package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzarr implements Runnable {
    private final String zzdft;
    private final zzbbh zzdpt;

    zzarr(zzbbh zzbbh, String str) {
        this.zzdpt = zzbbh;
        this.zzdft = str;
    }

    public final void run() {
        this.zzdpt.zzes(this.zzdft);
    }
}
