package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdga implements zzden<zzdgb> {
    private String packageName;
    private zzdvw zzgay;
    private zzaxc zzgwk;

    public zzdga(zzaxc zzaxc, zzdvw zzdvw, String str) {
        this.zzgwk = zzaxc;
        this.zzgay = zzdvw;
        this.packageName = str;
    }

    public final zzdvt<zzdgb> zzaqs() {
        new zzbbq();
        zzdvt<String> zzaf = zzdvl.zzaf(null);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvc)).booleanValue()) {
            zzaf = this.zzgwk.zzeg(this.packageName);
        }
        zzdvt<String> zzeh = this.zzgwk.zzeh(this.packageName);
        return zzdvl.zzb((zzdvt<? extends V>[]) new zzdvt[]{zzaf, zzeh}).zza(new zzdgd(zzaf, zzeh), zzbbi.zzedu);
    }
}
