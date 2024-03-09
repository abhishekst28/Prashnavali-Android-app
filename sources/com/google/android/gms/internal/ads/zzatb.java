package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzatb extends zzatd {
    private final Object lock = new Object();
    private final Context zzaai;
    private SharedPreferences zzduv;
    private final zzalm<JSONObject, JSONObject> zzduw;

    public zzatb(Context context, zzalm<JSONObject, JSONObject> zzalm) {
        this.zzaai = context.getApplicationContext();
        this.zzduw = zzalm;
    }

    public final zzdvt<Void> zzvl() {
        synchronized (this.lock) {
            if (this.zzduv == null) {
                this.zzduv = this.zzaai.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzp.zzkw().currentTimeMillis() - this.zzduv.getLong("js_last_update", 0) < zzaco.zzday.get().longValue()) {
            return zzdvl.zzaf(null);
        }
        return zzdvl.zzb(this.zzduw.zzi(zzz(this.zzaai)), new zzata(this), (Executor) zzbbi.zzedz);
    }

    public static JSONObject zzz(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbbg.zzyr().zzbra);
            jSONObject.put("mf", zzaco.zzdax.get());
            jSONObject.put("cl", "317778048");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzf(JSONObject jSONObject) {
        zzaat.zza(this.zzaai, 1, jSONObject);
        this.zzduv.edit().putLong("js_last_update", zzp.zzkw().currentTimeMillis()).apply();
        return null;
    }
}
