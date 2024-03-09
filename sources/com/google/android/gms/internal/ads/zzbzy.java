package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbzy implements zzbwm {
    private final zzbfq zzepi;

    zzbzy(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    public final void zzaia() {
        zzbfq zzbfq = this.zzepi;
        if (zzbfq.zzaba() != null) {
            zzbfq.zzaba().close();
        }
    }
}
