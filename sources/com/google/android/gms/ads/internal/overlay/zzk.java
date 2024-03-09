package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzk implements Runnable {
    private final zzl zzdon;
    private final Drawable zzdoo;

    zzk(zzl zzl, Drawable drawable) {
        this.zzdon = zzl;
        this.zzdoo = drawable;
    }

    public final void run() {
        zzl zzl = this.zzdon;
        zzl.zzdop.zzaas.getWindow().setBackgroundDrawable(this.zzdoo);
    }
}
