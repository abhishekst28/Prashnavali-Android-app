package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
class zzejh extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzeja zzijy;

    private zzejh(zzeja zzeja) {
        this.zzijy = zzeja;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzeji(this.zzijy, (zzeiz) null);
    }

    public int size() {
        return this.zzijy.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzijy.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzijy.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzijy.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzijy.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzejh(zzeja zzeja, zzeiz zzeiz) {
        this(zzeja);
    }
}
