package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcfj {
    private final Executor executor;
    private final zzbbg zzbpa;
    private final zzadm zzdla;
    private final zzto zzelx;
    private final zzeg zzenn;
    private final ScheduledExecutorService zzflf;
    private final zzcfe zzgbl;
    private final zzb zzgbm;
    private final zzcga zzgbn;
    private final Context zzvr;

    public zzcfj(Context context, zzcfe zzcfe, zzeg zzeg, zzbbg zzbbg, zzb zzb, zzto zzto, Executor executor2, zzdln zzdln, zzcga zzcga, ScheduledExecutorService scheduledExecutorService) {
        this.zzvr = context;
        this.zzgbl = zzcfe;
        this.zzenn = zzeg;
        this.zzbpa = zzbbg;
        this.zzgbm = zzb;
        this.zzelx = zzto;
        this.executor = executor2;
        this.zzdla = zzdln.zzdla;
        this.zzgbn = zzcga;
        this.zzflf = scheduledExecutorService;
    }

    public static List<zzzc> zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzzc zzl = zzl(optJSONArray.optJSONObject(i));
            if (zzl != null) {
                arrayList.add(zzl);
            }
        }
        return arrayList;
    }

    public static zzzc zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzl(optJSONObject);
    }

    private static zzzc zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzzc(optString, optString2);
    }

    public final zzdvt<zzadi> zzc(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONObject(str), this.zzdla.zzdcs);
    }

    public final zzdvt<List<zzadi>> zzd(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONArray(str), this.zzdla.zzdcs, this.zzdla.zzbnl);
    }

    private final zzdvt<List<zzadi>> zza(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzdvl.zzaf(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zza(jSONArray.optJSONObject(i), z));
        }
        return zzdvl.zzb(zzdvl.zzi(arrayList), zzcfm.zzdwg, this.executor);
    }

    private final zzdvt<zzadi> zza(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzdvl.zzaf(null);
        }
        String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzdvl.zzaf(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzdvl.zzaf(new zzadi((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zza(jSONObject.optBoolean("require"), zzdvl.zzb(this.zzgbl.zza(optString, optDouble, optBoolean), new zzcfl(optString, optDouble, optInt, optInt2), this.executor), (Object) null);
    }

    public final zzdvt<zzadd> zze(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzdvl.zzaf(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zza(optJSONObject.optBoolean("require"), zzdvl.zzb(zza(optJSONArray, false, true), new zzcfo(this, optJSONObject), this.executor), (Object) null);
    }

    private static Integer zzf(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    public final zzdvt<zzbfq> zzm(JSONObject jSONObject) {
        JSONObject zza = zzbab.zza(jSONObject, "html_containers", "instream");
        if (zza == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzdvl.zzaf(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzaxy.zzfe("Required field 'vast_xml' is missing");
                return zzdvl.zzaf(null);
            }
            return zza(zzdvl.zza(this.zzgbn.zzn(optJSONObject), (long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcrn)).intValue(), TimeUnit.SECONDS, this.zzflf), (Object) null);
        }
        zzdvt<zzbfq> zzo = this.zzgbn.zzo(zza.optString("base_url"), zza.optString("html"));
        return zzdvl.zzb(zzo, new zzcfq(zzo), (Executor) zzbbi.zzedz);
    }

    private static <T> zzdvt<T> zza(zzdvt<T> zzdvt, T t) {
        return zzdvl.zzb(zzdvt, Exception.class, new zzcfp((Object) null), zzbbi.zzedz);
    }

    private static <T> zzdvt<T> zza(boolean z, zzdvt<T> zzdvt, T t) {
        if (z) {
            return zzdvl.zzb(zzdvt, new zzcfs(zzdvt), (Executor) zzbbi.zzedz);
        }
        return zza(zzdvt, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(String str, Object obj) throws Exception {
        zzp.zzkq();
        zzbfq zza = zzbfy.zza(this.zzvr, zzbhj.zzacu(), "native-omid", false, false, this.zzenn, (zzabt) null, this.zzbpa, (zzabk) null, (zzk) null, this.zzgbm, this.zzelx, (zzsq) null, false);
        zzbbr zzl = zzbbr.zzl(zza);
        zza.zzabe().zza((zzbhf) new zzcfr(zzl));
        zza.loadData(str, "text/html", "UTF-8");
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzadd zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzf = zzf(jSONObject, "bg_color");
        Integer zzf2 = zzf(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzadd(optString, list, zzf, zzf2, num, optInt3 + optInt2, this.zzdla.zzbnm, optBoolean);
    }
}
