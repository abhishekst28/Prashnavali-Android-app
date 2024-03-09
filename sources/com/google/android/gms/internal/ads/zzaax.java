package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaax {
    private String zzbra = null;
    private String zzcya;
    private Map<String, String> zzcyb;
    private Context zzvr = null;

    public zzaax(Context context, String str) {
        String str2;
        this.zzvr = context;
        this.zzbra = str;
        this.zzcya = zzach.zzczu.get();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzcyb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzcyb.put("v", "3");
        this.zzcyb.put("os", Build.VERSION.RELEASE);
        this.zzcyb.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzcyb;
        zzp.zzkp();
        map.put("device", zzayh.zzxp());
        Map<String, String> map2 = this.zzcyb;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map<String, String> map3 = this.zzcyb;
        zzp.zzkp();
        map3.put("is_lite_sdk", zzayh.zzaz(context) ? "1" : "0");
        Future<zzasu> zzu = zzp.zzla().zzu(this.zzvr);
        try {
            this.zzcyb.put("network_coarse", Integer.toString(zzu.get().zzdtx));
            this.zzcyb.put("network_fine", Integer.toString(zzu.get().zzdty));
        } catch (Exception e) {
            zzp.zzkt().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzrh() {
        return this.zzcya;
    }

    /* access modifiers changed from: package-private */
    public final Context getContext() {
        return this.zzvr;
    }

    /* access modifiers changed from: package-private */
    public final String zzls() {
        return this.zzbra;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> zzri() {
        return this.zzcyb;
    }
}
