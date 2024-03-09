package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdmp implements zzelo<zzaya> {
    private final zzdmq zzhdf;
    private final zzelx<zzdmo> zzhdg;

    private zzdmp(zzdmq zzdmq, zzelx<zzdmo> zzelx) {
        this.zzhdf = zzdmq;
        this.zzhdg = zzelx;
    }

    public static zzdmp zza(zzdmq zzdmq, zzelx<zzdmo> zzelx) {
        return new zzdmp(zzdmq, zzelx);
    }

    public static zzaya zza(zzdmq zzdmq, zzdmo zzdmo) {
        return (zzaya) zzelu.zza(zzdmo.zzdza, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzhdf, this.zzhdg.get());
    }
}
