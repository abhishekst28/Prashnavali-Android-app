package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcmq implements Runnable {
    private final zzcmi zzgfz;
    private final zzbbq zzggj;

    zzcmq(zzcmi zzcmi, zzbbq zzbbq) {
        this.zzgfz = zzcmi;
        this.zzggj = zzbbq;
    }

    public final void run() {
        zzbbq zzbbq = this.zzggj;
        String zzwp = zzp.zzkt().zzwj().zzxe().zzwp();
        if (!TextUtils.isEmpty(zzwp)) {
            zzbbq.set(zzwp);
        } else {
            zzbbq.setException(new Exception());
        }
    }
}
