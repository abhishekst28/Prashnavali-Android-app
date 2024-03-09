package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbyp implements zzelo<zzbyo> {
    private final zzelx<Set<zzbys<zzbyl>>> zzfor;

    private zzbyp(zzelx<Set<zzbys<zzbyl>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbyp zzt(zzelx<Set<zzbys<zzbyl>>> zzelx) {
        return new zzbyp(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbyo(this.zzfor.get());
    }
}
