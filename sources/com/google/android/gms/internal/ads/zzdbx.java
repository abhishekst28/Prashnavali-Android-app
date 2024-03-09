package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdbx implements zzdek<Bundle> {
    private final String zzdrm;
    private final String zzgtv;
    private final Bundle zzgtw;

    private zzdbx(String str, String str2, Bundle bundle) {
        this.zzdrm = str;
        this.zzgtv = str2;
        this.zzgtw = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.zzdrm);
        bundle.putString("fc_consent", this.zzgtv);
        bundle.putBundle("iab_consent_info", this.zzgtw);
    }
}
