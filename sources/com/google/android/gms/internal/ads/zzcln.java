package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcln {
    private final Executor executor;
    private final String packageName;
    private final String zzbra;
    private final String zzcya = zzach.zzczu.get();
    private final zzbbh zzeck;
    private final Map<String, String> zzgff = new HashMap();
    private final boolean zzgfm;
    private final Context zzvr;

    public zzcln(Executor executor2, zzbbh zzbbh, Context context, zzbbg zzbbg) {
        this.executor = executor2;
        this.zzeck = zzbbh;
        this.zzvr = context;
        this.packageName = context.getPackageName();
        this.zzgfm = ((double) zzwe.zzpx().nextFloat()) <= zzach.zzczt.get().doubleValue();
        this.zzbra = zzbbg.zzbra;
        this.zzgff.put("s", "gmob_sdk");
        this.zzgff.put("v", "3");
        this.zzgff.put("os", Build.VERSION.RELEASE);
        this.zzgff.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzgff;
        zzp.zzkp();
        map.put("device", zzayh.zzxp());
        this.zzgff.put("app", this.packageName);
        Map<String, String> map2 = this.zzgff;
        zzp.zzkp();
        map2.put("is_lite_sdk", zzayh.zzaz(this.zzvr) ? "1" : "0");
        this.zzgff.put("e", TextUtils.join(",", zzaat.zzre()));
        this.zzgff.put("sdkVersion", this.zzbra);
    }

    /* access modifiers changed from: package-private */
    public final void zzn(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.zzcya).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        String uri = buildUpon.build().toString();
        if (this.zzgfm) {
            this.executor.execute(new zzclq(this, uri));
        }
        zzaxy.zzei(uri);
    }

    public final Map<String, String> zzaos() {
        return new HashMap(this.zzgff);
    }

    public final ConcurrentHashMap<String, String> zzaot() {
        return new ConcurrentHashMap<>(this.zzgff);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzgi(String str) {
        this.zzeck.zzes(str);
    }
}
