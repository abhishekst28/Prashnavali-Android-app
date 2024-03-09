package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdov {
    private final E zzhgq;
    private final /* synthetic */ zzdor zzhgu;

    private zzdov(zzdor zzdor, E e) {
        this.zzhgu = zzdor;
        this.zzhgq = e;
    }

    public final <O> zzdox<O> zze(zzdvt<O> zzdvt) {
        return new zzdox(this.zzhgu, this.zzhgq, (String) null, zzdor.zzhgo, Collections.emptyList(), zzdvt, (zzdou) null);
    }

    public final <O> zzdox<O> zzc(Callable<O> callable) {
        return zza(callable, this.zzhgu.zzgay);
    }

    private final <O> zzdox<O> zza(Callable<O> callable, zzdvw zzdvw) {
        return new zzdox(this.zzhgu, this.zzhgq, (String) null, zzdor.zzhgo, Collections.emptyList(), zzdvw.zze(callable), (zzdou) null);
    }

    public final zzdox<?> zza(zzdop zzdop, zzdvw zzdvw) {
        return zza(new zzdoy(zzdop), zzdvw);
    }
}
