package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxl implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzbxj zzfug;

    private zzbxl(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxl zzg(zzbxj zzbxj) {
        return new zzbxl(zzbxj);
    }

    public static Set<zzbys<zzbuj>> zzh(zzbxj zzbxj) {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzh(this.zzfug);
    }
}
