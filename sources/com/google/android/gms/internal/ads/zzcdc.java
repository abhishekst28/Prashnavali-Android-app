package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcdc extends zzccz {
    private final boolean zzdjf;
    private final boolean zzdjg;
    private final boolean zzdsr;
    private final JSONObject zzfyi;
    private final boolean zzfyj;

    public zzcdc(zzdkx zzdkx, JSONObject jSONObject) {
        super(zzdkx);
        this.zzfyi = zzbab.zza(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.zzdjg = zzbab.zza(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzdjf = zzbab.zza(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zzdsr = zzbab.zza(false, jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z = true;
        }
        this.zzfyj = z;
    }

    public final JSONObject zzaly() {
        JSONObject jSONObject = this.zzfyi;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zzfyh.zzdsa);
        } catch (JSONException e) {
            return null;
        }
    }

    public final boolean zzalz() {
        return this.zzfyj;
    }

    public final boolean zzama() {
        return this.zzdjg;
    }

    public final boolean zzalj() {
        return this.zzdsr;
    }

    public final boolean zzamb() {
        return this.zzdjf;
    }
}
