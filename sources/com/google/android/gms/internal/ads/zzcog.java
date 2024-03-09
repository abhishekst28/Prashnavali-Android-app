package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcog implements zzduv {
    private final zzcod zzghz;
    private final zzuu zzgia;

    zzcog(zzcod zzcod, zzuu zzuu) {
        this.zzghz = zzcod;
        this.zzgia = zzuu;
    }

    public final zzdvt zzf(Object obj) {
        zzuu zzuu = this.zzgia;
        String str = (String) obj;
        String str2 = zzuu.zzcgo;
        String str3 = zzuu.zzcgp;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str2);
        jSONObject2.put("base_url", "");
        jSONObject2.put("signals", new JSONObject(str3));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return zzdvl.zzaf(jSONObject);
    }
}
