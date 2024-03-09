package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzate implements zzast {
    private zzalm<JSONObject, JSONObject> zzduw;
    private zzalm<JSONObject, JSONObject> zzdux;

    public zzate(Context context) {
        this.zzdux = zzp.zzlc().zza(context, zzbbg.zzyr()).zza("google.afma.request.getAdDictionary", zzalp.zzdhs, zzalp.zzdhs);
        this.zzduw = zzp.zzlc().zza(context, zzbbg.zzyr()).zza("google.afma.sdkConstants.getSdkConstants", zzalp.zzdhs, zzalp.zzdhs);
    }

    public final zzalm<JSONObject, JSONObject> zzvd() {
        return this.zzduw;
    }
}
