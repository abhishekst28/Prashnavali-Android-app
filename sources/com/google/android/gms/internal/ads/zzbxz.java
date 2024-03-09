package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxz implements zzelo<Set<zzbys<zzqu>>> {
    private final zzbxj zzfug;

    private zzbxz(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxz zzw(zzbxj zzbxj) {
        return new zzbxz(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
