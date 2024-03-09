package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcgp implements zzelo<zzcgo> {
    private final zzelx<zzccv> zzfwo;
    private final zzelx<zzcco> zzgcf;

    private zzcgp(zzelx<zzcco> zzelx, zzelx<zzccv> zzelx2) {
        this.zzgcf = zzelx;
        this.zzfwo = zzelx2;
    }

    public static zzcgp zzy(zzelx<zzcco> zzelx, zzelx<zzccv> zzelx2) {
        return new zzcgp(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzcgo(this.zzgcf.get(), this.zzfwo.get());
    }
}
