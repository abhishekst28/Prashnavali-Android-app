package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbpr implements zzdvi<zzbpj> {
    private final /* synthetic */ zzdvi zzfqf;
    private final /* synthetic */ zzbpo zzfqg;

    zzbpr(zzbpo zzbpo, zzdvi zzdvi) {
        this.zzfqg = zzbpo;
        this.zzfqf = zzdvi;
    }

    public final void zzb(Throwable th) {
        this.zzfqf.zzb(th);
        this.zzfqg.zzaip();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzfqg.zza(((zzbpj) obj).zzfpy, this.zzfqf);
    }
}
