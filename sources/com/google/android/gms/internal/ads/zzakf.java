package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzakf implements Runnable {
    private final /* synthetic */ zzajz zzdgg;
    private final /* synthetic */ String zzdgi;

    zzakf(zzajz zzajz, String str) {
        this.zzdgg = zzajz;
        this.zzdgi = str;
    }

    public final void run() {
        this.zzdgg.zzdgc.loadUrl(this.zzdgi);
    }
}
