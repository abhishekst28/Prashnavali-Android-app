package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcsy implements zzcaz {
    private zzbtl zzfrn = null;
    private final zzdkx zzfro;
    private final zzapa zzgmm;
    private final boolean zzgmn;

    zzcsy(zzdkx zzdkx, zzapa zzapa, boolean z) {
        this.zzfro = zzdkx;
        this.zzgmm = zzapa;
        this.zzgmn = z;
    }

    public final void zza(boolean z, Context context) throws zzcbc {
        boolean z2;
        try {
            if (this.zzgmn) {
                z2 = this.zzgmm.zzaa(ObjectWrapper.wrap(context));
            } else {
                z2 = this.zzgmm.zzz(ObjectWrapper.wrap(context));
            }
            if (!z2) {
                throw new zzcbc("Adapter failed to show.");
            } else if (this.zzfrn != null) {
                if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcpx)).booleanValue() && this.zzfro.zzhaz == 2) {
                    this.zzfrn.onAdImpression();
                }
            }
        } catch (Throwable th) {
            throw new zzcbc(th);
        }
    }

    public final void zza(zzbtl zzbtl) {
        this.zzfrn = zzbtl;
    }
}
