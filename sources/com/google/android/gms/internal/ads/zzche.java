package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzche implements zzduv {
    private final String zzdft;
    private final zzchc zzgcj;
    private final JSONObject zzgcn;

    zzche(zzchc zzchc, String str, JSONObject jSONObject) {
        this.zzgcj = zzchc;
        this.zzdft = str;
        this.zzgcn = jSONObject;
    }

    public final zzdvt zzf(Object obj) {
        return this.zzgcj.zza(this.zzdft, this.zzgcn, (zzbfq) obj);
    }
}
