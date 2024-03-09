package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzakn implements Runnable {
    private final zzakk zzdgk;
    private final zzalb zzdgs;
    private final zzajx zzdgt;

    zzakn(zzakk zzakk, zzalb zzalb, zzajx zzajx) {
        this.zzdgk = zzakk;
        this.zzdgs = zzalb;
        this.zzdgt = zzajx;
    }

    public final void run() {
        this.zzdgk.zza(this.zzdgs, this.zzdgt);
    }
}
