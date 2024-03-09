package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdhh implements zzdvi<zzbnc> {
    private final /* synthetic */ zzcya zzgre;
    private final /* synthetic */ zzdhj zzgxa;
    final /* synthetic */ zzdhc zzgxb;

    zzdhh(zzdhc zzdhc, zzcya zzcya, zzdhj zzdhj) {
        this.zzgxb = zzdhc;
        this.zzgre = zzcya;
        this.zzgxa = zzdhj;
    }

    public final void zzb(Throwable th) {
        zzuw zze = zzcmt.zze(th);
        synchronized (this.zzgxb) {
            zzdvt unused = this.zzgxb.zzgqd = null;
            zzbmw zzbmw = (zzbmw) this.zzgxb.zzgwx.zzasb();
            if (zzbmw != null) {
                zzbmw.zzafd().zzg(zze);
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxr)).booleanValue()) {
                    this.zzgxb.zzfmk.execute(new zzdhg(this, zze));
                }
            } else {
                this.zzgxb.zzgww.zzg(zze);
                this.zzgxb.zzb((zzdiy) this.zzgxa).zzafl().zzafc().zzaiw().zzajs();
            }
            zzdly.zza(zze.errorCode, th, "AppOpenAdLoader.onFailure");
            this.zzgre.zzaqe();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbnc zzbnc = (zzbnc) obj;
        synchronized (this.zzgxb) {
            zzdvt unused = this.zzgxb.zzgqd = null;
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxr)).booleanValue()) {
                zzbnc.zzaio().zza(this.zzgxb.zzgww);
            }
            this.zzgre.onSuccess(zzbnc);
        }
    }
}
