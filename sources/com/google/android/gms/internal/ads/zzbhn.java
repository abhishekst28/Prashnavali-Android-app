package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbhn implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzavu zzemm;
    private final /* synthetic */ zzbhi zzepq;

    zzbhn(zzbhi zzbhi, zzavu zzavu) {
        this.zzepq = zzbhi;
        this.zzemm = zzavu;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzepq.zza(view, this.zzemm, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
