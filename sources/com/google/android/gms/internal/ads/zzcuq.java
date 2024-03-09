package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcuq implements zzcrh<zzchu, zzapa, zzcso> {
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcuq(Context context, zzchx zzchx) {
        this.zzvr = context;
        this.zzgno = zzchx;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzapa, zzcso> zzcrg) throws zzdlr {
        try {
            ((zzapa) zzcrg.zzdkn).zzdr(zzdkx.zzdln);
            if (zzdlj.zzhbp.zzfqn.zzhcb.zzhbf == zzdlf.zzhbj) {
                ((zzapa) zzcrg.zzdkn).zzb(zzdkx.zzeqb, zzdkx.zzhar.toString(), zzdlj.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), new zzcus(this, zzcrg), (zzana) zzcrg.zzglc);
            } else {
                ((zzapa) zzcrg.zzdkn).zza(zzdkx.zzeqb, zzdkx.zzhar.toString(), zzdlj.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), (zzaov) new zzcus(this, zzcrg), (zzana) zzcrg.zzglc);
            }
        } catch (RemoteException e) {
            zzaxy.zza("Remote exception loading a rewarded RTB ad", e);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzcsy zzcsy = new zzcsy(zzdkx, (zzapa) zzcrg.zzdkn, true);
        zzchw zza = this.zzgno.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzchv(zzcsy));
        zzcsy.zza(zza.zzaep());
        ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzagk());
        return zza.zzagh();
    }
}
