package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbzh extends zzbxe<VideoController.VideoLifecycleCallbacks> {
    private boolean zzepb;

    protected zzbzh(Set<zzbys<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void onVideoPause() {
        zza(zzbzk.zzfst);
    }

    public final void onVideoEnd() {
        zza(zzbzj.zzfst);
    }

    public final synchronized void onVideoStart() {
        zza(zzbzm.zzfst);
        this.zzepb = true;
    }

    public final synchronized void onVideoPlay() {
        if (!this.zzepb) {
            zza(zzbzl.zzfst);
            this.zzepb = true;
        }
        zza(zzbzo.zzfst);
    }
}
