package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdmh implements zzelo<zzbys<zzbsz>> {
    private final zzelx<zzdmk> zzfrb;
    private final zzdmi zzhdc;

    private zzdmh(zzdmi zzdmi, zzelx<zzdmk> zzelx) {
        this.zzhdc = zzdmi;
        this.zzfrb = zzelx;
    }

    public static zzdmh zza(zzdmi zzdmi, zzelx<zzdmk> zzelx) {
        return new zzdmh(zzdmi, zzelx);
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfrb.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
