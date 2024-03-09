package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzchj implements zzt {
    private final zzbtu zzgcr;

    private zzchj(zzbtu zzbtu) {
        this.zzgcr = zzbtu;
    }

    static zzt zza(zzbtu zzbtu) {
        return new zzchj(zzbtu);
    }

    public final void zzuz() {
        this.zzgcr.onAdLeftApplication();
    }
}
