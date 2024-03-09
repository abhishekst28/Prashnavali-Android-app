package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcva implements zzbtm {
    private final zzbfq zzepi;

    zzcva(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    public final void onAdImpression() {
        zzbfq zzbfq = this.zzepi;
        if (zzbfq.zzabe() != null) {
            zzbfq.zzabe().zzacd();
        }
    }
}
