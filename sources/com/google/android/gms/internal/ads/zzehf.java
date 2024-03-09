package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzehf<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzihd;

    public zzehf(Iterator<Map.Entry<K, Object>> it) {
        this.zzihd = it;
    }

    public final boolean hasNext() {
        return this.zzihd.hasNext();
    }

    public final void remove() {
        this.zzihd.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zzihd.next();
        if (next.getValue() instanceof zzehe) {
            return new zzehg(next);
        }
        return next;
    }
}
