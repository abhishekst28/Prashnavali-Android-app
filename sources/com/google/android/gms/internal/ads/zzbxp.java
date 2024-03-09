package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxp implements zzelo<Set<zzbys<zzbsz>>> {
    private final zzbxj zzfug;

    private zzbxp(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxp zzl(zzbxj zzbxj) {
        return new zzbxp(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajv(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
