package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.zzayy;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzj extends RelativeLayout {
    private zzayy zzdol;
    boolean zzdom;

    public zzj(Context context, String str, String str2) {
        super(context);
        zzayy zzayy = new zzayy(context, str);
        this.zzdol = zzayy;
        zzayy.zzae(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdom) {
            return false;
        }
        this.zzdol.zzd(motionEvent);
        return false;
    }
}
