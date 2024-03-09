package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcsq implements zzcre<zzbzr> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcsq(Context context, zzbbg zzbbg, zzdln zzdln, Executor executor, zzcar zzcar, zzcih zzcih) {
        this.zzvr = context;
        this.zzfqn = zzdln;
        this.zzglr = zzcar;
        this.zzfmk = executor;
        this.zzbop = zzbbg;
        this.zzfzy = zzcih;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (zzdkx.zzhao == null || zzdkx.zzhao.zzdou == null) ? false : true;
    }

    public final zzdvt<zzbzr> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        zzcix zzcix = new zzcix();
        zzdvt<zzbzr> zzb = zzdvl.zzb(zzdvl.zzaf(null), new zzcsp(this, zzdkx, zzcix, zzdlj), this.zzfmk);
        zzcix.getClass();
        zzb.addListener(zzcss.zza(zzcix), this.zzfmk);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdkx zzdkx, zzcix zzcix, zzdlj zzdlj, Object obj) throws Exception {
        zzdvt<?> zzdvt;
        zzbfq zza = this.zzfzy.zza(this.zzfqn.zzbpb, zzdkx.zzent);
        zza.zzba(zzdkx.zzdsu);
        zzcix.zzc(this.zzvr, zza.getView());
        zzbbq zzbbq = new zzbbq();
        zzbzt zza2 = this.zzglr.zza(new zzbpt(zzdlj, zzdkx, (String) null), new zzbzw(new zzcsw(this.zzvr, this.zzbop, zzbbq, zzdkx, zza), zza));
        zzbbq.set(zza2);
        zza2.zzaep().zza(new zzcsr(zza), zzbbi.zzedz);
        zza2.zzafo().zzb(zza, true);
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwc)).booleanValue() || !zzdkx.zzent) {
            zza2.zzafo();
            zzdvt = zzcij.zza(zza, zzdkx.zzhao.zzdos, zzdkx.zzhao.zzdou);
        } else {
            zzdvt = zzdvl.zzaf(null);
        }
        return zzdvl.zzb(zzdvt, new zzcsu(this, zza, zzdkx, zza2), this.zzfmk);
    }
}
