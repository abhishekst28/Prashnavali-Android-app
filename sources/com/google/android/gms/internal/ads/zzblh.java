package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzblh implements zzblg {
    private zzaya zzdza;

    public zzblh(zzaya zzaya) {
        this.zzdza = zzaya;
    }

    public final void zzl(Map<String, String> map) {
        this.zzdza.zzap(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
