package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaiq implements InitializationStatus {
    private final Map<String, AdapterStatus> zzdfj;

    public zzaiq(Map<String, AdapterStatus> map) {
        this.zzdfj = map;
    }

    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.zzdfj;
    }
}
