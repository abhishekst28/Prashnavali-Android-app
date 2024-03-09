package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdke implements zzdvi<zzchu> {
    private final /* synthetic */ zzcya zzgre;
    private final /* synthetic */ zzdkj zzgzp;
    final /* synthetic */ zzdkd zzgzq;

    zzdke(zzdkd zzdkd, zzcya zzcya, zzdkj zzdkj) {
        this.zzgzq = zzdkd;
        this.zzgre = zzcya;
        this.zzgzp = zzdkj;
    }

    public final void zzb(Throwable th) {
        zzuw zze = zzcmt.zze(th);
        synchronized (this.zzgzq) {
            zzchx zzchx = (zzchx) this.zzgzq.zzgwx.zzasb();
            if (zzchx != null) {
                zzchx.zzafd().zzg(zze);
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
                    this.zzgzq.zzfmk.execute(new zzdkg(this, zze));
                }
            } else {
                this.zzgzq.zzgzn.zzg(zze);
                this.zzgzq.zze(this.zzgzp).zzage().zzafc().zzaiw().zzajs();
            }
            zzdly.zza(zze.errorCode, th, "RewardedAdLoader.onFailure");
            this.zzgre.zzaqe();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzchu zzchu = (zzchu) obj;
        synchronized (this.zzgzq) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
                zzchu.zzaio().zza(this.zzgzq.zzgzn);
            }
            this.zzgre.onSuccess(zzchu);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
                this.zzgzq.zzfmk.execute(new zzdkh(this));
            }
            this.zzgzq.zzgzn.onAdMetadataChanged();
        }
    }
}
