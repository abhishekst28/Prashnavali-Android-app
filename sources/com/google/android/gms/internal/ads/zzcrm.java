package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcrm implements zzbtm {
    private final zzbfq zzepi;

    zzcrm(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    public final void onAdImpression() {
        zzbfq zzbfq = this.zzepi;
        if (zzbfq.zzabe() != null) {
            zzbfq.zzabe().zzacd();
        }
    }
}
