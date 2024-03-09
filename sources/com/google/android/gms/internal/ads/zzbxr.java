package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxr implements zzelo<Set<zzbys<zzbtm>>> {
    private final zzbxj zzfug;

    private zzbxr(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxr zzn(zzbxj zzbxj) {
        return new zzbxr(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzaka(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
