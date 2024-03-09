package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdgb implements zzdek<JSONObject> {
    private String zzgwl;
    private String zzgwm;

    public zzdgb(String str, String str2) {
        this.zzgwl = str;
        this.zzgwm = str2;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            JSONObject zzb = zzbab.zzb((JSONObject) obj, "pii");
            zzb.put("doritos", this.zzgwl);
            zzb.put("doritos_v2", this.zzgwm);
        } catch (JSONException e) {
            zzaxy.zzei("Failed putting doritos string.");
        }
    }
}
