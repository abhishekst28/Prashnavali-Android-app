package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdgk implements zzdek<JSONObject> {
    private Bundle zzgwp;

    public zzdgk(Bundle bundle) {
        this.zzgwp = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zzgwp != null) {
            try {
                zzbab.zzb(zzbab.zzb(jSONObject, "device"), "play_store").put("parental_controls", zzp.zzkp().zzd(this.zzgwp));
            } catch (JSONException e) {
                zzaxy.zzei("Failed putting parental controls bundle.");
            }
        }
    }
}
