package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxu implements zzelo<Set<zzbys<zzbsu>>> {
    private final zzbxj zzfug;

    private zzbxu(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxu zzr(zzbxj zzbxj) {
        return new zzbxu(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajt(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
