package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdpi extends zzbxe<zzdpl> implements zzdpd<zzdpg> {
    zzdpi(Set<zzbys<zzdpl>> set) {
        super(set);
    }

    public final void zza(zzdos<zzdpg, ?> zzdos) {
        zza(new zzdph(zzdos));
    }

    public final void zzb(zzdos<zzdpg, ?> zzdos) {
        zza(new zzdpk(zzdos));
    }

    public final void zza(zzdos<zzdpg, ?> zzdos, Throwable th) {
        zza(new zzdpj(zzdos, th));
    }

    public final void zzc(zzdos<zzdpg, ?> zzdos) {
        zza(new zzdpm(zzdos));
    }
}
