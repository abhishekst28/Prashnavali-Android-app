package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfi implements Callable {
    private final zzdkx zzfoo;
    private final zzcff zzgbb;
    private final zzdlj zzgbj;
    private final JSONObject zzgbk;

    zzcfi(zzcff zzcff, zzdlj zzdlj, zzdkx zzdkx, JSONObject jSONObject) {
        this.zzgbb = zzcff;
        this.zzgbj = zzdlj;
        this.zzfoo = zzdkx;
        this.zzgbk = jSONObject;
    }

    public final Object call() {
        String str;
        zzdlj zzdlj = this.zzgbj;
        zzdkx zzdkx = this.zzfoo;
        JSONObject jSONObject = this.zzgbk;
        zzccv zzccv = new zzccv();
        zzccv.zzdy(jSONObject.optInt("template_id", -1));
        zzccv.zzga(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject != null) {
            str = optJSONObject.optString("omid_partner_name");
        } else {
            str = null;
        }
        zzccv.zzgb(str);
        zzdln zzdln = zzdlj.zzhbp.zzfqn;
        if (zzdln.zzhbw.contains(Integer.toString(zzccv.zzaln()))) {
            if (zzccv.zzaln() == 3) {
                if (zzccv.getCustomTemplateId() == null) {
                    throw new zzcuh(zzdmd.zzhco, "No custom template id for custom template ad response.");
                } else if (!zzdln.zzhbx.contains(zzccv.getCustomTemplateId())) {
                    throw new zzcuh(zzdmd.zzhco, "Unexpected custom template id in the response.");
                }
            }
            zzccv.setStarRating(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzdkx.zzduo) {
                zzp.zzkp();
                String zzxr = zzayh.zzxr();
                StringBuilder sb = new StringBuilder(String.valueOf(zzxr).length() + 3 + String.valueOf(optString).length());
                sb.append(zzxr);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            zzccv.zzn("headline", optString);
            zzccv.zzn("body", jSONObject.optString("body", (String) null));
            zzccv.zzn("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzccv.zzn("store", jSONObject.optString("store", (String) null));
            zzccv.zzn("price", jSONObject.optString("price", (String) null));
            zzccv.zzn("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzccv;
        }
        int i = zzdmd.zzhco;
        int zzaln = zzccv.zzaln();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(zzaln);
        throw new zzcuh(i, sb2.toString());
    }
}
