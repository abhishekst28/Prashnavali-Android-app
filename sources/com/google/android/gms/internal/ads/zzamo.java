package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzamo implements Runnable {
    private final Context zzcjx;
    private final zzamm zzdim;

    zzamo(zzamm zzamm, Context context) {
        this.zzdim = zzamm;
        this.zzcjx = context;
    }

    public final void run() {
        zzamm.zzo(this.zzcjx);
    }
}
