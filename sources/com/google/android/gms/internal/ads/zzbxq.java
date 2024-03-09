package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxq implements zzelo<Set<zzbys<zzut>>> {
    private final zzbxj zzfug;

    private zzbxq(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxq zzm(zzbxj zzbxj) {
        return new zzbxq(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajz(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
