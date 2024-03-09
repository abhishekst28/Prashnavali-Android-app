package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcvk implements Runnable {
    private final zzdkx zzfoo;
    private final zzdlj zzgbj;
    private final zzcvh zzgoc;
    private final zzcrg zzgod;

    zzcvk(zzcvh zzcvh, zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) {
        this.zzgoc = zzcvh;
        this.zzgbj = zzdlj;
        this.zzfoo = zzdkx;
        this.zzgod = zzcrg;
    }

    public final void run() {
        zzcvh zzcvh = this.zzgoc;
        zzcvf.zzc(this.zzgbj, this.zzfoo, this.zzgod);
    }
}
