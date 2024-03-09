package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzdvl;
import com.google.android.gms.internal.ads.zzdvt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzd implements zzduv {
    static final zzduv zzbok = new zzd();

    private zzd() {
    }

    public final zzdvt zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzp.zzkt().zzwj().zzel(jSONObject.getString("appSettingsJson"));
        }
        return zzdvl.zzaf(null);
    }
}
