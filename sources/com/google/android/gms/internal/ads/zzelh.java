package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
abstract class zzelh<K, V, V2> implements zzelo<Map<K, V2>> {
    private final Map<K, zzelx<V>> zziqy;

    zzelh(Map<K, zzelx<V>> map) {
        this.zziqy = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, zzelx<V>> zzbjm() {
        return this.zziqy;
    }
}
