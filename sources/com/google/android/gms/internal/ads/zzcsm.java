package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcsm implements zzdvi<zzbni> {
    private final /* synthetic */ zzcsh zzgma;

    zzcsm(zzcsh zzcsh) {
        this.zzgma = zzcsh;
    }

    public final void zzb(Throwable th) {
        zzuw zze = zzcmt.zze(th);
        this.zzgma.zzfue.zzg(zze);
        zzdly.zza(zze.errorCode, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbni) obj).zzahw();
    }
}
