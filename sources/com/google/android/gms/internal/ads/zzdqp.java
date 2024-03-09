package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final /* synthetic */ class zzdqp implements OnFailureListener {
    private final zzdqo zzhjj;

    zzdqp(zzdqo zzdqo) {
        this.zzhjj = zzdqo;
    }

    public final void onFailure(Exception exc) {
        this.zzhjj.zzc(exc);
    }
}
