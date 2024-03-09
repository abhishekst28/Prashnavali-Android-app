package com.google.android.gms.ads.formats;

import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzadj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zze implements zzadj {
    private final UnifiedNativeAdView zzbnz;

    zze(UnifiedNativeAdView unifiedNativeAdView) {
        this.zzbnz = unifiedNativeAdView;
    }

    public final void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbnz.zza(scaleType);
    }
}
