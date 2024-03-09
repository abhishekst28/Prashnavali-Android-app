package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbbq<T> implements zzdvt<T> {
    private final zzdwe<T> zzeee = zzdwe.zzaxn();

    public final boolean set(T t) {
        return zzas(this.zzeee.set(t));
    }

    public final boolean setException(Throwable th) {
        return zzas(this.zzeee.setException(th));
    }

    private static boolean zzas(boolean z) {
        if (!z) {
            zzp.zzkt().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.zzeee.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.zzeee.cancel(z);
    }

    public boolean isCancelled() {
        return this.zzeee.isCancelled();
    }

    public boolean isDone() {
        return this.zzeee.isDone();
    }

    public T get() throws ExecutionException, InterruptedException {
        return this.zzeee.get();
    }

    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzeee.get(j, timeUnit);
    }
}
