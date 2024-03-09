package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaol extends zzanm {
    private final UnifiedNativeAdMapper zzdli;

    public zzaol(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzdli = unifiedNativeAdMapper;
    }

    public final String getHeadline() {
        return this.zzdli.getHeadline();
    }

    public final List getImages() {
        List<NativeAd.Image> images = this.zzdli.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new zzadi(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
            }
        }
        return arrayList;
    }

    public final String getBody() {
        return this.zzdli.getBody();
    }

    public final zzadw zzsh() {
        NativeAd.Image icon = this.zzdli.getIcon();
        if (icon != null) {
            return new zzadi(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String getCallToAction() {
        return this.zzdli.getCallToAction();
    }

    public final String getAdvertiser() {
        return this.zzdli.getAdvertiser();
    }

    public final double getStarRating() {
        if (this.zzdli.getStarRating() != null) {
            return this.zzdli.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    public final String getStore() {
        return this.zzdli.getStore();
    }

    public final String getPrice() {
        return this.zzdli.getPrice();
    }

    public final zzyg getVideoController() {
        if (this.zzdli.getVideoController() != null) {
            return this.zzdli.getVideoController().zzdt();
        }
        return null;
    }

    public final zzado zzsi() {
        return null;
    }

    public final IObjectWrapper zzua() {
        View adChoicesContent = this.zzdli.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    public final IObjectWrapper zzub() {
        View zzadd = this.zzdli.zzadd();
        if (zzadd == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzadd);
    }

    public final float getMediaContentAspectRatio() {
        return this.zzdli.getMediaContentAspectRatio();
    }

    public final float getVideoDuration() {
        return this.zzdli.getDuration();
    }

    public final float getVideoCurrentTime() {
        return this.zzdli.getCurrentTime();
    }

    public final IObjectWrapper zzsj() {
        Object zzjv = this.zzdli.zzjv();
        if (zzjv == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzjv);
    }

    public final Bundle getExtras() {
        return this.zzdli.getExtras();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzdli.getOverrideImpressionRecording();
    }

    public final boolean getOverrideClickHandling() {
        return this.zzdli.getOverrideClickHandling();
    }

    public final void recordImpression() {
        this.zzdli.recordImpression();
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdli.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdli.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdli.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
