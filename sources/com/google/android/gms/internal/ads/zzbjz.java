package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbjz implements zzdkp {
    private final /* synthetic */ zzbjc zzeud;
    private zzelx<Context> zzfgd;
    private zzelx<String> zzfge;
    private zzelx<zzdiz<zzchx, zzchu>> zzfjd;
    private zzelx<zzdje> zzfje;
    private zzelx<zzdli> zzfjf;
    private zzelx<zzdkd> zzfjg;
    private zzelx<zzdkr> zzfjh;
    private zzelx<zzdkl> zzfji;

    private zzbjz(zzbjc zzbjc, Context context, String str) {
        this.zzeud = zzbjc;
        zzelo zzba = zzeln.zzba(context);
        this.zzfgd = zzba;
        this.zzfjd = new zzdjc(zzba, this.zzeud.zzetu, this.zzeud.zzetv);
        this.zzfje = zzell.zzas(new zzdkb(this.zzeud.zzetu));
        this.zzfjf = zzell.zzas(zzdll.zzaso());
        zzelx<zzdkd> zzas = zzell.zzas(new zzdki(this.zzfgd, this.zzeud.zzery, this.zzeud.zzerp, this.zzfjd, this.zzfje, zzdlo.zzasq(), this.zzfjf));
        this.zzfjg = zzas;
        this.zzfjh = zzell.zzas(new zzdks(zzas, this.zzfje, this.zzfjf));
        zzelo zzbb = zzeln.zzbb(str);
        this.zzfge = zzbb;
        this.zzfji = zzell.zzas(new zzdkm(zzbb, this.zzfjg, this.zzfgd, this.zzfje, this.zzfjf));
    }

    public final zzdkr zzagf() {
        return this.zzfjh.get();
    }

    public final zzdkl zzagg() {
        return this.zzfji.get();
    }
}
