package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzchc {
    private final zzbfy zzbpp;
    private final zzbbg zzdpq;
    private final zzeg zzenn;
    private final Executor zzfmk;
    private final zzb zzgbm;
    /* access modifiers changed from: private */
    public final zzchh zzgck = new zzchh((zzchd) null);
    private final zzahl zzgcl;
    private zzdvt<zzbfq> zzgcm;
    private final Context zzvr;

    zzchc(zzchm zzchm) {
        this.zzvr = zzchm.zzvr;
        this.zzfmk = zzchm.zzfmk;
        this.zzenn = zzchm.zzenn;
        this.zzdpq = zzchm.zzdpq;
        this.zzgbm = zzchm.zzgbm;
        this.zzbpp = zzchm.zzbpp;
        this.zzgcl = new zzahl();
    }

    public final synchronized void zzang() {
        zzdvt<zzbfq> zzb = zzdvl.zzb(zzbfy.zza(this.zzvr, this.zzdpq, (String) zzwe.zzpu().zzd(zzaat.zzcrk), this.zzenn, this.zzgbm), new zzchb(this), this.zzfmk);
        this.zzgcm = zzb;
        zzbbm.zza(zzb, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void destroy() {
        if (this.zzgcm != null) {
            zzdvl.zza(this.zzgcm, new zzchd(this), this.zzfmk);
            this.zzgcm = null;
        }
    }

    public final synchronized zzdvt<JSONObject> zzc(String str, JSONObject jSONObject) {
        if (this.zzgcm == null) {
            return zzdvl.zzaf(null);
        }
        return zzdvl.zzb(this.zzgcm, new zzche(this, str, jSONObject), this.zzfmk);
    }

    public final synchronized void zza(String str, zzahf<Object> zzahf) {
        if (this.zzgcm != null) {
            zzdvl.zza(this.zzgcm, new zzchg(this, str, zzahf), this.zzfmk);
        }
    }

    public final synchronized void zzb(String str, zzahf<Object> zzahf) {
        if (this.zzgcm != null) {
            zzdvl.zza(this.zzgcm, new zzchf(this, str, zzahf), this.zzfmk);
        }
    }

    public final synchronized void zza(String str, Map<String, ?> map) {
        if (this.zzgcm != null) {
            zzdvl.zza(this.zzgcm, new zzchi(this, str, map), this.zzfmk);
        }
    }

    public final <T> void zza(WeakReference<T> weakReference, String str, zzahf<T> zzahf) {
        zza(str, (zzahf<Object>) new zzchl(this, weakReference, str, zzahf, (zzchd) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(String str, JSONObject jSONObject, zzbfq zzbfq) throws Exception {
        return this.zzgcl.zza(zzbfq, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbfq zzm(zzbfq zzbfq) {
        zzbfq.zza("/result", (zzahf<? super zzbfq>) this.zzgcl);
        zzbhc zzabe = zzbfq.zzabe();
        zzchh zzchh = this.zzgck;
        zzabe.zza((zzut) null, zzchh, zzchh, zzchh, zzchh, false, (zzahi) null, new zza(this.zzvr, (zzavu) null, (zzasa) null), (zzaqf) null, (zzavu) null);
        return zzbfq;
    }
}
