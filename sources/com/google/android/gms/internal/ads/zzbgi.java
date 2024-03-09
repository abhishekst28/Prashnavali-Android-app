package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbgi implements zzahf<zzbfq> {
    private final /* synthetic */ zzbgg zzeox;

    zzbgi(zzbgg zzbgg) {
        this.zzeox = zzbgg;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zzeox) {
                        if (this.zzeox.zzeon != parseInt) {
                            int unused = this.zzeox.zzeon = parseInt;
                            this.zzeox.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzaxy.zzd("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
