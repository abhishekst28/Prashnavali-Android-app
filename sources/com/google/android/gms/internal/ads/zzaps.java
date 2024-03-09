package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaps implements Runnable {
    private final /* synthetic */ zzapq zzdlx;
    private final /* synthetic */ AdOverlayInfoParcel zzdmf;

    zzaps(zzapq zzapq, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdlx = zzapq;
        this.zzdmf = adOverlayInfoParcel;
    }

    public final void run() {
        zzp.zzko();
        zzn.zza(this.zzdlx.zzdly, this.zzdmf, true);
    }
}
