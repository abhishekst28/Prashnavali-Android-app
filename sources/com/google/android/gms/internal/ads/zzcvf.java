package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcvf implements zzcrh<zzchu, zzdlx, zzcsn> {
    /* access modifiers changed from: private */
    public final Executor zzfmk;
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcvf(Context context, Executor executor, zzchx zzchx) {
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzgno = zzchx;
    }

    public final void zza(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzdlx, zzcsn> zzcrg) throws zzdlr {
        if (!((zzdlx) zzcrg.zzdkn).isInitialized()) {
            ((zzcsn) zzcrg.zzglc).zza((zzbzf) new zzcvh(this, zzdlj, zzdkx, zzcrg));
            ((zzdlx) zzcrg.zzdkn).zza(this.zzvr, zzdlj.zzhbp.zzfqn.zzhbu, (String) null, (zzaua) zzcrg.zzglc, zzdkx.zzhar.toString());
            return;
        }
        zzc(zzdlj, zzdkx, zzcrg);
    }

    /* access modifiers changed from: private */
    public static void zzc(zzdlj zzdlj, zzdkx zzdkx, zzcrg<zzdlx, zzcsn> zzcrg) {
        try {
            ((zzdlx) zzcrg.zzdkn).zza(zzdlj.zzhbp.zzfqn.zzhbu, zzdkx.zzhar.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcrg.zzfqh);
            zzaxy.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    public final /* synthetic */ Object zzb(zzdlj zzdlj, zzdkx zzdkx, zzcrg zzcrg) throws zzdlr, zzcuh {
        zzchw zza = this.zzgno.zza(new zzbpt(zzdlj, zzdkx, zzcrg.zzfqh), new zzchv(new zzcvi(zzcrg)));
        zza.zzaem().zza(new zzbll((zzdlx) zzcrg.zzdkn), this.zzfmk);
        zzbtu zzaen = zza.zzaen();
        zzbst zzaeo = zza.zzaeo();
        ((zzcsn) zzcrg.zzglc).zza((zzaua) new zzcvj(this, zza.zzagc(), zzaeo, zzaen, zza.zzagi()));
        return zza.zzagh();
    }
}
