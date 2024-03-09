package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzciu implements zzbhf {
    private final zzbbq zzbvp;

    zzciu(zzbbq zzbbq) {
        this.zzbvp = zzbbq;
    }

    public final void zzak(boolean z) {
        zzbbq zzbbq = this.zzbvp;
        if (z) {
            zzbbq.set(null);
        } else {
            zzbbq.setException(new Exception("Ad Web View failed to load."));
        }
    }
}
