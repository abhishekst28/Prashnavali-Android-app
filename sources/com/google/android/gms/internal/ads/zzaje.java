package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.ads.instream.InstreamAdView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaje extends InstreamAd {
    private MediaContent zzbnc = zztb();
    private VideoController zzcjj = zzta();
    private final zzait zzdfm;

    public zzaje(zzait zzait) {
        this.zzdfm = zzait;
    }

    public final void zza(InstreamAdView instreamAdView) {
        if (instreamAdView == null) {
            zzbbd.zzfc("showInView: parameter view must not be null.");
            return;
        }
        try {
            this.zzdfm.zzr(ObjectWrapper.wrap(instreamAdView));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final MediaContent getMediaContent() {
        return this.zzbnc;
    }

    public final VideoController getVideoController() {
        return this.zzcjj;
    }

    public final float getVideoDuration() {
        VideoController videoController = this.zzcjj;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoDuration();
    }

    public final float getVideoCurrentTime() {
        VideoController videoController = this.zzcjj;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoCurrentTime();
    }

    public final float getAspectRatio() {
        VideoController videoController = this.zzcjj;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getAspectRatio();
    }

    public final void destroy() {
        try {
            this.zzdfm.destroy();
            this.zzcjj = null;
            this.zzbnc = null;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    private final VideoController zzta() {
        VideoController videoController = new VideoController();
        try {
            videoController.zza(this.zzdfm.getVideoController());
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return videoController;
    }

    private final MediaContent zztb() {
        try {
            if (this.zzdfm.zzss() != null) {
                return new zzze(this.zzdfm.zzss());
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
