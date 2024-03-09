package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcta implements zzcaz {
    private final zzcrg zzglo;

    zzcta(zzcrg zzcrg) {
        this.zzglo = zzcrg;
    }

    public final void zza(boolean z, Context context) {
        zzcrg zzcrg = this.zzglo;
        try {
            ((zzdlx) zzcrg.zzdkn).setImmersiveMode(z);
            ((zzdlx) zzcrg.zzdkn).showInterstitial();
        } catch (zzdlr e) {
            zzaxy.zzfd("Cannot show interstitial.");
            throw new zzcbc(e.getCause());
        }
    }
}
