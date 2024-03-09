package com.google.android.gms.ads.nonagon.transaction.omid;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class OmidSettings {
    private final JSONObject zzhcg;

    public OmidSettings(JSONObject jSONObject) {
        this.zzhcg = jSONObject;
    }

    public OmidMediaType getMediaType() {
        int optInt = this.zzhcg.optInt("media_type", -1);
        if (optInt == 0) {
            return OmidMediaType.DISPLAY;
        }
        if (optInt != 1) {
            return OmidMediaType.UNKNOWN;
        }
        return OmidMediaType.VIDEO;
    }

    public String getVideoEventsOwner() {
        if (zza.zzhcf[getMediaType().ordinal()] != 1) {
            return "javascript";
        }
        return null;
    }
}
