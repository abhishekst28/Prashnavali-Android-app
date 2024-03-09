package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcki implements zzelo<zzckb> {
    private final zzelx<zzdjf> zzeyl;
    private final zzelx<zzto> zzgek;

    private zzcki(zzelx<zzto> zzelx, zzelx<zzdjf> zzelx2) {
        this.zzgek = zzelx;
        this.zzeyl = zzelx2;
    }

    public static zzcki zzag(zzelx<zzto> zzelx, zzelx<zzdjf> zzelx2) {
        return new zzcki(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzckb(this.zzgek.get(), this.zzeyl.get());
    }
}
