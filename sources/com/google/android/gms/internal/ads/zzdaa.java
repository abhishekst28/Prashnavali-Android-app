package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdaa implements zzdek<Bundle> {
    private final Bundle zzgst;

    private zzdaa(Bundle bundle) {
        this.zzgst = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zzgst.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.zzgst);
        }
    }
}
