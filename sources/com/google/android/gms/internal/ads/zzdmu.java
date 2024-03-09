package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdmu implements zzelo<zzaxv> {
    private final zzdmq zzhdf;
    private final zzelx<zzdmo> zzhdg;

    private zzdmu(zzdmq zzdmq, zzelx<zzdmo> zzelx) {
        this.zzhdf = zzdmq;
        this.zzhdg = zzelx;
    }

    public static zzdmu zzc(zzdmq zzdmq, zzelx<zzdmo> zzelx) {
        return new zzdmu(zzdmq, zzelx);
    }

    public final /* synthetic */ Object get() {
        return (zzaxv) zzelu.zza(this.zzhdg.get().zzdxp, "Cannot return null from a non-@Nullable @Provides method");
    }
}
