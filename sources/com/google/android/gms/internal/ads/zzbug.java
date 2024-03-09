package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbug implements zzelo<zzbue> {
    private final zzelx<Set<zzbys<zzbuj>>> zzfor;

    private zzbug(zzelx<Set<zzbys<zzbuj>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbug zzl(zzelx<Set<zzbys<zzbuj>>> zzelx) {
        return new zzbug(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbue(this.zzfor.get());
    }
}
