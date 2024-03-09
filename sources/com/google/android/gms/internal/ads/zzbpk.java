package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbpk<AdT> implements zzelo<zzbph<AdT>> {
    private final zzelx<Map<String, zzcre<AdT>>> zzfpz;

    private zzbpk(zzelx<Map<String, zzcre<AdT>>> zzelx) {
        this.zzfpz = zzelx;
    }

    public static <AdT> zzbpk<AdT> zzd(zzelx<Map<String, zzcre<AdT>>> zzelx) {
        return new zzbpk<>(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbph(this.zzfpz.get());
    }
}
