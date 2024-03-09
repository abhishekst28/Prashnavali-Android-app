package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcqa implements zzaln<zzcpx> {
    zzcqa() {
    }

    public final /* synthetic */ JSONObject zzj(Object obj) throws JSONException {
        zzcpx zzcpx = (zzcpx) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcpx.zzgji.zzvf());
        jSONObject2.put("signals", zzcpx.zzgjh);
        jSONObject3.put("body", zzcpx.zzgjg.zzdrq);
        jSONObject3.put("headers", zzp.zzkp().zzj((Map<String, ?>) zzcpx.zzgjg.zzam));
        jSONObject3.put("response_code", zzcpx.zzgjg.zzgjq);
        jSONObject3.put("latency", zzcpx.zzgjg.zzgjr);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcpx.zzgji.zzvi());
        return jSONObject;
    }
}
