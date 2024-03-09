package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzawc implements zzawr {
    private final String zzdgb;
    private final Bundle zzdxf;

    zzawc(String str, Bundle bundle) {
        this.zzdgb = str;
        this.zzdxf = bundle;
    }

    public final void zza(zzbib zzbib) {
        zzbib.logEvent("am", this.zzdgb, this.zzdxf);
    }
}
