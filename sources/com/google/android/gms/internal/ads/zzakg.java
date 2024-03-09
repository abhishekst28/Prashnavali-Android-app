package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzakg implements Runnable {
    private final /* synthetic */ String zzdgf;
    private final /* synthetic */ zzajz zzdgg;

    zzakg(zzajz zzajz, String str) {
        this.zzdgg = zzajz;
        this.zzdgf = str;
    }

    public final void run() {
        this.zzdgg.zzdgc.loadData(this.zzdgf, "text/html", "UTF-8");
    }
}
