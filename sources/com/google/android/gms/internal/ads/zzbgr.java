package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbgr implements Runnable {
    private final String zzdft;
    private final zzbgp zzepl;

    zzbgr(zzbgp zzbgp, String str) {
        this.zzepl = zzbgp;
        this.zzdft = str;
    }

    public final void run() {
        this.zzepl.zzfu(this.zzdft);
    }
}
