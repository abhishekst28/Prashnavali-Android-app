package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbxo implements zzelo<Set<zzbys<zzo>>> {
    private final zzbxj zzfug;

    private zzbxo(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbxo zzk(zzbxj zzbxj) {
        return new zzbxo(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
