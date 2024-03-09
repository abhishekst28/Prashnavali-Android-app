package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzayw implements View.OnApplyWindowInsetsListener {
    private final zzayx zzeaq;
    private final Activity zzear;

    zzayw(zzayx zzayx, Activity activity) {
        this.zzeaq = zzayx;
        this.zzear = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzayx.zza(this.zzear, view, windowInsets);
    }
}
