package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdwj extends zzdvs<V> {
    private final Callable<V> zzhpl;
    private final /* synthetic */ zzdwh zzhqn;

    zzdwj(zzdwh zzdwh, Callable<V> callable) {
        this.zzhqn = zzdwh;
        this.zzhpl = (Callable) zzdsv.checkNotNull(callable);
    }

    /* access modifiers changed from: package-private */
    public final boolean isDone() {
        return this.zzhqn.isDone();
    }

    /* access modifiers changed from: package-private */
    public final V zzaxi() throws Exception {
        return this.zzhpl.call();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(V v, Throwable th) {
        if (th == null) {
            this.zzhqn.set(v);
        } else {
            this.zzhqn.setException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzaxj() {
        return this.zzhpl.toString();
    }
}
