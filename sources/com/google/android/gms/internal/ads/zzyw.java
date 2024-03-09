package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzyw implements InitializationStatus {
    private final zzyv zzcjw;

    zzyw(zzyv zzyv) {
        this.zzcjw = zzyv;
    }

    public final Map getAdapterStatusMap() {
        zzyv zzyv = this.zzcjw;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new zzyy(zzyv));
        return hashMap;
    }
}
