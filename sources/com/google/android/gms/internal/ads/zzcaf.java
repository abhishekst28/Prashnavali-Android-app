package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcaf implements zzelo<Set<zzbys<zzbsu>>> {
    private final zzelx<zzbru> zzfnr;
    private final zzbzw zzfva;

    private zzcaf(zzbzw zzbzw, zzelx<zzbru> zzelx) {
        this.zzfva = zzbzw;
        this.zzfnr = zzelx;
    }

    public static zzcaf zze(zzbzw zzbzw, zzelx<zzbru> zzelx) {
        return new zzcaf(zzbzw, zzelx);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfva.zzb(this.zzfnr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
