package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzahd implements zzahf<zzbfq> {
    zzahd() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        if (map.keySet().contains("start")) {
            zzbfq.zzaz(true);
        }
        if (map.keySet().contains("stop")) {
            zzbfq.zzaz(false);
        }
    }
}
