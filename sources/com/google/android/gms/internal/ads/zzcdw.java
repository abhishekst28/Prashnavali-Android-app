package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcdw implements zzadk {
    private final /* synthetic */ zzcep zzfzn;
    private final /* synthetic */ ViewGroup zzfzo;
    private final /* synthetic */ zzcdr zzfzp;

    zzcdw(zzcdr zzcdr, zzcep zzcep, ViewGroup viewGroup) {
        this.zzfzp = zzcdr;
        this.zzfzn = zzcep;
        this.zzfzo = viewGroup;
    }

    public final void zzse() {
        if (zzcdr.zza(this.zzfzn, zzcdp.zzfyv)) {
            this.zzfzn.onClick(this.zzfzo);
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        this.zzfzn.onTouch((View) null, motionEvent);
    }
}
