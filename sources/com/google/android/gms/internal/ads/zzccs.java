package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzccs implements Runnable {
    private final boolean zzegf;
    private final zzcco zzfww;

    zzccs(zzcco zzcco, boolean z) {
        this.zzfww = zzcco;
        this.zzegf = z;
    }

    public final void run() {
        this.zzfww.zzbj(this.zzegf);
    }
}
