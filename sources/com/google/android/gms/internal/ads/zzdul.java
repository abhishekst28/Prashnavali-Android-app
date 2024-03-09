package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzdul extends AbstractExecutorService implements zzdvw {
    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return zzdwh.zza(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return zzdwh.zzf(callable);
    }

    /* renamed from: zzf */
    public final zzdvt<?> submit(Runnable runnable) {
        return (zzdvt) super.submit(runnable);
    }

    /* renamed from: zze */
    public final <T> zzdvt<T> submit(Callable<T> callable) {
        return (zzdvt) super.submit(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (zzdvt) super.submit(runnable, obj);
    }
}
