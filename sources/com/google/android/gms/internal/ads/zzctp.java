package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctp implements zzcrh<zzcco, zzapa, zzcso> {
    private final zzcbn zzgmp;
    /* access modifiers changed from: private */
    public zzanj zzgmw;
    private final Context zzvr;

    public zzctp(Context context, zzcbn zzcbn) {
        this.zzvr = context;
        this.zzgmp = zzcbn;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzapa, zzcso> zzcrg) throws zzdlr {
        try {
            ((zzapa) zzcrg.zzdkn).zzdr(zzdkx.zzdln);
            ((zzapa) zzcrg.zzdkn).zza(zzdkx.zzeqb, zzdkx.zzhar.toString(), zzdlj.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), (zzaou) new zzctr(this, zzcrg), (zzana) zzcrg.zzglc);
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        if (zzdlj.zzhbp.zzfqn.zzhbw.contains(Integer.toString(6))) {
            zzccv zzb = zzccv.zzb(this.zzgmw);
            if (zzdlj.zzhbp.zzfqn.zzhbw.contains(Integer.toString(zzb.zzaln()))) {
                zzcda zza = this.zzgmp.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzcdh(zzb), new zzcew((zzani) null, (zzand) null, this.zzgmw));
                ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzaes());
                return zza.zzaet();
            }
            throw new zzcuh(zzdmd.zzhco, "No corresponding native ad listener");
        }
        throw new zzcuh(zzdmd.zzhcp, "Unified must be used for RTB.");
    }
}
