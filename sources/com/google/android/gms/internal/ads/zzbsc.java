package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbsc implements Callable {
    private final zzbrz zzfsh;
    private final zzdvt zzfsi;

    zzbsc(zzbrz zzbrz, zzdvt zzdvt) {
        this.zzfsh = zzbrz;
        this.zzfsi = zzdvt;
    }

    public final Object call() {
        return this.zzfsh.zzc(this.zzfsi);
    }
}
