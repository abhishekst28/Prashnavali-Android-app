package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdlb implements zzbac {
    public final String zzdos = this.zzhbg.optString("ad_base_url", (String) null);
    public final String zzdou;
    public final JSONObject zzfvr = this.zzhbg.optJSONObject("ad_json");
    private final JSONObject zzhbg;

    zzdlb(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = zzbab.zzc(jsonReader);
        this.zzhbg = zzc;
        this.zzdou = zzc.optString("ad_html", (String) null);
    }

    public final void zza(JsonWriter jsonWriter) throws IOException {
        zzbab.zza(jsonWriter, this.zzhbg);
    }
}
