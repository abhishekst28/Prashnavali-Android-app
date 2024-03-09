package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcsj implements Runnable {
    private final zzdkx zzfoo;
    private final zzdlj zzgbj;
    private final zzcsh zzgly;

    zzcsj(zzcsh zzcsh, zzdlj zzdlj, zzdkx zzdkx) {
        this.zzgly = zzcsh;
        this.zzgbj = zzdlj;
        this.zzfoo = zzdkx;
    }

    public final void run() {
        this.zzgly.zzd(this.zzgbj, this.zzfoo);
    }
}
