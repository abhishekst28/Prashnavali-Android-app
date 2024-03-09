package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcky implements zzbsz, zzbuj, zzbvj {
    private final zzclg zzgfa;
    private final zzcln zzgfb;

    public zzcky(zzclg zzclg, zzcln zzcln) {
        this.zzgfa = zzclg;
        this.zzgfb = zzcln;
    }

    public final void onAdLoaded() {
        this.zzgfa.zzrr().put("action", "loaded");
        this.zzgfb.zzn(this.zzgfa.zzrr());
    }

    public final void zzg(zzuw zzuw) {
        this.zzgfa.zzrr().put("action", "ftl");
        this.zzgfa.zzrr().put("ftl", String.valueOf(zzuw.errorCode));
        this.zzgfa.zzrr().put("ed", zzuw.zzcgs);
        this.zzgfb.zzn(this.zzgfa.zzrr());
    }

    public final void zzd(zzasp zzasp) {
        this.zzgfa.zzj(zzasp.zzdtd);
    }

    public final void zzb(zzdlj zzdlj) {
        this.zzgfa.zzc(zzdlj);
    }
}
