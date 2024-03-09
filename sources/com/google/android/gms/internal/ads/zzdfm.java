package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdfm implements zzdek<JSONObject> {
    private String zzgwc;

    public zzdfm(String str) {
        this.zzgwc = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            JSONObject zzb = zzbab.zzb((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.zzgwc)) {
                zzb.put("attok", this.zzgwc);
            }
        } catch (JSONException e) {
            zzaxy.zza("Failed putting attestation token.", e);
        }
    }
}
