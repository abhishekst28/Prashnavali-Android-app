package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcsx implements zzcrh<zzbzr, zzdlx, zzcso> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcsx(Context context, zzbbg zzbbg, zzcar zzcar, Executor executor) {
        this.zzvr = context;
        this.zzbop = zzbbg;
        this.zzglr = zzcar;
        this.zzfmk = executor;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzdlx, zzcso> zzcrg) throws zzdlr {
        if (this.zzbop.zzedr < 4100000) {
            ((zzdlx) zzcrg.zzdkn).zza(this.zzvr, zzdlj.zzhbp.zzfqn.zzhbu, zzdkx.zzhar.toString(), (zzana) zzcrg.zzglc);
        } else {
            ((zzdlx) zzcrg.zzdkn).zza(this.zzvr, zzdlj.zzhbp.zzfqn.zzhbu, zzdkx.zzhar.toString(), zzbab.zza((zzbac) zzdkx.zzhao), (zzana) zzcrg.zzglc);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzbzt zza = this.zzglr.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzbzw(new zzcta(zzcrg)));
        zza.zzaem().zza(new zzbll((zzdlx) zzcrg.zzdkn), this.zzfmk);
        ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzaer());
        return zza.zzagb();
    }
}
