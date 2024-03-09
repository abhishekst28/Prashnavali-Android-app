package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcgh implements zzqu {
    private final zzbfq zzepi;

    zzcgh(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    public final void zza(zzqr zzqr) {
        zzbfq zzbfq = this.zzepi;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", zzqr.zzbrk ? "1" : "0");
        zzbfq.zza("onAdVisibilityChanged", hashMap);
    }
}
