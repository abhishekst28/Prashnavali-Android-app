package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbnw implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzelx<zzboy> zzfnr;
    private final zzbnl zzfoq;

    public zzbnw(zzbnl zzbnl, zzelx<zzboy> zzelx) {
        this.zzfoq = zzbnl;
        this.zzfnr = zzelx;
    }

    public static Set<zzbys<zzbuj>> zza(zzbnl zzbnl, zzboy zzboy) {
        return (Set) zzelu.zza(Collections.singleton(new zzbys(zzboy, zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzfnr.get());
    }
}
