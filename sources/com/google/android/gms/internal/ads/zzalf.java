package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzalf implements Runnable {
    private final zzalg zzdhj;
    private final zzajx zzdhk;

    zzalf(zzalg zzalg, zzajx zzajx) {
        this.zzdhj = zzalg;
        this.zzdhk = zzajx;
    }

    public final void run() {
        zzalg zzalg = this.zzdhj;
        zzajx zzajx = this.zzdhk;
        zzalg.zzdhl.zzdgp.zzh(zzajx);
        zzajx.destroy();
    }
}
