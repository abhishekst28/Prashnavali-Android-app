package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzdvl;
import com.google.android.gms.internal.ads.zzdvt;
import com.google.android.gms.internal.ads.zzwe;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zze {
    private long zzbol = 0;
    private Context zzvr;

    public final void zza(Context context, zzbbg zzbbg, String str, Runnable runnable) {
        zza(context, zzbbg, true, (zzaxl) null, str, (String) null, runnable);
    }

    public final void zza(Context context, zzbbg zzbbg, String str, zzaxl zzaxl) {
        zza(context, zzbbg, false, zzaxl, zzaxl != null ? zzaxl.zzwq() : null, str, (Runnable) null);
    }

    private final void zza(Context context, zzbbg zzbbg, boolean z, zzaxl zzaxl, String str, String str2, Runnable runnable) {
        if (zzp.zzkw().elapsedRealtime() - this.zzbol < 5000) {
            zzaxy.zzfe("Not retrying to fetch app settings");
            return;
        }
        this.zzbol = zzp.zzkw().elapsedRealtime();
        boolean z2 = false;
        if (zzaxl == null) {
            z2 = true;
        } else {
            if ((zzp.zzkw().currentTimeMillis() - zzaxl.zzwn() > ((Long) zzwe.zzpu().zzd(zzaat.zzcsh)).longValue()) || !zzaxl.zzwo()) {
                z2 = true;
            }
        }
        if (z2) {
            if (context == null) {
                zzaxy.zzfe("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.zzvr = applicationContext;
                zzalm<I, O> zza = zzp.zzlc().zzb(this.zzvr, zzbbg).zza("google.afma.config.fetchAppSettings", zzalp.zzdhs, zzalp.zzdhs);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    zzdvt<O> zzi = zza.zzi(jSONObject);
                    zzdvt<O> zzb = zzdvl.zzb(zzi, zzd.zzbok, (Executor) zzbbi.zzedz);
                    if (runnable != null) {
                        zzi.addListener(runnable, zzbbi.zzedz);
                    }
                    zzbbm.zza(zzb, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    zzaxy.zzc("Error requesting application settings", e);
                }
            } else {
                zzaxy.zzfe("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
