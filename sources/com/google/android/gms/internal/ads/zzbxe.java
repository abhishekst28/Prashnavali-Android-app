package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbxe<ListenerT> {
    private final Map<ListenerT, Executor> zzfts = new HashMap();

    protected zzbxe(Set<zzbys<ListenerT>> set) {
        zzb(set);
    }

    public final synchronized void zza(zzbys<ListenerT> zzbys) {
        zza(zzbys.zzfum, zzbys.executor);
    }

    public final synchronized void zza(ListenerT listenert, Executor executor) {
        this.zzfts.put(listenert, executor);
    }

    private final synchronized void zzb(Set<zzbys<ListenerT>> set) {
        for (zzbys<ListenerT> zza : set) {
            zza(zza);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zza(zzbxg<ListenerT> zzbxg) {
        for (Map.Entry next : this.zzfts.entrySet()) {
            ((Executor) next.getValue()).execute(new zzbxh(zzbxg, next.getKey()));
        }
    }
}
