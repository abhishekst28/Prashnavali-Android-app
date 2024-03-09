package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzp;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzchu extends zzbpd {
    private final zzaug zzdvj;
    private final WeakReference<zzbfq> zzfur;
    private final zzbyg zzfus;
    private final zzbpx zzfuu;
    private final zzdqm zzfuv;
    private final zzbtb zzfuw;
    private final zzcaz zzfuz;
    private boolean zzgce = false;
    private final zzbui zzgcs;
    private final Context zzvr;

    zzchu(zzbpg zzbpg, Context context, zzbfq zzbfq, zzcaz zzcaz, zzbyg zzbyg, zzbtb zzbtb, zzbui zzbui, zzbpx zzbpx, zzdkx zzdkx, zzdqm zzdqm) {
        super(zzbpg);
        this.zzvr = context;
        this.zzfuz = zzcaz;
        this.zzfur = new WeakReference<>(zzbfq);
        this.zzfus = zzbyg;
        this.zzfuw = zzbtb;
        this.zzgcs = zzbui;
        this.zzfuu = zzbpx;
        this.zzfuv = zzdqm;
        this.zzdvj = new zzavh(zzdkx.zzdsh);
    }

    public final boolean zzb(boolean z, Activity activity) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnp)).booleanValue()) {
            zzp.zzkp();
            if (zzayh.zzav(this.zzvr)) {
                zzaxy.zzfe("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzfuw.zzajk();
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnq)).booleanValue()) {
                    this.zzfuv.zzhc(this.zzflg.zzhbq.zzhbn.zzdsg);
                }
                return false;
            }
        }
        if (this.zzgce) {
            zzaxy.zzfe("The rewarded ad have been showed.");
            this.zzfuw.zzh(zzdmb.zza(zzdmd.zzhcx, (String) null, (zzuw) null));
            return false;
        }
        this.zzgce = true;
        this.zzfus.zzaiz();
        Context context = activity;
        if (activity == null) {
            context = this.zzvr;
        }
        try {
            this.zzfuz.zza(z, context);
            this.zzfus.zzaix();
            return true;
        } catch (zzcbc e) {
            this.zzfuw.zza(e);
            return false;
        }
    }

    public final boolean zzanh() {
        return this.zzgce;
    }

    public final zzaug zzqw() {
        return this.zzdvj;
    }

    public final boolean isClosed() {
        return this.zzfuu.isClosed();
    }

    public final boolean zzqx() {
        zzbfq zzbfq = (zzbfq) this.zzfur.get();
        return zzbfq != null && !zzbfq.zzabt();
    }

    public final Bundle getAdMetadata() {
        return this.zzgcs.getAdMetadata();
    }

    public final void finalize() throws Throwable {
        try {
            zzbfq zzbfq = (zzbfq) this.zzfur.get();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcww)).booleanValue()) {
                if (!this.zzgce && zzbfq != null) {
                    zzdvw zzdvw = zzbbi.zzedy;
                    zzbfq.getClass();
                    zzdvw.execute(zzcht.zzh(zzbfq));
                }
            } else if (zzbfq != null) {
                zzbfq.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
