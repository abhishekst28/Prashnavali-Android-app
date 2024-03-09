package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdot {
    private final E zzhgq;
    private final List<zzdvt<?>> zzhgt;
    private final /* synthetic */ zzdor zzhgu;

    private zzdot(zzdor zzdor, E e, List<zzdvt<?>> list) {
        this.zzhgu = zzdor;
        this.zzhgq = e;
        this.zzhgt = list;
    }

    public final <O> zzdox<O> zzb(Callable<O> callable) {
        zzdvm<V> zzk = zzdvl.zzk(this.zzhgt);
        zzdvt<C> zza = zzk.zza(zzdow.zzgtz, zzbbi.zzedz);
        zzdor zzdor = this.zzhgu;
        return new zzdox(zzdor, this.zzhgq, (String) null, zza, this.zzhgt, zzk.zza(callable, zzdor.zzgay), (zzdou) null);
    }
}
