package com.google.android.gms.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class MediationUtils {
    protected static final double MIN_HEIGHT_RATIO = 0.7d;
    protected static final double MIN_WIDTH_RATIO = 0.5d;

    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (list == null || adSize == null) {
            return null;
        }
        if (!adSize.zzdr()) {
            float f = context.getResources().getDisplayMetrics().density;
            adSize = new AdSize(Math.round(((float) adSize.getWidthInPixels(context)) / f), Math.round(((float) adSize.getHeightInPixels(context)) / f));
        }
        for (AdSize next : list) {
            boolean z = false;
            if (next != null) {
                int width = adSize.getWidth();
                int width2 = next.getWidth();
                int height = adSize.getHeight();
                int height2 = next.getHeight();
                if (((double) width) * MIN_WIDTH_RATIO <= ((double) width2) && width >= width2 && (!adSize.zzdr() ? !(((double) height) * MIN_HEIGHT_RATIO > ((double) height2) || height < height2) : adSize.zzds() >= height2)) {
                    z = true;
                }
            }
            if (z && (adSize2 == null || adSize2.getWidth() * adSize2.getHeight() <= next.getWidth() * next.getHeight())) {
                adSize2 = next;
            }
        }
        return adSize2;
    }
}
