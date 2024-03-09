package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcrd<DelegateT, AdapterT> implements zzcre<AdapterT> {
    private final zzcre<DelegateT> zzgla;
    private final zzdsl<DelegateT, AdapterT> zzglb;

    public zzcrd(zzcre<DelegateT> zzcre, zzdsl<DelegateT, AdapterT> zzdsl) {
        this.zzgla = zzcre;
        this.zzglb = zzdsl;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return this.zzgla.zza(zzdlj, zzdkx);
    }

    public final zzdvt<AdapterT> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        return zzdvl.zzb(this.zzgla.zzb(zzdlj, zzdkx), this.zzglb, (Executor) zzbbi.zzedu);
    }
}
