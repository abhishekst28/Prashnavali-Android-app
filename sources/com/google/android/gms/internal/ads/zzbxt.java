package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxt implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzbxj zzfug;

    private zzbxt(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxt zzp(zzbxj zzbxj) {
        return new zzbxt(zzbxj);
    }

    public static Set<zzbys<zzbuj>> zzq(zzbxj zzbxj) {
        return (Set) zzelu.zza(zzbxj.zzaju(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzq(this.zzfug);
    }
}
