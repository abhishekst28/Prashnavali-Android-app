package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfo implements zzdsl {
    private final JSONObject zzfmf;
    private final zzcfj zzgbr;

    zzcfo(zzcfj zzcfj, JSONObject jSONObject) {
        this.zzgbr = zzcfj;
        this.zzfmf = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zzgbr.zza(this.zzfmf, (List) obj);
    }
}
