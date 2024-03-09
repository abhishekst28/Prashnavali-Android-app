package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcuv implements zzcre<zzchu> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcuv(Context context, zzbbg zzbbg, zzdln zzdln, Executor executor, zzchx zzchx, zzcih zzcih) {
        this.zzvr = context;
        this.zzfqn = zzdln;
        this.zzgno = zzchx;
        this.zzfmk = executor;
        this.zzbop = zzbbg;
        this.zzfzy = zzcih;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (zzdkx.zzhao == null || zzdkx.zzhao.zzdou == null) ? false : true;
    }

    public final zzdvt<zzchu> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        zzcix zzcix = new zzcix();
        zzdvt<zzchu> zzb = zzdvl.zzb(zzdvl.zzaf(null), new zzcuy(this, zzdkx, zzcix, zzdlj), this.zzfmk);
        zzcix.getClass();
        zzb.addListener(zzcux.zza(zzcix), this.zzfmk);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(zzdkx zzdkx, zzcix zzcix, zzdlj zzdlj, Object obj) throws Exception {
        zzdvt<?> zzdvt;
        zzdkx zzdkx2 = zzdkx;
        zzbfq zza = this.zzfzy.zza(this.zzfqn.zzbpb, zzdkx2.zzent);
        zza.zzba(zzdkx2.zzdsu);
        zzcix.zzc(this.zzvr, zza.getView());
        zzbbq zzbbq = new zzbbq();
        zzchx zzchx = this.zzgno;
        zzbpt zzbpt = new zzbpt(zzdlj, zzdkx2, (String) null);
        zzcvb zzcvb = r1;
        zzcvb zzcvb2 = new zzcvb(this.zzvr, this.zzfzy, this.zzfqn, this.zzbop, zzdkx, zzbbq, zza);
        zzchw zza2 = zzchx.zza(zzbpt, new zzchv(zzcvb, zza));
        zzbbq.set(zza2);
        zzahq.zza(zza, (zzahp) zza2.zzagi());
        zza2.zzaep().zza(new zzcva(zza), zzbbi.zzedz);
        zza2.zzafo().zzb(zza, true);
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwc)).booleanValue() || !zzdkx2.zzent) {
            zza2.zzafo();
            zzdvt = zzcij.zza(zza, zzdkx2.zzhao.zzdos, zzdkx2.zzhao.zzdou);
        } else {
            zzdvt = zzdvl.zzaf(null);
        }
        return zzdvl.zzb(zzdvt, new zzcuz(this, zza, zzdkx2, zza2), this.zzfmk);
    }
}
