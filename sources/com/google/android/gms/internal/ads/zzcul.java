package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcul implements zzcrh<zzchu, zzdlx, zzcso> {
    private final Executor zzfmk;
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcul(Context context, Executor executor, zzchx zzchx) {
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzgno = zzchx;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzdlx, zzcso> zzcrg) throws zzdlr {
        try {
            zzdln zzdln = zzdlj.zzhbp.zzfqn;
            if (zzdln.zzhcb.zzhbf == zzdlf.zzhbj) {
                ((zzdlx) zzcrg.zzdkn).zzc(this.zzvr, zzdln.zzhbu, zzdkx.zzhar.toString(), (zzana) zzcrg.zzglc);
            } else {
                ((zzdlx) zzcrg.zzdkn).zzb(this.zzvr, zzdln.zzhbu, zzdkx.zzhar.toString(), (zzana) zzcrg.zzglc);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcrg.zzfqh);
            zzaxy.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzchw zza = this.zzgno.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzchv(new zzcuo(zzcrg)));
        zza.zzaem().zza(new zzbll((zzdlx) zzcrg.zzdkn), this.zzfmk);
        ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzagj());
        return zza.zzagh();
    }
}
