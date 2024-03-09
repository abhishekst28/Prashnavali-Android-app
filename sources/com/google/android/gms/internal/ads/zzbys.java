package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbys<T> {
    public Executor executor;
    public T zzfum;

    public static <T> zzbys<T> zzb(T t, Executor executor2) {
        return new zzbys<>(t, executor2);
    }

    public zzbys(T t, Executor executor2) {
        this.zzfum = t;
        this.executor = executor2;
    }
}
