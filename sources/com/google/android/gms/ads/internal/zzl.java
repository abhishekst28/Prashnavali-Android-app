package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzl implements View.OnTouchListener {
    private final /* synthetic */ zzj zzbpi;

    zzl(zzj zzj) {
        this.zzbpi = zzj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzbpi.zzbpg == null) {
            return false;
        }
        this.zzbpi.zzbpg.zza(motionEvent);
        return false;
    }
}
