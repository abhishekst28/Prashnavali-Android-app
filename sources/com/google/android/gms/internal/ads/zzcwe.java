package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcwe<AdT> implements zzcre<AdT> {
    private final zzdpf zzfqo;
    private final zzdvw zzgoi;
    private final zzabq zzgop;
    /* access modifiers changed from: private */
    public final zzcwf<AdT> zzgoy;

    public zzcwe(zzdpf zzdpf, zzdvw zzdvw, zzabq zzabq, zzcwf<AdT> zzcwf) {
        this.zzfqo = zzdpf;
        this.zzgoi = zzdvw;
        this.zzgop = zzabq;
        this.zzgoy = zzcwf;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (this.zzgop == null || zzdkx.zzhao == null || zzdkx.zzhao.zzdou == null) ? false : true;
    }

    public final zzdvt<AdT> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        zzbbq zzbbq = new zzbbq();
        zzcwm zzcwm = new zzcwm();
        zzcwm.zza(new zzcwg(this, zzbbq, zzdlj, zzdkx, zzcwm));
        return this.zzfqo.zzu(zzdpg.CUSTOM_RENDER_SYN).zza((zzdop) new zzcwd(this, new zzabj(zzcwm, zzdkx.zzhao.zzdos, zzdkx.zzhao.zzdou)), this.zzgoi).zzw(zzdpg.CUSTOM_RENDER_ACK).zze(zzbbq).zzauz();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzabj zzabj) throws Exception {
        this.zzgop.zza(zzabj);
    }
}
