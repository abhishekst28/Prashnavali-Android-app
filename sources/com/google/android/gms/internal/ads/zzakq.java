package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzakq implements Runnable {
    private final zzajx zzdgx;

    private zzakq(zzajx zzajx) {
        this.zzdgx = zzajx;
    }

    static Runnable zzb(zzajx zzajx) {
        return new zzakq(zzajx);
    }

    public final void run() {
        this.zzdgx.destroy();
    }
}
