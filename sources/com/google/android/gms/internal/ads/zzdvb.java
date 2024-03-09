package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
abstract class zzdvb<T> extends zzdvs<T> {
    private final /* synthetic */ zzduz zzhpm;
    private final Executor zzhpq;
    boolean zzhpr = true;

    zzdvb(zzduz zzduz, Executor executor) {
        this.zzhpm = zzduz;
        this.zzhpq = (Executor) zzdsv.checkNotNull(executor);
    }

    /* access modifiers changed from: package-private */
    public abstract void setValue(T t);

    /* access modifiers changed from: package-private */
    public final boolean isDone() {
        return this.zzhpm.isDone();
    }

    /* access modifiers changed from: package-private */
    public final void execute() {
        try {
            this.zzhpq.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.zzhpr) {
                this.zzhpm.setException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(T t, Throwable th) {
        zzdvb unused = this.zzhpm.zzhpn = null;
        if (th == null) {
            setValue(t);
        } else if (th instanceof ExecutionException) {
            this.zzhpm.setException(th.getCause());
        } else if (th instanceof CancellationException) {
            this.zzhpm.cancel(false);
        } else {
            this.zzhpm.setException(th);
        }
    }
}
