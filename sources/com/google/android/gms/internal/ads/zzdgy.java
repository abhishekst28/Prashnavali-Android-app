package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdgy implements zzdek<JSONObject> {
    private final Map<String, Object> zzgwu;

    public zzdgy(Map<String, Object> map) {
        this.zzgwu = map;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzp.zzkp().zzj((Map<String, ?>) this.zzgwu));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzaxy.zzei(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
