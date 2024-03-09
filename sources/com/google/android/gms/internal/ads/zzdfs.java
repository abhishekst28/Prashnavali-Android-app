package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdfs implements zzdek<JSONObject> {
    private JSONObject zzgwe;

    public zzdfs(JSONObject jSONObject) {
        this.zzgwe = jSONObject;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.zzgwe);
        } catch (JSONException e) {
            zzaxy.zzei("Unable to get cache_state");
        }
    }
}
