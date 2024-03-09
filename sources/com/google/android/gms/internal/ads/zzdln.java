package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdln {
    public final zzvj zzbpb;
    public final zzadm zzdla;
    public final zzair zzdrn;
    public final int zzgra;
    public final boolean zzgso;
    public final zzxi zzhbs;
    public final zzaac zzhbt;
    public final zzvc zzhbu;
    public final String zzhbv;
    public final ArrayList<String> zzhbw;
    public final ArrayList<String> zzhbx;
    public final zzvm zzhby;
    public final PublisherAdViewOptions zzhbz;
    public final zzxc zzhca;
    public final zzdla zzhcb;

    private zzdln(zzdlp zzdlp) {
        zzaac zzaac;
        zzadm zzadm;
        this.zzbpb = zzdlp.zzbpb;
        this.zzhbv = zzdlp.zzhbv;
        this.zzhbs = zzdlp.zzhbs;
        this.zzhbu = new zzvc(zzdlp.zzhbu.versionCode, zzdlp.zzhbu.zzcgv, zzdlp.zzhbu.extras, zzdlp.zzhbu.zzcgw, zzdlp.zzhbu.zzcgx, zzdlp.zzhbu.zzcgy, zzdlp.zzhbu.zzadj, zzdlp.zzhbu.zzbnu || zzdlp.zzbnu, zzdlp.zzhbu.zzcgz, zzdlp.zzhbu.zzcha, zzdlp.zzhbu.zznb, zzdlp.zzhbu.zzchb, zzdlp.zzhbu.zzchc, zzdlp.zzhbu.zzchd, zzdlp.zzhbu.zzche, zzdlp.zzhbu.zzchf, zzdlp.zzhbu.zzchg, zzdlp.zzhbu.zzchh, zzdlp.zzhbu.zzchi, zzdlp.zzhbu.zzadk, zzdlp.zzhbu.zzadl, zzdlp.zzhbu.zzchj);
        if (zzdlp.zzhbt != null) {
            zzaac = zzdlp.zzhbt;
        } else if (zzdlp.zzdla != null) {
            zzaac = zzdlp.zzdla.zzdct;
        } else {
            zzaac = null;
        }
        this.zzhbt = zzaac;
        this.zzhbw = zzdlp.zzhbw;
        this.zzhbx = zzdlp.zzhbx;
        if (zzdlp.zzhbw == null) {
            zzadm = null;
        } else if (zzdlp.zzdla == null) {
            zzadm = new zzadm(new NativeAdOptions.Builder().build());
        } else {
            zzadm = zzdlp.zzdla;
        }
        this.zzdla = zzadm;
        this.zzhby = zzdlp.zzhby;
        this.zzgra = zzdlp.zzgra;
        this.zzhbz = zzdlp.zzhbz;
        this.zzhca = zzdlp.zzhca;
        this.zzdrn = zzdlp.zzdrn;
        this.zzhcb = new zzdla(zzdlp.zzhcc);
        this.zzgso = zzdlp.zzgso;
    }

    public final zzafq zzasp() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzhbz;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzju();
    }
}
