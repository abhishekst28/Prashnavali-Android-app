package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbox implements zzelo<zzboy> {
    private final zzelx<zzdkx> zzflw;
    private final zzelx<zzbtl> zzfpi;
    private final zzelx<zzbun> zzfpj;

    private zzbox(zzelx<zzdkx> zzelx, zzelx<zzbtl> zzelx2, zzelx<zzbun> zzelx3) {
        this.zzflw = zzelx;
        this.zzfpi = zzelx2;
        this.zzfpj = zzelx3;
    }

    public static zzbox zzf(zzelx<zzdkx> zzelx, zzelx<zzbtl> zzelx2, zzelx<zzbun> zzelx3) {
        return new zzbox(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        return new zzboy(this.zzflw.get(), this.zzfpi.get(), this.zzfpj.get());
    }
}
