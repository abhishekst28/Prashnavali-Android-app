package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcca implements zzahf<Object> {
    private WeakReference<zzcbv> zzfwm;

    private zzcca(zzcbv zzcbv) {
        this.zzfwm = new WeakReference<>(zzcbv);
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzcbv zzcbv = (zzcbv) this.zzfwm.get();
        if (zzcbv != null) {
            zzcbv.zzfvu.onAdImpression();
        }
    }
}
