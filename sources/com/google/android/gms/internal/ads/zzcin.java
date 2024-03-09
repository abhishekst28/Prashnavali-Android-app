package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcin implements View.OnTouchListener {
    private final zzcij zzgdl;

    zzcin(zzcij zzcij) {
        this.zzgdl = zzcij;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.zzgdl.zza(view, motionEvent);
    }
}
