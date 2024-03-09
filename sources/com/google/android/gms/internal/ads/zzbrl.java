package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbrl implements zzelo<zzbys<zzbuj>> {
    private final zzelx<zzbrx> zzfmx;
    private final zzbqz zzfri;

    private zzbrl(zzbqz zzbqz, zzelx<zzbrx> zzelx) {
        this.zzfri = zzbqz;
        this.zzfmx = zzelx;
    }

    public static zzbrl zzb(zzbqz zzbqz, zzelx<zzbrx> zzelx) {
        return new zzbrl(zzbqz, zzelx);
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
