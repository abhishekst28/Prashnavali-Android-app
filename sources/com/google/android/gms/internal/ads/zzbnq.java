package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbnq implements zzelo<zzbue> {
    private final zzbnl zzfoq;
    private final zzelx<Set<zzbys<zzbuj>>> zzfor;

    public zzbnq(zzbnl zzbnl, zzelx<Set<zzbys<zzbuj>>> zzelx) {
        this.zzfoq = zzbnl;
        this.zzfor = zzelx;
    }

    public static zzbue zza(zzbnl zzbnl, Set<zzbys<zzbuj>> set) {
        return (zzbue) zzelu.zza(zzbnl.zza(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzfor.get());
    }
}
