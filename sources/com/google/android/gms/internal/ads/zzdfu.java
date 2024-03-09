package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdfu implements Callable {
    private final zzdfv zzgwg;

    zzdfu(zzdfv zzdfv) {
        this.zzgwg = zzdfv;
    }

    public final Object call() {
        zzdfv zzdfv = this.zzgwg;
        return new zzdfs(zzdfv.zzgwh.zzf(zzdfv.zzvr));
    }
}
