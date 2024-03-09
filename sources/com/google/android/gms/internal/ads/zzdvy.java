package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdvy implements Executor {
    boolean zzhqc = true;
    private final /* synthetic */ Executor zzhqd;
    private final /* synthetic */ zzdui zzhqe;

    zzdvy(Executor executor, zzdui zzdui) {
        this.zzhqd = executor;
        this.zzhqe = zzdui;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zzhqd.execute(new zzdvx(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.zzhqc) {
                this.zzhqe.setException(e);
            }
        }
    }
}
