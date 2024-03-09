package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzcnr implements zzduv<zzasp, zzdlj> {
    /* access modifiers changed from: private */
    public final zzbve zzgho;

    public zzcnr(zzbve zzbve) {
        this.zzgho = zzbve;
    }

    /* access modifiers changed from: protected */
    public abstract zzdvt<zzdlj> zzb(zzasp zzasp) throws zzcmt;

    public final /* synthetic */ zzdvt zzf(Object obj) throws Exception {
        zzasp zzasp = (zzasp) obj;
        this.zzgho.zzd(zzasp);
        zzdvt<zzdlj> zzb = zzb(zzasp);
        zzdvl.zza(zzb, new zzcnu(this), zzbbi.zzedz);
        return zzb;
    }
}
