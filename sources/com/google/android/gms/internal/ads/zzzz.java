package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzzz extends zzyk {
    private final VideoController.VideoLifecycleCallbacks zzadp;

    public zzzz(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzadp = videoLifecycleCallbacks;
    }

    public final void onVideoStart() {
        this.zzadp.onVideoStart();
    }

    public final void onVideoPlay() {
        this.zzadp.onVideoPlay();
    }

    public final void onVideoPause() {
        this.zzadp.onVideoPause();
    }

    public final void onVideoEnd() {
        this.zzadp.onVideoEnd();
    }

    public final void onVideoMute(boolean z) {
        this.zzadp.onVideoMute(z);
    }
}
