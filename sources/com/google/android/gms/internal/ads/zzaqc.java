package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaqc {
    private final boolean zzdna;
    private final boolean zzdnb;
    private final boolean zzdnc;
    private final boolean zzdnd;
    private final boolean zzdne;

    private zzaqc(zzaqe zzaqe) {
        this.zzdna = zzaqe.zzdna;
        this.zzdnb = zzaqe.zzdnb;
        this.zzdnc = zzaqe.zzdnc;
        this.zzdnd = zzaqe.zzdnd;
        this.zzdne = zzaqe.zzdne;
    }

    public final JSONObject zzul() {
        try {
            return new JSONObject().put("sms", this.zzdna).put("tel", this.zzdnb).put("calendar", this.zzdnc).put("storePicture", this.zzdnd).put("inlineVideo", this.zzdne);
        } catch (JSONException e) {
            zzaxy.zzc("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
