package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzajz implements zzajs, zzajx {
    /* access modifiers changed from: private */
    public final zzbfq zzdgc;
    private final Context zzvr;

    public zzajz(Context context, zzbbg zzbbg, zzeg zzeg, zzb zzb) throws zzbgc {
        Context context2 = context;
        this.zzvr = context2;
        zzp.zzkq();
        zzbfq zza = zzbfy.zza(context2, zzbhj.zzacu(), "", false, false, zzeg, (zzabt) null, zzbbg, (zzabk) null, (zzk) null, (zzb) null, zzto.zzmy(), (zzsq) null, false);
        this.zzdgc = zza;
        zza.getView().setWillNotDraw(true);
    }

    public final void zza(String str, Map map) {
        zzajr.zza((zzajs) this, str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzajr.zza((zzajs) this, str, jSONObject);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzajr.zzb(this, str, jSONObject);
    }

    public final void zzj(String str, String str2) {
        zzajr.zza((zzajs) this, str, str2);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzwe.zzpq();
        if (zzbat.zzyn()) {
            runnable.run();
        } else {
            zzayh.zzeaj.post(runnable);
        }
    }

    public final void zzdc(String str) {
        runOnUiThread(new zzakc(this, str));
    }

    public final void zzcz(String str) {
        runOnUiThread(new zzakd(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void zzda(String str) {
        runOnUiThread(new zzakg(this, str));
    }

    public final void zzdb(String str) {
        runOnUiThread(new zzakf(this, str));
    }

    public final void zza(String str, zzahf<? super zzali> zzahf) {
        this.zzdgc.zza(str, (zzahf<? super zzbfq>) new zzaki(this, zzahf));
    }

    public final void zzb(String str, zzahf<? super zzali> zzahf) {
        this.zzdgc.zza(str, (Predicate<zzahf<? super zzbfq>>) new zzakb(zzahf));
    }

    public final void zza(zzaka zzaka) {
        zzbhc zzabe = this.zzdgc.zzabe();
        zzaka.getClass();
        zzabe.zza(zzake.zzb(zzaka));
    }

    public final zzalh zztd() {
        return new zzalk(this);
    }

    public final void destroy() {
        this.zzdgc.destroy();
    }

    public final boolean isDestroyed() {
        return this.zzdgc.isDestroyed();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzdh(String str) {
        this.zzdgc.zzdc(str);
    }
}
