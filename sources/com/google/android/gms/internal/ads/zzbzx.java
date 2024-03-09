package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbzx implements zzelo<Set<zzbys<zzbti>>> {
    private final zzelx<zzbru> zzfnr;
    private final zzbzw zzfva;

    private zzbzx(zzbzw zzbzw, zzelx<zzbru> zzelx) {
        this.zzfva = zzbzw;
        this.zzfnr = zzelx;
    }

    public static zzbzx zza(zzbzw zzbzw, zzelx<zzbru> zzelx) {
        return new zzbzx(zzbzw, zzelx);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.singleton(zzbys.zzb(this.zzfnr.get(), zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
