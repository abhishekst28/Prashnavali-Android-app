package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzajj extends zzajw<zzali> implements zzajs, zzajx {
    private final zzbhx zzdfq;
    /* access modifiers changed from: private */
    public zzaka zzdfr;

    public zzajj(Context context, zzbbg zzbbg) throws zzbgc {
        try {
            zzbhx zzbhx = new zzbhx(context, new zzajp(this));
            this.zzdfq = zzbhx;
            zzbhx.setWillNotDraw(true);
            this.zzdfq.addJavascriptInterface(new zzajq(this), "GoogleJsInterface");
            zzp.zzkp().zza(context, zzbbg.zzbra, this.zzdfq.getSettings());
            super.zzg(this);
        } catch (Throwable th) {
            throw new zzbgc("Init failed.", th);
        }
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

    public final void zzcz(String str) {
        zzda(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    public final void zzda(String str) {
        zzbbi.zzedy.execute(new zzajm(this, str));
    }

    public final void zzdb(String str) {
        zzbbi.zzedy.execute(new zzajl(this, str));
    }

    public final void zza(zzaka zzaka) {
        this.zzdfr = zzaka;
    }

    public final void destroy() {
        this.zzdfq.destroy();
    }

    public final boolean isDestroyed() {
        return this.zzdfq.isDestroyed();
    }

    public final zzalh zztd() {
        return new zzalk(this);
    }

    public final void zzdc(String str) {
        zzbbi.zzedy.execute(new zzajo(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzdd(String str) {
        this.zzdfq.zzdc(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzde(String str) {
        this.zzdfq.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzdf(String str) {
        this.zzdfq.loadData(str, "text/html", "UTF-8");
    }
}
