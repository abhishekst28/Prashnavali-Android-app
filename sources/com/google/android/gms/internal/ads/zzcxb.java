package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxb extends zzwq {
    private zzwl zzbpf;
    private final zzbii zzgmy;
    private final Context zzgpr;
    private final zzdlp zzgps = new zzdlp();
    private final zzcdi zzgpt = new zzcdi();

    public zzcxb(zzbii zzbii, Context context, String str) {
        this.zzgmy = zzbii;
        this.zzgps.zzgt(str);
        this.zzgpr = context;
    }

    public final zzwm zzqc() {
        zzcdg zzamk = this.zzgpt.zzamk();
        this.zzgps.zzc(zzamk.zzamh());
        this.zzgps.zzd(zzamk.zzami());
        zzdlp zzdlp = this.zzgps;
        if (zzdlp.zzke() == null) {
            zzdlp.zze(zzvj.zzpi());
        }
        return new zzcxe(this.zzgpr, this.zzgmy, this.zzgps, zzamk, this.zzbpf);
    }

    public final void zzb(zzwl zzwl) {
        this.zzbpf = zzwl;
    }

    public final void zza(zzaew zzaew) {
        this.zzgpt.zzb(zzaew);
    }

    public final void zza(zzafl zzafl) {
        this.zzgpt.zzb(zzafl);
    }

    public final void zza(zzaex zzaex) {
        this.zzgpt.zzb(zzaex);
    }

    public final void zza(String str, zzafd zzafd, zzafc zzafc) {
        this.zzgpt.zzb(str, zzafd, zzafc);
    }

    public final void zza(zzadm zzadm) {
        this.zzgps.zzb(zzadm);
    }

    public final void zza(zzair zzair) {
        this.zzgps.zzb(zzair);
    }

    public final void zza(zzaiz zzaiz) {
        this.zzgpt.zzb(zzaiz);
    }

    public final void zzb(zzxi zzxi) {
        this.zzgps.zzc(zzxi);
    }

    public final void zza(zzafk zzafk, zzvj zzvj) {
        this.zzgpt.zza(zzafk);
        this.zzgps.zze(zzvj);
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzgps.zzb(publisherAdViewOptions);
    }
}
