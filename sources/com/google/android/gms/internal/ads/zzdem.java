package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdem<T> {
    private final Executor executor;
    private final Set<zzden<? extends zzdek<T>>> zzgvi;

    public zzdem(Executor executor2, Set<zzden<? extends zzdek<T>>> set) {
        this.executor = executor2;
        this.zzgvi = set;
    }

    public final zzdvt<T> zzt(T t) {
        ArrayList arrayList = new ArrayList(this.zzgvi.size());
        for (zzden next : this.zzgvi) {
            zzdvt zzaqs = next.zzaqs();
            if (zzacn.zzdaw.get().booleanValue()) {
                zzaqs.addListener(new zzdep(next, zzp.zzkw().elapsedRealtime()), zzbbi.zzedz);
            }
            arrayList.add(zzaqs);
        }
        return zzdvl.zzk(arrayList).zza(new zzdeo(arrayList, t), this.executor);
    }
}
