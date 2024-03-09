package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzelk<K, V, V2> {
    final LinkedHashMap<K, zzelx<V>> zziqz;

    zzelk(int i) {
        this.zziqz = zzelj.zzia(i);
    }

    /* access modifiers changed from: package-private */
    public zzelk<K, V, V2> zza(K k, zzelx<V> zzelx) {
        this.zziqz.put(zzelu.zza(k, "key"), zzelu.zza(zzelx, "provider"));
        return this;
    }
}
