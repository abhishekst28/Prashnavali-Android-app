package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zztk implements Runnable {
    private final zzbbq zzbvp;
    private final Future zzbvq;

    zztk(zzbbq zzbbq, Future future) {
        this.zzbvp = zzbbq;
        this.zzbvq = future;
    }

    public final void run() {
        zzbbq zzbbq = this.zzbvp;
        Future future = this.zzbvq;
        if (zzbbq.isCancelled()) {
            future.cancel(true);
        }
    }
}
