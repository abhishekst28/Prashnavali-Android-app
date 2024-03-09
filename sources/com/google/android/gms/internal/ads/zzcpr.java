package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcpr implements Callable {
    private final zzdvt zzfqe;
    private final zzdvt zzfsi;
    private final zzcpj zzgjd;

    zzcpr(zzcpj zzcpj, zzdvt zzdvt, zzdvt zzdvt2) {
        this.zzgjd = zzcpj;
        this.zzfsi = zzdvt;
        this.zzfqe = zzdvt2;
    }

    public final Object call() {
        return this.zzgjd.zza(this.zzfsi, this.zzfqe);
    }
}
