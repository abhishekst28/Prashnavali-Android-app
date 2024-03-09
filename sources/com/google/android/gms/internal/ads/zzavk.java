package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzavk implements Runnable {
    private final zzavl zzdvq;
    private final Bitmap zzdvr;

    zzavk(zzavl zzavl, Bitmap bitmap) {
        this.zzdvq = zzavl;
        this.zzdvr = bitmap;
    }

    public final void run() {
        this.zzdvq.zza(this.zzdvr);
    }
}
