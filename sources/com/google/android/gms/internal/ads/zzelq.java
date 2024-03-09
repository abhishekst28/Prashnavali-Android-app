package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzelq<K, V> extends zzelh<K, V, V> {
    private static final zzelx<Map<Object, Object>> zzire = zzeln.zzba(Collections.emptyMap());

    public static <K, V> zzels<K, V> zzic(int i) {
        return new zzels<>(i);
    }

    private zzelq(Map<K, zzelx<V>> map) {
        super(map);
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap zzia = zzelj.zzia(zzbjm().size());
        for (Map.Entry entry : zzbjm().entrySet()) {
            zzia.put(entry.getKey(), ((zzelx) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(zzia);
    }
}
