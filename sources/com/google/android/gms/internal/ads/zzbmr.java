package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbmr implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzbmp zzfnq;
    private final zzelx<zzboy> zzfnr;

    public zzbmr(zzbmp zzbmp, zzelx<zzboy> zzelx) {
        this.zzfnq = zzbmp;
        this.zzfnr = zzelx;
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.singleton(new zzbys(this.zzfnr.get(), zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
