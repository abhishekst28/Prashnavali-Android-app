package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcpq implements zzdoq {
    static final zzdoq zzghg = new zzcpq();

    private zzcpq() {
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zzaxy.zzei("Ad request signals:");
        zzaxy.zzei(jSONObject.toString(2));
        return jSONObject;
    }
}
