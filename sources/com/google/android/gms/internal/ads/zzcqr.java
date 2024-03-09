package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcqr implements zzdpl {
    private final zzcqq zzgki;

    zzcqr(zzcqq zzcqq) {
        this.zzgki = zzcqq;
    }

    public final void zza(zzdpg zzdpg, String str) {
    }

    public final void zzb(zzdpg zzdpg, String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue() && zzdpg.RENDERER == zzdpg) {
            this.zzgki.zzff(zzp.zzkw().elapsedRealtime());
        }
    }

    public final void zza(zzdpg zzdpg, String str, Throwable th) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue() && zzdpg.RENDERER == zzdpg && this.zzgki.zzapq() != 0) {
            this.zzgki.zzep(zzp.zzkw().elapsedRealtime() - this.zzgki.zzapq());
        }
    }

    public final void zzc(zzdpg zzdpg, String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue() && zzdpg.RENDERER == zzdpg && this.zzgki.zzapq() != 0) {
            this.zzgki.zzep(zzp.zzkw().elapsedRealtime() - this.zzgki.zzapq());
        }
    }
}
