package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcna implements zzelo<zzcmw> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzdvw> zzghd;
    private final zzelx<zzcoh> zzghe;
    private final zzelx<zzcpj> zzghf;

    private zzcna(zzelx<zzdvw> zzelx, zzelx<zzdvw> zzelx2, zzelx<zzcoh> zzelx3, zzelx<zzcpj> zzelx4) {
        this.zzghd = zzelx;
        this.zzerr = zzelx2;
        this.zzghe = zzelx3;
        this.zzghf = zzelx4;
    }

    public static zzcna zzd(zzelx<zzdvw> zzelx, zzelx<zzdvw> zzelx2, zzelx<zzcoh> zzelx3, zzelx<zzcpj> zzelx4) {
        return new zzcna(zzelx, zzelx2, zzelx3, zzelx4);
    }

    public final /* synthetic */ Object get() {
        return new zzcmw(this.zzghd.get(), this.zzerr.get(), this.zzghe.get(), zzell.zzat(this.zzghf));
    }
}
