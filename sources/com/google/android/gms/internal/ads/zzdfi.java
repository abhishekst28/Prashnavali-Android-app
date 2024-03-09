package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdfi implements zzdek<JSONObject> {
    private final JSONObject zzgvy;

    public zzdfi(JSONObject jSONObject) {
        this.zzgvy = jSONObject;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            JSONObject zzb = zzbab.zzb((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.zzgvy;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzb.put(next, jSONObject.get(next));
            }
        } catch (JSONException e) {
            zzaxy.zzei("Failed putting app indexing json.");
        }
    }
}
