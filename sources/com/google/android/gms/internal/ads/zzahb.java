package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzahb implements zzahf<zzbfq> {
    zzahb() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbfq.zzkl();
        } else if ("resume".equals(str)) {
            zzbfq.zzkm();
        }
    }
}
