package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzalz {
    private zzakk zzdie;
    private zzdvt<zzali> zzdif;

    zzalz(zzakk zzakk) {
        this.zzdie = zzakk;
    }

    private final void zztm() {
        if (this.zzdif == null) {
            zzbbq zzbbq = new zzbbq();
            this.zzdif = zzbbq;
            this.zzdie.zzb((zzeg) null).zza(new zzamc(zzbbq), new zzamb(zzbbq));
        }
    }

    public final <I, O> zzamg<I, O> zzb(String str, zzaln<I> zzaln, zzalo<O> zzalo) {
        zztm();
        return new zzamg<>(this.zzdif, str, zzaln, zzalo);
    }

    public final void zzc(String str, zzahf<? super zzali> zzahf) {
        zztm();
        this.zzdif = zzdvl.zzb(this.zzdif, new zzame(str, zzahf), (Executor) zzbbi.zzedz);
    }

    public final void zzd(String str, zzahf<? super zzali> zzahf) {
        this.zzdif = zzdvl.zzb(this.zzdif, new zzamd(str, zzahf), (Executor) zzbbi.zzedz);
    }
}
