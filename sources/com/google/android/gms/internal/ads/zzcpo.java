package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcpo implements Callable {
    private final zzdvt zzfsi;
    private final zzdvt zzgbt;

    zzcpo(zzdvt zzdvt, zzdvt zzdvt2) {
        this.zzgbt = zzdvt;
        this.zzfsi = zzdvt2;
    }

    public final Object call() {
        zzdvt zzdvt = this.zzgbt;
        zzdvt zzdvt2 = this.zzfsi;
        return new zzcpx((zzcqe) zzdvt.get(), ((zzcpy) zzdvt2.get()).zzgjh, ((zzcpy) zzdvt2.get()).zzgji);
    }
}
