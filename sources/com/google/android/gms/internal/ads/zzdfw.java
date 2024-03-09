package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdfw implements zzden<zzdek<JSONObject>> {
    private final JSONObject zzgwi;

    zzdfw(Context context) {
        this.zzgwi = zzatb.zzz(context);
    }

    public final zzdvt<zzdek<JSONObject>> zzaqs() {
        return zzdvl.zzaf(new zzdfz(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zzgwi);
        } catch (JSONException e) {
            zzaxy.zzei("Failed putting version constants.");
        }
    }
}
