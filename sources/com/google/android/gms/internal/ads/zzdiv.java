package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdiv implements zzdsl<zzcpa, zzdix> {
    private final /* synthetic */ zzdit zzgza;

    zzdiv(zzdit zzdit) {
        this.zzgza = zzdit;
    }

    @NullableDecl
    public final /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbbd.zzc("", (zzcpa) obj);
        zzaxy.zzei("Failed to get a cache key, reverting to legacy flow.");
        zzdix unused = this.zzgza.zzgyz = new zzdix((zzasp) null, this.zzgza.zzash(), (zzdiv) null);
        return this.zzgza.zzgyz;
    }
}
