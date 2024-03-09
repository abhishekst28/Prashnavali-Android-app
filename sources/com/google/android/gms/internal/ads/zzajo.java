package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzajo implements Runnable {
    private final zzajj zzdfs;
    private final String zzdft;

    zzajo(zzajj zzajj, String str) {
        this.zzdfs = zzajj;
        this.zzdft = str;
    }

    public final void run() {
        this.zzdfs.zzdd(this.zzdft);
    }
}
