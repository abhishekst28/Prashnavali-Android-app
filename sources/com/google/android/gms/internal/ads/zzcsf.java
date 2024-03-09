package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcsf implements zzcaz {
    private final zzbbq zzbvp;

    zzcsf(zzbbq zzbbq) {
        this.zzbvp = zzbbq;
    }

    public final void zza(boolean z, Context context) {
        zzbbq zzbbq = this.zzbvp;
        try {
            zzp.zzko();
            zzn.zza(context, (AdOverlayInfoParcel) zzbbq.get(), true);
        } catch (Exception e) {
        }
    }
}
