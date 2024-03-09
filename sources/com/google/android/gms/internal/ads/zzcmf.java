package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcmf implements zzelo<zzcmg> {
    private final zzelx<zzbii> zzerp;
    private final zzelx<zzclu> zzgek;

    private zzcmf(zzelx<zzclu> zzelx, zzelx<zzbii> zzelx2) {
        this.zzgek = zzelx;
        this.zzerp = zzelx2;
    }

    public static zzcmf zzan(zzelx<zzclu> zzelx, zzelx<zzbii> zzelx2) {
        return new zzcmf(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzcmg(this.zzgek.get(), this.zzerp.get());
    }
}
