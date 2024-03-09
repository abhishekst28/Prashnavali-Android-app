package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcrk implements zzcre<zzbnc> {
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzbmw zzglf;
    private final Context zzvr;

    public zzcrk(zzbmw zzbmw, Context context, Executor executor, zzcih zzcih, zzdln zzdln) {
        this.zzvr = context;
        this.zzglf = zzbmw;
        this.zzfmk = executor;
        this.zzfzy = zzcih;
        this.zzfqn = zzdln;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (zzdkx.zzhao == null || zzdkx.zzhao.zzdou == null) ? false : true;
    }

    public final zzdvt<zzbnc> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzcrj(this, zzdlj, zzdkx), this.zzfmk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdlj zzdlj, zzdkx zzdkx, Object obj) throws Exception {
        zzvj zzb = zzdls.zzb(this.zzvr, zzdkx.zzhaq);
        zzbfq zzc = this.zzfzy.zzc(zzb);
        zzbmq zza = this.zzglf.zza(new zzbpt(zzdlj, zzdkx, (String) null), new zzbmp(zzc.getView(), zzc, zzdls.zzf(zzb), zzdkx.zzfnn, zzdkx.zzfno, zzdkx.zzfnp));
        zza.zzafo().zzb(zzc, false);
        zza.zzaep().zza(new zzcrm(zzc), zzbbi.zzedz);
        zza.zzafo();
        return zzdvl.zzb(zzcij.zza(zzc, zzdkx.zzhao.zzdos, zzdkx.zzhao.zzdou), new zzcrl(zza), (Executor) zzbbi.zzedz);
    }
}
