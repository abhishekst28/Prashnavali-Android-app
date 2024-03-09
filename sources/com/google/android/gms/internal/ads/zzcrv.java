package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcrv implements zzcrh<zzbni, zzdlx, zzcso> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzboe zzglh;
    private final Context zzvr;

    public zzcrv(Context context, zzbbg zzbbg, zzboe zzboe, Executor executor) {
        this.zzvr = context;
        this.zzbop = zzbbg;
        this.zzglh = zzboe;
        this.zzfmk = executor;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzdlx, zzcso> zzcrg) throws zzdlr {
        zzvj zzvj;
        zzvj zzvj2 = zzdlj.zzhbp.zzfqn.zzbpb;
        if (zzvj2.zzchu) {
            zzvj = new zzvj(this.zzvr, zzb.zza(zzvj2.width, zzvj2.height));
        } else {
            zzvj = zzdls.zzb(this.zzvr, zzdkx.zzhaq);
        }
        if (this.zzbop.zzedr < 4100000) {
            ((zzdlx) zzcrg.zzdkn).zza(this.zzvr, zzvj, zzdlj.zzhbp.zzfqn.zzhbu, zzdkx.zzhar.toString(), (zzana) zzcrg.zzglc);
        } else {
            ((zzdlx) zzcrg.zzdkn).zza(this.zzvr, zzvj, zzdlj.zzhbp.zzfqn.zzhbu, zzdkx.zzhar.toString(), zzbab.zza((zzbac) zzdkx.zzhao), (zzana) zzcrg.zzglc);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzboe zzboe = this.zzglh;
        zzbpt zzbpt = new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh);
        View view = ((zzdlx) zzcrg.zzdkn).getView();
        zzdlx zzdlx = (zzdlx) zzcrg.zzdkn;
        zzdlx.getClass();
        zzbnh zza = zzboe.zza(zzbpt, new zzbnl(view, (zzbfq) null, zzcry.zza(zzdlx), zzdkx.zzhaq.get(0)));
        zza.zzaft().zzv(((zzdlx) zzcrg.zzdkn).getView());
        zza.zzaem().zza(new zzbll((zzdlx) zzcrg.zzdkn), this.zzfmk);
        ((zzcso) zzcrg.zzglc).zzb((zzana) zza.zzaer());
        return zza.zzafs();
    }
}
