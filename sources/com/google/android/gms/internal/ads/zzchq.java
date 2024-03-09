package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzchq extends VideoController.VideoLifecycleCallbacks {
    private final zzccv zzfvt;

    public zzchq(zzccv zzccv) {
        this.zzfvt = zzccv;
    }

    public final void onVideoStart() {
        zzyl zza = zza(this.zzfvt);
        if (zza != null) {
            try {
                zza.onVideoStart();
            } catch (RemoteException e) {
                zzaxy.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoPause() {
        zzyl zza = zza(this.zzfvt);
        if (zza != null) {
            try {
                zza.onVideoPause();
            } catch (RemoteException e) {
                zzaxy.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoEnd() {
        zzyl zza = zza(this.zzfvt);
        if (zza != null) {
            try {
                zza.onVideoEnd();
            } catch (RemoteException e) {
                zzaxy.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    private static zzyl zza(zzccv zzccv) {
        zzyg videoController = zzccv.getVideoController();
        if (videoController == null) {
            return null;
        }
        try {
            return videoController.zzqj();
        } catch (RemoteException e) {
            return null;
        }
    }
}
