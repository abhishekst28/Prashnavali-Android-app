package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.zzp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczg {
    public final String zzgsb;
    public String zzgsc;
    public Bundle zzgsd = new Bundle();

    public zzczg(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        Map<String, String> hashMap = new HashMap<>();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c = 1;
                }
            } else if (nextName.equals("params")) {
                c = 0;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                hashMap = zzbab.zzb(jsonReader);
            }
        }
        this.zzgsb = str;
        jsonReader.endObject();
        for (Map.Entry next : hashMap.entrySet()) {
            if (!(next.getKey() == null || next.getValue() == null)) {
                this.zzgsd.putString((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzczg zzo(Bundle bundle) {
        try {
            this.zzgsc = zzp.zzkp().zzd(bundle).toString();
        } catch (JSONException e) {
            this.zzgsc = "{}";
        }
        return this;
    }
}
