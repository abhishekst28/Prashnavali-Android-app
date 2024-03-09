package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbji extends zzdff {
    private final /* synthetic */ zzbjc zzeud;
    private zzelx<String> zzeyj;
    private zzelx<zzcku> zzeyz;
    private zzelx<Map<zzdpg, zzcku>> zzezb;
    private zzelx<Set<zzbys<zzdpl>>> zzezd;
    private zzelx<Set<zzbys<zzdpl>>> zzezk;
    private zzelx zzezl;
    private zzelx<zzdpf> zzezm;
    private zzelx<ApplicationInfo> zzezw;
    private zzelx<zzdgj> zzfbb;
    private final zzdgo zzfeg;
    private zzelx<zzdfb> zzfeh;
    private zzelx<String> zzfei;
    private zzelx<zzdfl> zzfej;
    private zzelx<Integer> zzfek;
    private zzelx<zzdfp> zzfel;
    private zzelx<zzdfv> zzfem;
    private zzelx<zzdga> zzfen;
    private zzelx<Boolean> zzfeo;
    private zzelx<zzdgn> zzfep;
    private zzelx<zzdhb> zzfeq;
    private zzelx<zzcku> zzfer;
    private zzelx<zzcku> zzfes;
    private zzelx<zzcku> zzfet;

    private zzbji(zzbjc zzbjc, zzdgo zzdgo) {
        this.zzeud = zzbjc;
        this.zzfeg = zzdgo;
        this.zzfeh = new zzdfc(zzblc.zzflb, this.zzeud.zzesf, this.zzeud.zzesa, zzdof.zzaul());
        this.zzfei = new zzdgr(zzdgo);
        this.zzfej = new zzdfn(zzbix.zzers, this.zzeud.zzesf, this.zzfei, zzdof.zzaul());
        this.zzfek = new zzdgs(zzdgo);
        this.zzfel = new zzdft(zzblc.zzflb, this.zzfek, this.zzeud.zzesf, this.zzeud.zzesy, this.zzeud.zzesa, zzdof.zzaul());
        this.zzfem = new zzdfx(zzbkw.zzfkx, zzdof.zzaul(), this.zzeud.zzesf);
        this.zzfen = new zzdgc(zzbky.zzfky, zzdof.zzaul(), this.zzfei);
        this.zzfeo = new zzdgt(zzdgo);
        this.zzezw = new zzdgq(zzdgo);
        this.zzfbb = new zzdgl(this.zzeud.zzeta, this.zzeud.zzesa, this.zzfeo, this.zzezw);
        this.zzfep = new zzdgp(zzbla.zzfkz, this.zzeud.zzesa, this.zzeud.zzesf);
        this.zzfeq = new zzdhd(zzdof.zzaul());
        this.zzeyj = new zzdgv(zzdgo);
        this.zzeyz = zzell.zzas(zzckj.zzaoe());
        this.zzfer = zzell.zzas(zzckh.zzaod());
        this.zzfes = zzell.zzas(zzckl.zzaog());
        this.zzfet = zzell.zzas(zzckn.zzaoi());
        this.zzezb = ((zzels) ((zzels) ((zzels) ((zzels) zzelq.zzic(4).zza(zzdpg.GMS_SIGNALS, this.zzeyz)).zza(zzdpg.BUILD_URL, this.zzfer)).zza(zzdpg.HTTP, this.zzfes)).zza(zzdpg.PRE_PROCESS, this.zzfet)).zzbjn();
        this.zzezd = zzell.zzas(new zzckp(this.zzeyj, this.zzeud.zzesf, zzdof.zzaul(), this.zzezb));
        zzelt<Set<zzbys<zzdpl>>> zzbjo = zzelt.zzar(0, 1).zzav(this.zzezd).zzbjo();
        this.zzezk = zzbjo;
        this.zzezl = zzdpn.zzar(zzbjo);
        this.zzezm = zzell.zzas(zzdpo.zzv(zzdof.zzaul(), this.zzeud.zzesa, this.zzezl));
    }

    private final zzdge zzafe() {
        return new zzdge((zzaag) zzelu.zza(new zzaag(), "Cannot return null from a non-@Nullable @Provides method"), zzdof.zzaum(), (List) zzelu.zza(this.zzfeg.zzarr(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    private final zzdfh zzaff() {
        return new zzdfh(zzbkz.zzagu(), zzdof.zzaum(), (String) zzelu.zza(this.zzfeg.zzaro(), "Cannot return null from a non-@Nullable @Provides method"), this.zzfeg.zzarp());
    }

    public final zzdem<JSONObject> zzafg() {
        zzdvw zzaum = zzdof.zzaum();
        long longValue = ((Long) zzwe.zzpu().zzd(zzaat.zzcsa)).longValue();
        long longValue2 = ((Long) zzwe.zzpu().zzd(zzaat.zzcsi)).longValue();
        return zzder.zza(zzaum, zzdtn.zza((zzden) zzelu.zza(new zzdcy(new zzdga(zzbkv.zzagq(), zzdof.zzaum(), zzdgr.zzc(this.zzfeg)), 0, (ScheduledExecutorService) this.zzeud.zzesa.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzden) zzelu.zza(new zzdcy(new zzdgj(zzbki.zzb(this.zzeud.zzerw), (ScheduledExecutorService) this.zzeud.zzesa.get(), this.zzfeg.zzarq(), zzdgq.zzb(this.zzfeg)), longValue, (ScheduledExecutorService) this.zzeud.zzesa.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzden) zzelu.zza(new zzdcy(new zzdgn(zzbkx.zzags(), (ScheduledExecutorService) this.zzeud.zzesa.get(), zzbik.zza(this.zzeud.zzerx)), longValue2, (ScheduledExecutorService) this.zzeud.zzesa.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzden) zzelu.zza(new zzdcy(new zzdfb(zzbkz.zzagu(), zzbik.zza(this.zzeud.zzerx), (ScheduledExecutorService) this.zzeud.zzesa.get(), zzdof.zzaum()), 0, (ScheduledExecutorService) this.zzeud.zzesa.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzden) zzelu.zza(new zzdcy(new zzdhb(zzdof.zzaum()), 0, (ScheduledExecutorService) this.zzeud.zzesa.get()), "Cannot return null from a non-@Nullable @Provides method"), (zzden) zzelu.zza(zzdgu.zzarv(), "Cannot return null from a non-@Nullable @Provides method"), new zzdfl((zzass) null, zzbik.zza(this.zzeud.zzerx), zzdgr.zzc(this.zzfeg), zzdof.zzaum()), new zzdfv(zzbkt.zzago(), zzdof.zzaum(), zzbik.zza(this.zzeud.zzerx)), zzafe(), zzaff(), new zzdfp(zzbkz.zzagu(), this.zzfeg.zzaru(), zzbik.zza(this.zzeud.zzerx), (zzaxk) this.zzeud.zzesy.get(), (ScheduledExecutorService) this.zzeud.zzesa.get(), zzdof.zzaum()), (zzden) this.zzeud.zzesz.get()));
    }

    public final zzdem<JSONObject> zzafh() {
        return zzdgz.zza(zzbkv.zzagq(), this.zzeud.zzesz.get(), zzaff(), zzafe(), zzell.zzat(this.zzfeh), zzell.zzat(this.zzfej), zzell.zzat(this.zzfel), zzell.zzat(this.zzfem), zzell.zzat(this.zzfen), zzell.zzat(this.zzfbb), zzell.zzat(this.zzfep), zzell.zzat(this.zzfeq), zzdof.zzaum(), (ScheduledExecutorService) this.zzeud.zzesa.get());
    }

    public final zzdpf zzafi() {
        return this.zzezm.get();
    }
}
