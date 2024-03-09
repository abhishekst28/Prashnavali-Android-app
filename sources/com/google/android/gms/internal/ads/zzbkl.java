package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbkl implements Runnable {
    private final zzbkj zzfkp;
    private final Runnable zzfkq;

    zzbkl(zzbkj zzbkj, Runnable runnable) {
        this.zzfkp = zzbkj;
        this.zzfkq = runnable;
    }

    public final void run() {
        this.zzfkp.zzd(this.zzfkq);
    }
}
