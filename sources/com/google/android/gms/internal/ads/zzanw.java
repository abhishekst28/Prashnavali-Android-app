package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzanw extends zzanh {
    private final NativeContentAdMapper zzdld;

    public zzanw(NativeContentAdMapper nativeContentAdMapper) {
        this.zzdld = nativeContentAdMapper;
    }

    public final String getHeadline() {
        return this.zzdld.getHeadline();
    }

    public final List getImages() {
        List<NativeAd.Image> images = this.zzdld.getImages();
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
        return this.zzdld.getBody();
    }

    public final zzadw zzsk() {
        NativeAd.Image logo = this.zzdld.getLogo();
        if (logo != null) {
            return new zzadi(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    public final String getCallToAction() {
        return this.zzdld.getCallToAction();
    }

    public final String getAdvertiser() {
        return this.zzdld.getAdvertiser();
    }

    public final void recordImpression() {
        this.zzdld.recordImpression();
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdld.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdld.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdld.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdld.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzdld.getOverrideImpressionRecording();
    }

    public final boolean getOverrideClickHandling() {
        return this.zzdld.getOverrideClickHandling();
    }

    public final Bundle getExtras() {
        return this.zzdld.getExtras();
    }

    public final IObjectWrapper zzua() {
        View adChoicesContent = this.zzdld.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    public final zzado zzsi() {
        return null;
    }

    public final zzyg getVideoController() {
        if (this.zzdld.getVideoController() != null) {
            return this.zzdld.getVideoController().zzdt();
        }
        return null;
    }

    public final IObjectWrapper zzub() {
        View zzadd = this.zzdld.zzadd();
        if (zzadd == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzadd);
    }

    public final IObjectWrapper zzsj() {
        return null;
    }
}
