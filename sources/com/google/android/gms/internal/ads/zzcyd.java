package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcyd implements zzdvi<zzbpd> {
    private final /* synthetic */ zzcya zzgre;
    private final /* synthetic */ zzcbn zzgrf;
    final /* synthetic */ zzcyc zzgrg;

    zzcyd(zzcyc zzcyc, zzcya zzcya, zzcbn zzcbn) {
        this.zzgrg = zzcyc;
        this.zzgre = zzcya;
        this.zzgrf = zzcbn;
    }

    public final void zzb(Throwable th) {
        zzuw zze = zzcmt.zze(th);
        this.zzgrf.zzafd().zzg(zze);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
            this.zzgrg.zzgmy.zzadj().execute(new zzcyf(this, zze));
        }
        zzdly.zza(zze.errorCode, th, "NativeAdLoader.onFailure");
        this.zzgre.zzaqe();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbpd zzbpd = (zzbpd) obj;
        synchronized (this.zzgrg) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
                zzbpd.zzaio().zza(this.zzgrg.zzgrc.zzaqg());
            }
            this.zzgre.onSuccess(zzbpd);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
                this.zzgrg.zzgmy.zzadj().execute(new zzcyg(this));
            }
        }
    }
}
