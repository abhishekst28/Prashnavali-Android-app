package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbry implements zzelo<zzbvb> {
    private final zzelx<zzbvb> zzfrw;

    private zzbry(zzelx<zzbvb> zzelx) {
        this.zzfrw = zzelx;
    }

    public static zzbry zzf(zzelx<zzbvb> zzelx) {
        return new zzbry(zzelx);
    }

    public final /* synthetic */ Object get() {
        return (zzbvb) zzelu.zza(this.zzfrw.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
