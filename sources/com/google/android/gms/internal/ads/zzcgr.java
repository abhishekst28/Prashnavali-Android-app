package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcgr implements zzelo<zzcgs> {
    private final zzelx<String> zzfsn;
    private final zzelx<zzccv> zzfwo;
    private final zzelx<zzcco> zzgcf;

    private zzcgr(zzelx<String> zzelx, zzelx<zzcco> zzelx2, zzelx<zzccv> zzelx3) {
        this.zzfsn = zzelx;
        this.zzgcf = zzelx2;
        this.zzfwo = zzelx3;
    }

    public static zzcgr zzk(zzelx<String> zzelx, zzelx<zzcco> zzelx2, zzelx<zzccv> zzelx3) {
        return new zzcgr(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        return new zzcgs(this.zzfsn.get(), this.zzgcf.get(), this.zzfwo.get());
    }
}
