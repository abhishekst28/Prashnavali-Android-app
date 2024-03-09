package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzabr extends zzabp {
    private final OnCustomRenderedAdLoadedListener zzcjl;

    public zzabr(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcjl = onCustomRenderedAdLoadedListener;
    }

    public final void zza(zzabl zzabl) {
        this.zzcjl.onCustomRenderedAdLoaded(new zzabm(zzabl));
    }
}
