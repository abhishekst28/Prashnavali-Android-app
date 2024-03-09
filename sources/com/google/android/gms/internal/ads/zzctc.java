package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctc implements zzcrh<zzbzr, zzapa, zzcso> {
    private final zzcar zzglr;
    private final Context zzvr;

    public zzctc(Context context, zzcar zzcar) {
        this.zzvr = context;
        this.zzglr = zzcar;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzapa, zzcso> zzcrg) throws zzdlr {
        try {
            ((zzapa) zzcrg.zzdkn).zzdr(zzdkx.zzdln);
            ((zzapa) zzcrg.zzdkn).zza(zzdkx.zzeqb, zzdkx.zzhar.toString(), zzdlj.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), (zzaop) new zzcte(this, zzcrg), (zzana) zzcrg.zzglc);
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzcsy zzcsy = new zzcsy(zzdkx, (zzapa) zzcrg.zzdkn, false);
        zzbzt zza = this.zzglr.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzbzw(zzcsy));
        zzcsy.zza(zza.zzaep());
        ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzaes());
        return zza.zzagb();
    }
}
