package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctn implements zzcrh<zzcco, zzdlx, zzcso> {
    private final Executor zzfmk;
    private final zzcbn zzgmp;
    private final Context zzvr;

    public zzctn(Context context, zzcbn zzcbn, Executor executor) {
        this.zzvr = context;
        this.zzgmp = zzcbn;
        this.zzfmk = executor;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzdlx, zzcso> zzcrg) throws zzdlr {
        ((zzdlx) zzcrg.zzdkn).zza(this.zzvr, zzdlj.zzhbp.zzfqn.zzhbu, zzdkx.zzhar.toString(), zzbab.zza((zzbac) zzdkx.zzhao), (zzana) zzcrg.zzglc, zzdlj.zzhbp.zzfqn.zzdla, zzdlj.zzhbp.zzfqn.zzhbw);
    }

    private static boolean zza(zzdlj zzdlj, int i) {
        return zzdlj.zzhbp.zzfqn.zzhbw.contains(Integer.toString(i));
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzccv zzccv;
        zzand zztp = ((zzdlx) zzcrg.zzdkn).zztp();
        zzani zztq = ((zzdlx) zzcrg.zzdkn).zztq();
        zzanj zztv = ((zzdlx) zzcrg.zzdkn).zztv();
        if (zztv != null && zza(zzdlj, 6)) {
            zzccv = zzccv.zzb(zztv);
        } else if (zztp != null && zza(zzdlj, 6)) {
            zzccv = zzccv.zzb(zztp);
        } else if (zztp != null && zza(zzdlj, 2)) {
            zzccv = zzccv.zza(zztp);
        } else if (zztq != null && zza(zzdlj, 6)) {
            zzccv = zzccv.zzb(zztq);
        } else if (zztq == null || !zza(zzdlj, 1)) {
            throw new zzcuh(zzdmd.zzhco, "No native ad mappers");
        } else {
            zzccv = zzccv.zza(zztq);
        }
        if (zzdlj.zzhbp.zzfqn.zzhbw.contains(Integer.toString(zzccv.zzaln()))) {
            zzcda zza = this.zzgmp.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzcdh(zzccv), new zzcew(zztq, zztp, zztv));
            ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzaer());
            zza.zzaem().zza(new zzbll((zzdlx) zzcrg.zzdkn), this.zzfmk);
            return zza.zzaet();
        }
        throw new zzcuh(zzdmd.zzhco, "No corresponding native ad listener");
    }
}
