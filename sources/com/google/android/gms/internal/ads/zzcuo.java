package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcuo implements zzcaz {
    private final zzcrg zzglo;

    zzcuo(zzcrg zzcrg) {
        this.zzglo = zzcrg;
    }

    public final void zza(boolean z, Context context) {
        zzcrg zzcrg = this.zzglo;
        try {
            ((zzdlx) zzcrg.zzdkn).setImmersiveMode(z);
            ((zzdlx) zzcrg.zzdkn).zzch(context);
        } catch (zzdlr e) {
            throw new zzcbc(e.getCause());
        }
    }
}
