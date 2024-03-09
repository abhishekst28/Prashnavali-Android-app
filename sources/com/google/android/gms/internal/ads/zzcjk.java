package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcjk {
    private final Executor executor;
    private final Map<String, Map<String, JSONObject>> zzgea = new ConcurrentHashMap();
    private JSONObject zzgeb;
    private boolean zzxi;

    public zzcjk(Executor executor2) {
        this.executor = executor2;
    }

    public final void zzanu() {
        zzp.zzkt().zzwj().zzb(new zzcjj(this));
        this.executor.execute(new zzcjm(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: zzanv */
    public final synchronized void zzany() {
        Map map;
        this.zzxi = true;
        zzaxl zzxe = zzp.zzkt().zzwj().zzxe();
        if (zzxe != null) {
            JSONObject zzws = zzxe.zzws();
            if (zzws != null) {
                this.zzgeb = zzws.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = zzws.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.zzgea.containsKey(optString2)) {
                                    map = this.zzgea.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.zzgea.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzanx() {
        this.executor.execute(new zzcjl(this));
    }
}
