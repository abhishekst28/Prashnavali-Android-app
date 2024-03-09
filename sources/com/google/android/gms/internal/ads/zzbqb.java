package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbqb<T> {
    private final Executor executor;
    private final zzcnt zzfql;
    private final zzcod zzfqm;
    private final zzdln zzfqn;
    private final zzdpf zzfqo;
    private final zzbld zzfqp;
    private final zzcuk<T> zzfqq;
    /* access modifiers changed from: private */
    public final zzbwx zzfqr;
    private final zzdlj zzfqs;
    private final zzcoz zzfqt;
    private final zzbrz zzfqu;
    private final zzcow zzfqv;

    zzbqb(zzcnt zzcnt, zzcod zzcod, zzdln zzdln, zzdpf zzdpf, zzbld zzbld, zzcuk<T> zzcuk, zzbwx zzbwx, zzdlj zzdlj, zzcoz zzcoz, zzbrz zzbrz, Executor executor2, zzcow zzcow) {
        this.zzfql = zzcnt;
        this.zzfqm = zzcod;
        this.zzfqn = zzdln;
        this.zzfqo = zzdpf;
        this.zzfqp = zzbld;
        this.zzfqq = zzcuk;
        this.zzfqr = zzbwx;
        this.zzfqs = zzdlj;
        this.zzfqt = zzcoz;
        this.zzfqu = zzbrz;
        this.executor = executor2;
        this.zzfqv = zzcow;
    }

    private final zzdvt<zzdlj> zza(zzdvt<zzasp> zzdvt) {
        if (this.zzfqs != null) {
            return this.zzfqo.zzu(zzdpg.SERVER_TRANSACTION).zze(zzdvl.zzaf(this.zzfqs)).zzauz();
        }
        zzp.zzkv().zzmt();
        if (this.zzfqn.zzhbu.zzchi != null) {
            return this.zzfqo.zzu(zzdpg.SERVER_TRANSACTION).zze(this.zzfqm.zzapk()).zzauz();
        }
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxu)).booleanValue()) {
            return this.zzfqo.zza(zzdpg.SERVER_TRANSACTION, zzdvt).zza(this.zzfql).zzauz();
        }
        zzdox<I> zza = this.zzfqo.zza(zzdpg.SERVER_TRANSACTION, zzdvt);
        zzcow zzcow = this.zzfqv;
        zzcow.getClass();
        return zza.zza(zzbqe.zza(zzcow)).zzauz();
    }

    public final zzdvt<zzdlj> zza(zzasp zzasp) {
        return zza((zzdvt<zzasp>) zzdvl.zzaf(zzasp));
    }

    public final zzdvt<zzdlj> zzaiu() {
        return zza(this.zzfqu.zzajd());
    }

    public final zzdvt<T> zzb(zzdvt<zzdlj> zzdvt) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcun)).booleanValue()) {
            return this.zzfqo.zza(zzdpg.RENDERER, zzdvt).zza(this.zzfqp).zza(this.zzfqq).zzauz();
        }
        return this.zzfqo.zza(zzdpg.RENDERER, zzdvt).zza(this.zzfqp).zza(this.zzfqq).zza((long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS).zzauz();
    }

    public final zzdvt<T> zzb(zzasp zzasp) {
        return zzb(zza(zzasp));
    }

    public final zzdvt<T> zzaiv() {
        return zzb(zzaiu());
    }

    public final zzbwx zzaiw() {
        return this.zzfqr;
    }

    public final zzdvt<zzasp> zza(zzdnd zzdnd) {
        zzdos<E, O2> zzauz = this.zzfqo.zza(zzdpg.GET_CACHE_KEY, this.zzfqu.zzajd()).zza(new zzbqd(this, zzdnd)).zzauz();
        zzdvl.zza(zzauz, new zzbqg(this), this.executor);
        return zzauz;
    }

    public final zzdvt<Void> zzc(zzasp zzasp) {
        zzdos<E, I> zzauz = this.zzfqo.zza(zzdpg.NOTIFY_CACHE_HIT, this.zzfqt.zzm(zzasp)).zzauz();
        zzdvl.zza(zzauz, new zzbqf(this), this.executor);
        return zzauz;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdnd zzdnd, zzasp zzasp) throws Exception {
        zzasp.zzdtg = zzdnd;
        return this.zzfqt.zzl(zzasp);
    }
}
