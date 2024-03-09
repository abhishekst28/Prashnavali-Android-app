package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcmv implements Callable {
    private final zzcmw zzggy;
    private final zzasp zzggz;

    zzcmv(zzcmw zzcmw, zzasp zzasp) {
        this.zzggy = zzcmw;
        this.zzggz = zzasp;
    }

    public final Object call() {
        return this.zzggy.zzf(this.zzggz);
    }
}
