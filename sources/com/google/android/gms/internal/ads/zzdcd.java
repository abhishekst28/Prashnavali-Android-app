package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdcd implements zzdek<Bundle> {
    private final String zzdqw;
    private final boolean zzdqy;

    public zzdcd(String str, boolean z) {
        this.zzdqw = str;
        this.zzdqy = z;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zzdqw);
        if (this.zzdqy) {
            bundle.putString("de", "1");
        }
    }
}
