package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
class zzdwa extends zzdul {
    private final ExecutorService zzhqg;

    zzdwa(ExecutorService executorService) {
        this.zzhqg = (ExecutorService) zzdsv.checkNotNull(executorService);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.zzhqg.awaitTermination(j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.zzhqg.isShutdown();
    }

    public final boolean isTerminated() {
        return this.zzhqg.isTerminated();
    }

    public final void shutdown() {
        this.zzhqg.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.zzhqg.shutdownNow();
    }

    public final void execute(Runnable runnable) {
        this.zzhqg.execute(runnable);
    }
}
