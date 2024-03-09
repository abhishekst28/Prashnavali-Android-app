package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbjl implements zzbmv {
    private zzbxj zzetx;
    private zzbsg zzety;
    private zzdlj zzeua;
    private zzdjf zzeub;
    private zzdij zzeuc;
    private final /* synthetic */ zzbjc zzeud;

    private zzbjl(zzbjc zzbjc) {
        this.zzeud = zzbjc;
    }

    /* renamed from: zzafl */
    public final zzbmw zzael() {
        zzelu.zza(this.zzetx, zzbxj.class);
        zzelu.zza(this.zzety, zzbsg.class);
        return new zzbjk(this.zzeud, new zzbqh(), new zzdmi(), new zzbrq(), new zzclw(), this.zzetx, this.zzety, new zzdmq(), this.zzeua, this.zzeub, this.zzeuc);
    }

    @Deprecated
    public final /* synthetic */ zzbmv zza(zzbnd zzbnd) {
        zzelu.checkNotNull(zzbnd);
        return this;
    }

    public final /* synthetic */ zzbmv zzb(zzbsg zzbsg) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsg);
        return this;
    }

    public final /* synthetic */ zzbmv zzb(zzbxj zzbxj) {
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
