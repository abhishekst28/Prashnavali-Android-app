package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbpu implements zzdvi<zzbpd> {
    private final /* synthetic */ zzdvi zzfqf;
    private final /* synthetic */ zzbpo zzfqg;

    zzbpu(zzbpo zzbpo, zzdvi zzdvi) {
        this.zzfqg = zzbpo;
        this.zzfqf = zzdvi;
    }

    public final void zzb(Throwable th) {
        this.zzfqg.zzaip();
        this.zzfqf.zzb(th);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzfqg.zzaip();
        this.zzfqf.onSuccess((zzbpd) obj);
    }
}
