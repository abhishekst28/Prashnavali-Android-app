package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctg implements zzcrf<zzdlx, zzcso> {
    private final zzcji zzggg;

    public zzctg(zzcji zzcji) {
        this.zzggg = zzcji;
    }

    public final zzcrg<zzdlx, zzcso> zzf(String str, JSONObject jSONObject) throws zzdlr {
        zzdlx zzd = this.zzggg.zzd(str, jSONObject);
        if (zzd == null) {
            return null;
        }
        return new zzcrg<>(zzd, new zzcso(), str);
    }
}
