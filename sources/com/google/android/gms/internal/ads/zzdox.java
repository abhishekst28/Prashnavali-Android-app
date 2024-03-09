package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdox<O> {
    private final E zzhgq;
    private final String zzhgr;
    private final List<zzdvt<?>> zzhgt;
    final /* synthetic */ zzdor zzhgu;
    private final zzdvt<?> zzhgv;
    private final zzdvt<O> zzhgw;

    private zzdox(zzdor zzdor, E e, String str, zzdvt<?> zzdvt, List<zzdvt<?>> list, zzdvt<O> zzdvt2) {
        this.zzhgu = zzdor;
        this.zzhgq = e;
        this.zzhgr = str;
        this.zzhgv = zzdvt;
        this.zzhgt = list;
        this.zzhgw = zzdvt2;
    }

    public final zzdox<O> zzgx(String str) {
        return new zzdox(this.zzhgu, this.zzhgq, str, this.zzhgv, this.zzhgt, this.zzhgw);
    }

    public final <O2> zzdox<O2> zzb(zzdoq<O, O2> zzdoq) {
        return zza(new zzdpa(zzdoq));
    }

    public final <O2> zzdox<O2> zza(zzduv<O, O2> zzduv) {
        return zza(zzduv, (Executor) this.zzhgu.zzgay);
    }

    private final <O2> zzdox<O2> zza(zzduv<O, O2> zzduv, Executor executor) {
        return new zzdox(this.zzhgu, this.zzhgq, this.zzhgr, this.zzhgv, this.zzhgt, zzdvl.zzb(this.zzhgw, zzduv, executor));
    }

    public final <O2> zzdox<O2> zze(zzdvt<O2> zzdvt) {
        return zza(new zzdoz(zzdvt), (Executor) zzbbi.zzedz);
    }

    public final <T extends Throwable> zzdox<O> zza(Class<T> cls, zzdoq<T, O> zzdoq) {
        return zza(cls, new zzdpc(zzdoq));
    }

    public final <T extends Throwable> zzdox<O> zza(Class<T> cls, zzduv<T, O> zzduv) {
        zzdor zzdor = this.zzhgu;
        return new zzdox(zzdor, this.zzhgq, this.zzhgr, this.zzhgv, this.zzhgt, zzdvl.zzb(this.zzhgw, cls, zzduv, zzdor.zzgay));
    }

    public final zzdox<O> zza(long j, TimeUnit timeUnit) {
        zzdor zzdor = this.zzhgu;
        return new zzdox(zzdor, this.zzhgq, this.zzhgr, this.zzhgv, this.zzhgt, zzdvl.zza(this.zzhgw, j, timeUnit, zzdor.zzfnh));
    }

    public final zzdos<E, O> zzauz() {
        E e = this.zzhgq;
        String str = this.zzhgr;
        if (str == null) {
            str = this.zzhgu.zzv(e);
        }
        zzdos<E, O> zzdos = new zzdos<>(e, str, this.zzhgw);
        this.zzhgu.zzhgp.zza(zzdos);
        this.zzhgv.addListener(new zzdpb(this, zzdos), zzbbi.zzedz);
        zzdvl.zza(zzdos, new zzdpe(this, zzdos), zzbbi.zzedz);
        return zzdos;
    }

    public final zzdox<O> zzw(E e) {
        return this.zzhgu.zza(e, zzauz());
    }

    /* synthetic */ zzdox(zzdor zzdor, Object obj, String str, zzdvt zzdvt, List list, zzdvt zzdvt2, zzdou zzdou) {
        this(zzdor, obj, (String) null, zzdvt, list, zzdvt2);
    }
}
