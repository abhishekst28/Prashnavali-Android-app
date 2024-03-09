package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzayi implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzayh zzean;

    zzayi(zzayh zzayh, Context context) {
        this.zzean = zzayh;
        this.val$context = context;
    }

    public final void run() {
        synchronized (this.zzean.zzeak) {
            String unused = this.zzean.zzbif = zzayh.zzar(this.val$context);
            this.zzean.zzeak.notifyAll();
        }
    }
}
