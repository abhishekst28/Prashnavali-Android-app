package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcvl implements zzcrf<zzapa, zzcso> {
    private final zzcws zzgoe;

    public zzcvl(zzcws zzcws) {
        this.zzgoe = zzcws;
    }

    public final zzcrg<zzapa, zzcso> zzf(String str, JSONObject jSONObject) throws zzdlr {
        zzapa zzgp = this.zzgoe.zzgp(str);
        if (zzgp == null) {
            return null;
        }
        return new zzcrg<>(zzgp, new zzcso(), str);
    }
}
