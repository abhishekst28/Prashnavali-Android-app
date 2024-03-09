package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbjt implements zzbop {
    private zzelx<zzdkx> zzeui;
    private zzelx<Set<zzbys<zzbtp>>> zzeuu;
    private zzelx<zzbto> zzeuv;
    private zzelx<zzbvi> zzeuw;
    private zzelx<zzdlj> zzeuy;
    private zzelx<Set<zzbys<zzbuj>>> zzewe;
    private zzelx<zzbue> zzewf;
    private zzelx<String> zzeww;
    private zzelx<zzbsp> zzewx;
    private zzelx<zzbpg> zzewy;
    private final /* synthetic */ zzbjr zzfhb;
    private final zzbos zzfhw;
    private zzelx<zzafq> zzfhx;
    private zzelx<Runnable> zzfhy;
    private zzelx<zzboo> zzfhz;

    private zzbjt(zzbjr zzbjr, zzbpt zzbpt, zzbos zzbos) {
        this.zzfhb = zzbjr;
        this.zzfhw = zzbos;
        this.zzeuy = zzbpy.zze(zzbpt);
        this.zzeui = zzbpw.zzc(zzbpt);
        zzelt zzbjo = zzelt.zzar(0, 2).zzav(this.zzfhb.zzfcz).zzav(this.zzfhb.zzfda).zzbjo();
        this.zzeuu = zzbjo;
        this.zzeuv = zzell.zzas(zzbtv.zzj(zzbjo));
        zzelt zzbjo2 = zzelt.zzar(4, 3).zzau(this.zzfhb.zzfdn).zzau(this.zzfhb.zzfdo).zzau(this.zzfhb.zzfdp).zzav(this.zzfhb.zzfdq).zzav(this.zzfhb.zzfdr).zzav(this.zzfhb.zzfds).zzau(this.zzfhb.zzfdt).zzbjo();
        this.zzewe = zzbjo2;
        this.zzewf = zzell.zzas(zzbug.zzl(zzbjo2));
        zzbpv zza = zzbpv.zza(zzbpt);
        this.zzeww = zza;
        this.zzewx = zzbso.zzt(this.zzeui, zza);
        this.zzeuw = zzell.zzas(zzbwj.zzajr());
        this.zzewy = zzbqy.zza(this.zzeuy, this.zzeui, this.zzeuv, this.zzewf, this.zzfhb.zzfeb, this.zzewx, this.zzeuw);
        this.zzfhx = new zzbou(zzbos);
        zzbor zzbor = new zzbor(zzbos);
        this.zzfhy = zzbor;
        this.zzfhz = zzell.zzas(new zzbot(this.zzewy, this.zzfhx, zzbor, this.zzfhb.zzeud.zzery));
    }

    public final zzbni zzafy() {
        return (zzbni) zzelu.zza(this.zzfhz.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
