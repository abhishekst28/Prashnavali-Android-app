package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcqj implements Callable {
    private final zzcqi zzgjs;

    private zzcqj(zzcqi zzcqi) {
        this.zzgjs = zzcqi;
    }

    static Callable zza(zzcqi zzcqi) {
        return new zzcqj(zzcqi);
    }

    public final Object call() {
        return this.zzgjs.getWritableDatabase();
    }
}
