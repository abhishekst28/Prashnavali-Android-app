package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcxn implements zzdvi<zzbzr> {
    private final /* synthetic */ zzcar zzgqo;
    final /* synthetic */ zzcxo zzgqp;

    zzcxn(zzcxo zzcxo, zzcar zzcar) {
        this.zzgqp = zzcxo;
        this.zzgqo = zzcar;
    }

    public final void zzb(Throwable th) {
        zzuw zze = zzcmt.zze(th);
        synchronized (this.zzgqp) {
            zzdvt unused = this.zzgqp.zzgqd = null;
            this.zzgqo.zzafd().zzg(zze);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                this.zzgqp.zzgmy.zzadj().execute(new zzcxs(this, zze));
                this.zzgqp.zzgmy.zzadj().execute(new zzcxr(this, zze));
            }
            zzdly.zza(zze.errorCode, th, "InterstitialAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbzr zzbzr = (zzbzr) obj;
        synchronized (this.zzgqp) {
            zzdvt unused = this.zzgqp.zzgqd = null;
            zzbzr unused2 = this.zzgqp.zzgqr = zzbzr;
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxs)).booleanValue()) {
                zzbzr.zzaio().zza(this.zzgqp.zzgpw).zza(this.zzgqp.zzgpy).zza(this.zzgqp.zzgpz).zza(this.zzgqp.zzgqq);
            }
            zzbzr.zzahw();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxs)).booleanValue()) {
                this.zzgqp.zzgmy.zzadj().execute(new zzcxq(this));
                this.zzgqp.zzgmy.zzadj().execute(new zzcxp(this));
            }
        }
    }
}
