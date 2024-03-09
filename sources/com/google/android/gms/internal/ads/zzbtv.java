package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbtv implements zzelo<zzbto> {
    private final zzelx<Set<zzbys<zzbtp>>> zzfor;

    private zzbtv(zzelx<Set<zzbys<zzbtp>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbtv zzj(zzelx<Set<zzbys<zzbtp>>> zzelx) {
        return new zzbtv(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbto(this.zzfor.get());
    }
}
