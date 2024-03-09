package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdgf implements zzdek<JSONObject> {
    private List<String> zzdqh;

    public zzdgf(List<String> list) {
        this.zzdqh = list;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zzdqh));
        } catch (JSONException e) {
            zzaxy.zzei("Failed putting experiment ids.");
        }
    }
}
