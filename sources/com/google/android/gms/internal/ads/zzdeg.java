package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdeg implements zzdek {
    private final Bundle zzgvb;

    zzdeg(Bundle bundle) {
        this.zzgvb = bundle;
    }

    public final void zzs(Object obj) {
        ((Bundle) obj).putBundle("shared_pref", this.zzgvb);
    }
}
