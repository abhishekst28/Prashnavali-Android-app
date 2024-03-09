package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbbn extends zzdul {
    private final Executor zzeec;

    private zzbbn(Executor executor) {
        this.zzeec = executor;
    }

    public final void execute(Runnable runnable) {
        this.zzeec.execute(runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final boolean isTerminated() {
        return false;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ zzbbn(Executor executor, zzbbl zzbbl) {
        this(executor);
    }
}
