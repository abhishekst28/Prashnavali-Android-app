package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbph<AdT> implements zzbpi<AdT> {
    private final Map<String, zzcre<AdT>> zzfpx;

    zzbph(Map<String, zzcre<AdT>> map) {
        this.zzfpx = map;
    }

    public final zzcre<AdT> zze(int i, String str) {
        return this.zzfpx.get(str);
    }
}
