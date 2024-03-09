package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxy implements zzelo<Set<zzbys<zzbuy>>> {
    private final zzbxj zzfug;

    private zzbxy(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxy zzv(zzbxj zzbxj) {
        return new zzbxy(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzakc(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
