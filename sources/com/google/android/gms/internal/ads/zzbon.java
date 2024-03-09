package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbon implements Runnable {
    private final AtomicReference zzfoz;

    zzbon(AtomicReference atomicReference) {
        this.zzfoz = atomicReference;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.zzfoz.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
