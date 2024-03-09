package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcsa implements zzcrh<zzbni, zzapa, zzcso> {
    /* access modifiers changed from: private */
    public View view;
    private final zzboe zzglh;
    private final Context zzvr;

    public zzcsa(Context context, zzboe zzboe) {
        this.zzvr = context;
        this.zzglh = zzboe;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzapa, zzcso> zzcrg) throws zzdlr {
        try {
            ((zzapa) zzcrg.zzdkn).zzdr(zzdkx.zzdln);
            ((zzapa) zzcrg.zzdkn).zza(zzdkx.zzeqb, zzdkx.zzhar.toString(), zzdlj.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), new zzcsb(this, zzcrg), (zzana) zzcrg.zzglc, zzdlj.zzhbp.zzfqn.zzbpb);
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzbnh zza = this.zzglh.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzbnl(this.view, (zzbfq) null, new zzcrz(zzcrg), zzdkx.zzhaq.get(0)));
        zza.zzaft().zzv(this.view);
        ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzaes());
        return zza.zzafs();
    }

    static final /* synthetic */ zzyg zza(zzcrg zzcrg) throws zzdlr {
        try {
            return ((zzapa) zzcrg.zzdkn).getVideoController();
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }
}
