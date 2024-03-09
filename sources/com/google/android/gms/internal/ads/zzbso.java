package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbso implements zzelo<zzbsp> {
    private final zzelx<zzdkx> zzfpe;
    private final zzelx<String> zzfsn;

    private zzbso(zzelx<zzdkx> zzelx, zzelx<String> zzelx2) {
        this.zzfpe = zzelx;
        this.zzfsn = zzelx2;
    }

    public static zzbso zzt(zzelx<zzdkx> zzelx, zzelx<String> zzelx2) {
        return new zzbso(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzbsp(this.zzfpe.get(), this.zzfsn.get());
    }
}
