package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfx implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzavu zzemm;
    private final /* synthetic */ zzbft zzemo;

    zzbfx(zzbft zzbft, zzavu zzavu) {
        this.zzemo = zzbft;
        this.zzemm = zzavu;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzemo.zza(view, this.zzemm, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
