package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcff {
    private final zzdvw zzgay;
    private final zzcfj zzgaz;
    private final zzcft zzgba;

    public zzcff(zzdvw zzdvw, zzcfj zzcfj, zzcft zzcft) {
        this.zzgay = zzdvw;
        this.zzgaz = zzcfj;
        this.zzgba = zzcft;
    }

    public final zzdvt<zzccv> zza(zzdlj zzdlj, zzdkx zzdkx, JSONObject jSONObject) {
        zzdvt zzdvt;
        JSONObject jSONObject2 = jSONObject;
        zzdlj zzdlj2 = zzdlj;
        zzdvt zze = this.zzgay.zze(new zzcfi(this, zzdlj, zzdkx, jSONObject2));
        zzdvt<List<zzadi>> zzd = this.zzgaz.zzd(jSONObject2, "images");
        zzdvt<zzadi> zzc = this.zzgaz.zzc(jSONObject2, "secondary_image");
        zzdvt<zzadi> zzc2 = this.zzgaz.zzc(jSONObject2, "app_icon");
        zzdvt<zzadd> zze2 = this.zzgaz.zze(jSONObject2, "attribution");
        zzdvt<zzbfq> zzm = this.zzgaz.zzm(jSONObject2);
        zzcfj zzcfj = this.zzgaz;
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzdvt = zzdvl.zzaf(null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzdvt = zzdvl.zzaf(null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzdvt = zzdvl.zzaf(null);
                } else {
                    zzdvt = zzdvl.zzb(zzdvl.zzaf(null), new zzcfn(zzcfj, optString), (Executor) zzbbi.zzedy);
                }
            }
        }
        zzdvt<List<zzcfy>> zzg = this.zzgba.zzg(jSONObject2, "custom_assets");
        return zzdvl.zza((zzdvt<? extends V>[]) new zzdvt[]{zze, zzd, zzc, zzc2, zze2, zzm, zzdvt, zzg}).zza(new zzcfh(this, zze, zzd, zzc2, zzc, zze2, jSONObject, zzm, zzdvt, zzg), this.zzgay);
    }
}
