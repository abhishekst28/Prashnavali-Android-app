package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxs implements zzelo<Set<zzbys<zzbti>>> {
    private final zzbxj zzfug;

    private zzbxs(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxs zzo(zzbxj zzbxj) {
        return new zzbxs(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajw(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
