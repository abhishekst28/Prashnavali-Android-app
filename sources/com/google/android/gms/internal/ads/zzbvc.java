package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbvc implements Runnable {
    private final WeakReference<zzbvb> zzftd;

    private zzbvc(zzbvb zzbvb) {
        this.zzftd = new WeakReference<>(zzbvb);
    }

    public final void run() {
        zzbvb zzbvb = (zzbvb) this.zzftd.get();
        if (zzbvb != null) {
            zzbvb.zzajo();
        }
    }
}
