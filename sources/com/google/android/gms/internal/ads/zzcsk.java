package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcsk implements Callable {
    private final zzdkx zzfoo;
    private final zzdlj zzgbj;
    private final zzcsh zzgly;

    zzcsk(zzcsh zzcsh, zzdlj zzdlj, zzdkx zzdkx) {
        this.zzgly = zzcsh;
        this.zzgbj = zzdlj;
        this.zzfoo = zzdkx;
    }

    public final Object call() {
        return this.zzgly.zzc(this.zzgbj, this.zzfoo);
    }
}
