package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbbx<T> {
    private final zzbbq<T> zzeeh = new zzbbq<>();
    /* access modifiers changed from: private */
    public final AtomicInteger zzeei = new AtomicInteger(0);

    public zzbbx() {
        zzdvl.zza(this.zzeeh, new zzbbw(this), zzbbi.zzedz);
    }

    @Deprecated
    public final void zza(zzbbu<T> zzbbu, zzbbs zzbbs) {
        zzdvl.zza(this.zzeeh, new zzbbz(this, zzbbu, zzbbs), zzbbi.zzedz);
    }

    @Deprecated
    public final void zzm(T t) {
        this.zzeeh.set(t);
    }

    @Deprecated
    public final void reject() {
        this.zzeeh.setException(new Exception());
    }

    @Deprecated
    public final int getStatus() {
        return this.zzeei.get();
    }
}
