package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddg implements zzdek<Bundle> {
    private String zzdqg;

    public zzddg(String str) {
        this.zzdqg = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        ((Bundle) obj).putString("request_id", this.zzdqg);
    }
}
