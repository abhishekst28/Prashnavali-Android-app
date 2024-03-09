package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzakc implements Runnable {
    private final String zzdft;
    private final zzajz zzdge;

    zzakc(zzajz zzajz, String str) {
        this.zzdge = zzajz;
        this.zzdft = str;
    }

    public final void run() {
        this.zzdge.zzdh(this.zzdft);
    }
}
