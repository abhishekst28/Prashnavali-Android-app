package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcks implements zzdpl {
    private zzto zzgei;
    private Map<zzdpg, zzcku> zzger;

    zzcks(zzto zzto, Map<zzdpg, zzcku> map) {
        this.zzger = map;
        this.zzgei = zzto;
    }

    public final void zza(zzdpg zzdpg, String str) {
    }

    public final void zzb(zzdpg zzdpg, String str) {
        if (this.zzger.containsKey(zzdpg)) {
            this.zzgei.zza(this.zzger.get(zzdpg).zzget);
        }
    }

    public final void zza(zzdpg zzdpg, String str, Throwable th) {
        if (this.zzger.containsKey(zzdpg)) {
            this.zzgei.zza(this.zzger.get(zzdpg).zzgev);
        }
    }

    public final void zzc(zzdpg zzdpg, String str) {
        if (this.zzger.containsKey(zzdpg)) {
            this.zzgei.zza(this.zzger.get(zzdpg).zzgeu);
        }
    }
}
