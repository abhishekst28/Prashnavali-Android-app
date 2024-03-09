package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzduy extends zzdvb<V> {
    private final Callable<V> zzhpl;
    private final /* synthetic */ zzduz zzhpm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzduy(zzduz zzduz, Callable<V> callable, Executor executor) {
        super(zzduz, executor);
        this.zzhpm = zzduz;
        this.zzhpl = (Callable) zzdsv.checkNotNull(callable);
    }

    /* access modifiers changed from: package-private */
    public final V zzaxi() throws Exception {
        this.zzhpr = false;
        return this.zzhpl.call();
    }

    /* access modifiers changed from: package-private */
    public final void setValue(V v) {
        this.zzhpm.set(v);
    }

    /* access modifiers changed from: package-private */
    public final String zzaxj() {
        return this.zzhpl.toString();
    }
}
