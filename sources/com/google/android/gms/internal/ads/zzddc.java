package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddc implements zzdek<Bundle> {
    private final Bundle zzfsj;

    public zzddc(Bundle bundle) {
        this.zzfsj = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.zzfsj;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
