package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzapy {
    private final zzbfq zzdgc;
    private final boolean zzdmv;
    private final String zzdmw;

    public zzapy(zzbfq zzbfq, Map<String, String> map) {
        this.zzdgc = zzbfq;
        this.zzdmw = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzdmv = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.zzdmv = true;
        }
    }

    public final void execute() {
        int i;
        if (this.zzdgc == null) {
            zzaxy.zzfe("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.zzdmw)) {
            zzp.zzkr();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.zzdmw)) {
            zzp.zzkr();
            i = 6;
        } else if (this.zzdmv) {
            i = -1;
        } else {
            i = zzp.zzkr().zzxs();
        }
        this.zzdgc.setRequestedOrientation(i);
    }
}
