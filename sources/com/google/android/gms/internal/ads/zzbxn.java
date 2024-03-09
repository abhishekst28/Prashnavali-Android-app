package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxn implements zzelo<Set<zzbys<zzbwm>>> {
    private final zzbxj zzfug;

    private zzbxn(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxn zzj(zzbxj zzbxj) {
        return new zzbxn(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
