package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbuz implements zzelo<zzbux> {
    private final zzelx<zzdkx> zzflw;
    private final zzelx<Set<zzbys<zzbuy>>> zzfor;

    private zzbuz(zzelx<Set<zzbys<zzbuy>>> zzelx, zzelx<zzdkx> zzelx2) {
        this.zzfor = zzelx;
        this.zzflw = zzelx2;
    }

    public static zzbuz zzu(zzelx<Set<zzbys<zzbuy>>> zzelx, zzelx<zzdkx> zzelx2) {
        return new zzbuz(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzbux(this.zzfor.get(), this.zzflw.get());
    }
}
