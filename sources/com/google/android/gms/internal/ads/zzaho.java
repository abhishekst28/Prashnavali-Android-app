package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaho implements zzahn {
    private final /* synthetic */ zzbbq zzdew;

    zzaho(zzahl zzahl, zzbbq zzbbq) {
        this.zzdew = zzbbq;
    }

    public final void zzc(JSONObject jSONObject) {
        this.zzdew.set(jSONObject);
    }

    public final void onFailure(String str) {
        this.zzdew.setException(new zzalj(str));
    }
}
