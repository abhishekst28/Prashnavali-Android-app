package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxv implements zzelo<Set<zzbys<zzbuo>>> {
    private final zzbxj zzfug;

    private zzbxv(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxv zzs(zzbxj zzbxj) {
        return new zzbxv(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzakb(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
