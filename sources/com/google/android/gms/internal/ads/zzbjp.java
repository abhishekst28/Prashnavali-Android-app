package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbjp implements zzdhr {
    private final /* synthetic */ zzbjc zzeud;
    private zzelx<Context> zzfgd;
    private zzelx<String> zzfge;
    private zzelx<zzdiz<zzbmw, zzbnc>> zzfgf;
    private zzelx<zzdht> zzfgg;
    private zzelx<zzdhc> zzfgh;
    private zzelx<zzdhl> zzfgi;

    private zzbjp(zzbjc zzbjc, Context context, String str) {
        this.zzeud = zzbjc;
        this.zzfgd = zzeln.zzba(context);
        this.zzfge = zzeln.zzba(str);
        this.zzfgf = new zzdjd(this.zzfgd, this.zzeud.zzetu, this.zzeud.zzetv);
        this.zzfgg = zzell.zzas(new zzdhz(this.zzeud.zzetu));
        this.zzfgh = zzell.zzas(new zzdhi(this.zzfgd, this.zzeud.zzery, this.zzeud.zzerp, this.zzfgf, this.zzfgg, zzdlo.zzasq()));
        this.zzfgi = zzell.zzas(new zzdho(this.zzeud.zzerp, this.zzfgd, this.zzfge, this.zzfgh, this.zzfgg, this.zzeud.zzesg));
    }

    public final zzdhl zzafq() {
        return this.zzfgi.get();
    }
}
