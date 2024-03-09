package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbge implements Runnable {
    private final IObjectWrapper zzeni;

    zzbge(IObjectWrapper iObjectWrapper) {
        this.zzeni = iObjectWrapper;
    }

    public final void run() {
        zzp.zzle().zzac(this.zzeni);
    }
}
