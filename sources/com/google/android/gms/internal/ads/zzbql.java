package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbql implements zzelo<zzbys<zzbuj>> {
    private final zzbqh zzfra;
    private final zzelx<zzbqq> zzfrb;

    private zzbql(zzbqh zzbqh, zzelx<zzbqq> zzelx) {
        this.zzfra = zzbqh;
        this.zzfrb = zzelx;
    }

    public static zzbql zzc(zzbqh zzbqh, zzelx<zzbqq> zzelx) {
        return new zzbql(zzbqh, zzelx);
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfrb.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
