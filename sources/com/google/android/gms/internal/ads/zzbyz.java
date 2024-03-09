package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbyz implements zzelo<zzbza> {
    private final zzelx<zzdps> zzfbu;
    private final zzelx<zzdkx> zzflw;

    private zzbyz(zzelx<zzdkx> zzelx, zzelx<zzdps> zzelx2) {
        this.zzflw = zzelx;
        this.zzfbu = zzelx2;
    }

    public static zzbyz zzv(zzelx<zzdkx> zzelx, zzelx<zzdps> zzelx2) {
        return new zzbyz(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzbza(this.zzflw.get(), this.zzfbu.get());
    }
}
