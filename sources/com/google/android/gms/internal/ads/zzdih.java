package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdih<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdnw<AdT> {
    private final zzdiz<R, zzdnh<AdT>> zzgyq;

    public zzdih(zzdiz<R, zzdnh<AdT>> zzdiz) {
        this.zzgyq = zzdiz;
    }

    public final zzdvt<zzdnh<AdT>> zza(zzdnv zzdnv) {
        zzdig zzdig = (zzdig) zzdnv;
        return this.zzgyq.zza(zzdig.zzgyo, zzdig.zzgyn);
    }

    public final void zza(zzdnh<AdT> zzdnh) {
        zzdnh.zzhfh = ((zzbse) this.zzgyq.zzasb()).zzafc();
    }

    public final void zzb(Throwable th) {
    }
}
