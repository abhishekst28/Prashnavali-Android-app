package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdwh<V> extends zzdvf<V> implements RunnableFuture<V> {
    private volatile zzdvs<?> zzhqm;

    static <V> zzdwh<V> zzf(Callable<V> callable) {
        return new zzdwh<>(callable);
    }

    static <V> zzdwh<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzdwh<>(Executors.callable(runnable, v));
    }

    private zzdwh(Callable<V> callable) {
        this.zzhqm = new zzdwj(this, callable);
    }

    zzdwh(zzdut<V> zzdut) {
        this.zzhqm = new zzdwk(this, zzdut);
    }

    public final void run() {
        zzdvs<?> zzdvs = this.zzhqm;
        if (zzdvs != null) {
            zzdvs.run();
        }
        this.zzhqm = null;
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        zzdvs<?> zzdvs;
        super.afterDone();
        if (wasInterrupted() && (zzdvs = this.zzhqm) != null) {
            zzdvs.interruptTask();
        }
        this.zzhqm = null;
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        zzdvs<?> zzdvs = this.zzhqm;
        if (zzdvs == null) {
            return super.pendingToString();
        }
        String valueOf = String.valueOf(zzdvs);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
