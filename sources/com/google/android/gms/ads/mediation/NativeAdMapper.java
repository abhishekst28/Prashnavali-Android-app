package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class NativeAdMapper {
    protected View mAdChoicesContent;
    protected Bundle mExtras = new Bundle();
    protected boolean mOverrideClickHandling;
    protected boolean mOverrideImpressionRecording;
    private VideoController zzcjj;
    private View zzeqh;
    private boolean zzeqi;

    public final void setOverrideImpressionRecording(boolean z) {
        this.mOverrideImpressionRecording = z;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.mOverrideClickHandling = z;
    }

    public final void setExtras(Bundle bundle) {
        this.mExtras = bundle;
    }

    public void setAdChoicesContent(View view) {
        this.mAdChoicesContent = view;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.mOverrideImpressionRecording;
    }

    public final boolean getOverrideClickHandling() {
        return this.mOverrideClickHandling;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }

    public View getAdChoicesContent() {
        return this.mAdChoicesContent;
    }

    @Deprecated
    public void trackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public void recordImpression() {
    }

    public void handleClick(View view) {
    }

    public void setMediaView(View view) {
        this.zzeqh = view;
    }

    public final View zzadd() {
        return this.zzeqh;
    }

    public final void zza(VideoController videoController) {
        this.zzcjj = videoController;
    }

    public final VideoController getVideoController() {
        return this.zzcjj;
    }

    public void setHasVideoContent(boolean z) {
        this.zzeqi = z;
    }

    public boolean hasVideoContent() {
        return this.zzeqi;
    }
}
