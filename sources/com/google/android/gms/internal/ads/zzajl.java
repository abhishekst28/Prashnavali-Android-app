package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzajl implements Runnable {
    private final zzajj zzdfs;
    private final String zzdft;

    zzajl(zzajj zzajj, String str) {
        this.zzdfs = zzajj;
        this.zzdft = str;
    }

    public final void run() {
        this.zzdfs.zzde(this.zzdft);
    }
}
