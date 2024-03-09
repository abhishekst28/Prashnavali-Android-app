package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzakj implements Runnable {
    private final zzakk zzdgk;
    private final zzeg zzdgl;
    private final zzalb zzdgm;

    zzakj(zzakk zzakk, zzeg zzeg, zzalb zzalb) {
        this.zzdgk = zzakk;
        this.zzdgl = zzeg;
        this.zzdgm = zzalb;
    }

    public final void run() {
        this.zzdgk.zza(this.zzdgl, this.zzdgm);
    }
}
