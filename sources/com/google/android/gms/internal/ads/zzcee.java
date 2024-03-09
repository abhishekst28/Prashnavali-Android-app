package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcee implements zzahf {
    private final zzcdz zzgaa;

    zzcee(zzcdz zzcdz) {
        this.zzgaa = zzcdz;
    }

    public final void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        zzbfq.zzabe().zza((zzbhf) new zzcef(this.zzgaa, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzbfq.loadData(str, "text/html", "UTF-8");
        } else {
            zzbfq.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
