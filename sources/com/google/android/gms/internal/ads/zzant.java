package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzant extends zzang {
    private final NativeAppInstallAdMapper zzdky;

    public zzant(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzdky = nativeAppInstallAdMapper;
    }

    public final String getHeadline() {
        return this.zzdky.getHeadline();
    }

    public final List getImages() {
        List<NativeAd.Image> images = this.zzdky.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new zzadi(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
        }
        return arrayList;
    }

    public final String getBody() {
        return this.zzdky.getBody();
    }

    public final zzadw zzsh() {
        NativeAd.Image icon = this.zzdky.getIcon();
        if (icon != null) {
            return new zzadi(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String getCallToAction() {
        return this.zzdky.getCallToAction();
    }

    public final double getStarRating() {
        return this.zzdky.getStarRating();
    }

    public final String getStore() {
        return this.zzdky.getStore();
    }

    public final String getPrice() {
        return this.zzdky.getPrice();
    }

    public final void recordImpression() {
        this.zzdky.recordImpression();
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdky.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdky.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdky.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdky.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzdky.getOverrideImpressionRecording();
    }

    public final boolean getOverrideClickHandling() {
        return this.zzdky.getOverrideClickHandling();
    }

    public final Bundle getExtras() {
        return this.zzdky.getExtras();
    }

    public final zzyg getVideoController() {
        if (this.zzdky.getVideoController() != null) {
            return this.zzdky.getVideoController().zzdt();
        }
        return null;
    }

    public final zzado zzsi() {
        return null;
    }

    public final IObjectWrapper zzua() {
        View adChoicesContent = this.zzdky.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    public final IObjectWrapper zzub() {
        View zzadd = this.zzdky.zzadd();
        if (zzadd == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzadd);
    }

    public final IObjectWrapper zzsj() {
        return null;
    }
}
