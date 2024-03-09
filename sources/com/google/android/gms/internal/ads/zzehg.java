package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzehg<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzehe> zzihe;

    private zzehg(Map.Entry<K, zzehe> entry) {
        this.zzihe = entry;
    }

    public final K getKey() {
        return this.zzihe.getKey();
    }

    public final Object getValue() {
        if (this.zzihe.getValue() == null) {
            return null;
        }
        return zzehe.zzbgl();
    }

    public final zzehe zzbgm() {
        return this.zzihe.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzehz) {
            return this.zzihe.getValue().zzn((zzehz) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
