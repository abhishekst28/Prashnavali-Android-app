package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbkd implements zzcyh {
    private zzbsg zzety;
    private final /* synthetic */ zzbjc zzeud;
    private zzcyx zzfkh;

    private zzbkd(zzbjc zzbjc) {
        this.zzeud = zzbjc;
    }

    public final zzcyi zzagm() {
        zzelu.zza(this.zzety, zzbsg.class);
        zzelu.zza(this.zzfkh, zzcyx.class);
        return new zzbkc(this.zzeud, this.zzfkh, new zzbqh(), new zzclw(), this.zzety, new zzdmq(), (zzdjf) null, (zzdij) null, (zzbjf) null);
    }

    @Deprecated
    public final /* synthetic */ zzcyh zzf(zzbxj zzbxj) {
        zzelu.checkNotNull(zzbxj);
        return this;
    }

    public final /* synthetic */ zzcyh zza(zzcyx zzcyx) {
        this.zzfkh = (zzcyx) zzelu.checkNotNull(zzcyx);
        return this;
    }

    public final /* synthetic */ zzcyh zzf(zzbsg zzbsg) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsg);
        return this;
    }
}
