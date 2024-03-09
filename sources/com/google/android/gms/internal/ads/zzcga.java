package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcga {
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;

    public zzcga(zzdln zzdln, Executor executor, zzcih zzcih) {
        this.zzfqn = zzdln;
        this.zzfmk = executor;
        this.zzfzy = zzcih;
    }

    public final zzdvt<zzbfq> zzn(JSONObject jSONObject) {
        return zzdvl.zzb(zzdvl.zzb(zzdvl.zzaf(null), new zzcgb(this), this.zzfmk), new zzcfz(this, jSONObject), this.zzfmk);
    }

    public final zzdvt<zzbfq> zzo(String str, String str2) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzcgc(this, str, str2), this.zzfmk);
    }

    private final void zzk(zzbfq zzbfq) {
        zzbfq.zza("/video", (zzahf<? super zzbfq>) zzagp.zzdej);
        zzbfq.zza("/videoMeta", (zzahf<? super zzbfq>) zzagp.zzdek);
        zzbfq.zza("/precache", (zzahf<? super zzbfq>) new zzbfa());
        zzbfq.zza("/delayPageLoaded", (zzahf<? super zzbfq>) zzagp.zzden);
        zzbfq.zza("/instrument", (zzahf<? super zzbfq>) zzagp.zzdel);
        zzbfq.zza("/log", (zzahf<? super zzbfq>) zzagp.zzdee);
        zzbfq.zza("/videoClicked", (zzahf<? super zzbfq>) zzagp.zzdef);
        zzbfq.zzabe().zzbb(true);
        zzbfq.zza("/click", (zzahf<? super zzbfq>) zzagp.zzdea);
        if (this.zzfqn.zzdrn != null) {
            zzbfq.zzabe().zzbc(true);
            zzbfq.zza("/open", (zzahf<? super zzbfq>) new zzahj((zza) null, (zzapw) null));
        } else {
            zzbfq.zzabe().zzbc(false);
        }
        if (zzp.zzln().zzac(zzbfq.getContext())) {
            zzbfq.zza("/logScionEvent", (zzahf<? super zzbfq>) new zzahh(zzbfq.getContext()));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzr(Object obj) throws Exception {
        zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        zzbbr zzl = zzbbr.zzl(zza);
        zzk(zza);
        zza.zzabe().zza((zzbhe) new zzcge(zzl));
        zza.loadUrl((String) zzwe.zzpu().zzd(zzaat.zzcrm));
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(String str, String str2, Object obj) throws Exception {
        zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        zzbbr zzl = zzbbr.zzl(zza);
        zzk(zza);
        if (this.zzfqn.zzdrn != null) {
            zza.zza(zzbhj.zzacw());
        } else {
            zza.zza(zzbhj.zzacv());
        }
        zza.zzabe().zza((zzbhf) new zzcgd(this, zza, zzl));
        zza.zzb(str, str2, (String) null);
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbfq zzbfq, zzbbr zzbbr, boolean z) {
        if (z) {
            if (!(this.zzfqn.zzhbt == null || zzbfq.zzzo() == null)) {
                zzbfq.zzzo().zzb(this.zzfqn.zzhbt);
            }
            zzbbr.zzys();
            return;
        }
        zzbbr.setException(new zzcuh(zzdmd.zzhco, "Instream video Web View failed to load."));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(JSONObject jSONObject, zzbfq zzbfq) throws Exception {
        zzbbr zzl = zzbbr.zzl(zzbfq);
        if (this.zzfqn.zzdrn != null) {
            zzbfq.zza(zzbhj.zzacw());
        } else {
            zzbfq.zza(zzbhj.zzacv());
        }
        zzbfq.zzabe().zza((zzbhf) new zzcgg(this, zzbfq, zzl));
        zzbfq.zza("google.afma.nativeAds.renderVideo", jSONObject);
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbfq zzbfq, zzbbr zzbbr, boolean z) {
        if (!(this.zzfqn.zzhbt == null || zzbfq.zzzo() == null)) {
            zzbfq.zzzo().zzb(this.zzfqn.zzhbt);
        }
        zzbbr.zzys();
    }
}
