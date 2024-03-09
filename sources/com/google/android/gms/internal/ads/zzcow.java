package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcow implements zzcox {
    private final zzdvw zzgay;
    private final Map<String, zzelx<zzcox>> zzgiq;
    /* access modifiers changed from: private */
    public final zzbve zzgir;

    public zzcow(Map<String, zzelx<zzcox>> map, zzdvw zzdvw, zzbve zzbve) {
        this.zzgiq = map;
        this.zzgay = zzdvw;
        this.zzgir = zzbve;
    }

    public final zzdvt<zzdlj> zzh(zzasp zzasp) {
        this.zzgir.zzd(zzasp);
        zzdvt<zzdlj> immediateFailedFuture = zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcq));
        for (String trim : ((String) zzwe.zzpu().zzd(zzaat.zzcxv)).split(",")) {
            zzelx zzelx = this.zzgiq.get(trim.trim());
            if (zzelx != null) {
                immediateFailedFuture = zzdvl.zzb(immediateFailedFuture, zzcmt.class, new zzcov(zzelx, zzasp), this.zzgay);
            }
        }
        zzdvl.zza(immediateFailedFuture, new zzcoy(this), zzbbi.zzedz);
        return immediateFailedFuture;
    }
}
