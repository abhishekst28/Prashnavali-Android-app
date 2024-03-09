package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdgd implements Callable {
    private final zzdvt zzfsi;
    private final zzdvt zzgbt;

    zzdgd(zzdvt zzdvt, zzdvt zzdvt2) {
        this.zzgbt = zzdvt;
        this.zzfsi = zzdvt2;
    }

    public final Object call() {
        return new zzdgb((String) this.zzgbt.get(), (String) this.zzfsi.get());
    }
}
