package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbyd implements zzelo<Set<zzbys<VideoController.VideoLifecycleCallbacks>>> {
    private final zzbxj zzfug;

    private zzbyd(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbyd zzaa(zzbxj zzbxj) {
        return new zzbyd(zzbxj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
