package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzc;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzagy implements zzahf<zzbfq> {
    zzagy() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        if (zzbfq.zzabs() != null) {
            zzbfq.zzabs().zzmr();
        }
        zzc zzaba = zzbfq.zzaba();
        if (zzaba != null) {
            zzaba.close();
            return;
        }
        zzc zzabb = zzbfq.zzabb();
        if (zzabb != null) {
            zzabb.close();
        } else {
            zzaxy.zzfe("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
