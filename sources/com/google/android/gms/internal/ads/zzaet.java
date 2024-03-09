package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaet implements NativeCustomTemplateAd {
    private final VideoController zzcjj = new VideoController();
    private final zzaes zzdde;
    private final MediaView zzddf;
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzddg;

    public zzaet(zzaes zzaes) {
        Context context;
        this.zzdde = zzaes;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzaes.zzsl());
        } catch (RemoteException | NullPointerException e) {
            zzbbd.zzc("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.zzdde.zzp(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzbbd.zzc("", e2);
            }
        }
        this.zzddf = mediaView;
    }

    public final zzaes zzsp() {
        return this.zzdde;
    }

    public final CharSequence getText(String str) {
        try {
            return this.zzdde.zzcx(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzadw zzcy = this.zzdde.zzcy(str);
            if (zzcy != null) {
                return new zzadx(zzcy);
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzyg videoController = this.zzdde.getVideoController();
            if (videoController != null) {
                this.zzcjj.zza(videoController);
            }
        } catch (RemoteException e) {
            zzbbd.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjj;
    }

    public final MediaView getVideoMediaView() {
        return this.zzddf;
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zzdde.getAvailableAssetNames();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.zzdde.getCustomTemplateId();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zzdde.performClick(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zzdde.recordImpression();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzddg == null && this.zzdde.zzsm()) {
                this.zzddg = new zzads(this.zzdde);
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
        return this.zzddg;
    }

    public final void destroy() {
        try {
            this.zzdde.destroy();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
