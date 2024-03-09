package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzrl implements ValueCallback<String> {
    private final /* synthetic */ zzrm zzbtn;

    zzrl(zzrm zzrm) {
        this.zzbtn = zzrm;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.zzbtn.zzbta.zza(this.zzbtn.zzbtp, this.zzbtn.zzbtq, (String) obj, this.zzbtn.zzbtr);
    }
}
