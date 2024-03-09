package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbjy implements zzcia {
    private zzbxj zzetx;
    private zzbsg zzety;
    private zzdlj zzeua;
    private zzdjf zzeub;
    private zzdij zzeuc;
    private final /* synthetic */ zzbjc zzeud;

    private zzbjy(zzbjc zzbjc) {
        this.zzeud = zzbjc;
    }

    /* renamed from: zzage */
    public final zzchx zzael() {
        zzelu.zza(this.zzetx, zzbxj.class);
        zzelu.zza(this.zzety, zzbsg.class);
        return new zzbkb(this.zzeud, new zzbqh(), new zzdmi(), new zzbrq(), new zzclw(), this.zzetx, this.zzety, new zzdmq(), this.zzeua, this.zzeub, this.zzeuc);
    }

    public final /* synthetic */ zzcia zze(zzbsg zzbsg) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsg);
        return this;
    }

    public final /* synthetic */ zzcia zze(zzbxj zzbxj) {
        this.zzetx = (zzbxj) zzelu.checkNotNull(zzbxj);
        return this;
    }

    public final /* synthetic */ zzbsd zza(zzdij zzdij) {
        this.zzeuc = zzdij;
        return this;
    }

    public final /* synthetic */ zzbsd zza(zzdjf zzdjf) {
        this.zzeub = zzdjf;
        return this;
    }

    public final /* synthetic */ zzbsd zza(zzdlj zzdlj) {
        this.zzeua = zzdlj;
        return this;
    }
}
