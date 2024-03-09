package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzahe implements zzahf<zzbfq> {
    zzahe() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        if (map.keySet().contains("start")) {
            zzbfq.zzabe().zzace();
        } else if (map.keySet().contains("stop")) {
            zzbfq.zzabe().zzacf();
        } else if (map.keySet().contains("cancel")) {
            zzbfq.zzabe().zzacg();
        }
    }
}
