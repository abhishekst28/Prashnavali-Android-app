package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzddt implements Callable {
    private final List zzgup;

    zzddt(List list) {
        this.zzgup = list;
    }

    public final Object call() {
        List<zzdvt> list = this.zzgup;
        JSONArray jSONArray = new JSONArray();
        for (zzdvt zzdvt : list) {
            if (((JSONObject) zzdvt.get()) != null) {
                jSONArray.put(zzdvt.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzddm(jSONArray.toString());
    }
}
