package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzdor<E> {
    /* access modifiers changed from: private */
    public static final zzdvt<?> zzhgo = zzdvl.zzaf(null);
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzfnh;
    /* access modifiers changed from: private */
    public final zzdvw zzgay;
    /* access modifiers changed from: private */
    public final zzdpd<E> zzhgp;

    public zzdor(zzdvw zzdvw, ScheduledExecutorService scheduledExecutorService, zzdpd<E> zzdpd) {
        this.zzgay = zzdvw;
        this.zzfnh = scheduledExecutorService;
        this.zzhgp = zzdpd;
    }

    /* access modifiers changed from: protected */
    public abstract String zzv(E e);

    public final zzdov zzu(E e) {
        return new zzdov(this, e);
    }

    public final <I> zzdox<I> zza(E e, zzdvt<I> zzdvt) {
        return new zzdox(this, e, (String) null, zzdvt, Collections.singletonList(zzdvt), zzdvt, (zzdou) null);
    }

    public final zzdot zza(E e, zzdvt<?>... zzdvtArr) {
        return new zzdot(this, e, Arrays.asList(zzdvtArr));
    }
}
