package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdvv {
    public static Executor zzaxm() {
        return zzdva.INSTANCE;
    }

    public static zzdvw zza(ExecutorService executorService) {
        if (executorService instanceof zzdvw) {
            return (zzdvw) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new zzdvz((ScheduledExecutorService) executorService);
        }
        return new zzdwa(executorService);
    }

    static Executor zza(Executor executor, zzdui<?> zzdui) {
        zzdsv.checkNotNull(executor);
        zzdsv.checkNotNull(zzdui);
        if (executor == zzdva.INSTANCE) {
            return executor;
        }
        return new zzdvy(executor, zzdui);
    }
}
