package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdve<V> extends zzdvc<V> {
    private final zzdvt<V> zzhps;

    zzdve(zzdvt<V> zzdvt) {
        this.zzhps = (zzdvt) zzdsv.checkNotNull(zzdvt);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zzhps.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.zzhps.cancel(z);
    }

    public final boolean isCancelled() {
        return this.zzhps.isCancelled();
    }

    public final boolean isDone() {
        return this.zzhps.isDone();
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.zzhps.get();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzhps.get(j, timeUnit);
    }

    public final String toString() {
        return this.zzhps.toString();
    }
}
