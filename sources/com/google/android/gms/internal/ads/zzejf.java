package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzejf implements Comparable<zzejf>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzeja zzijy;
    private final K zzikc;

    zzejf(zzeja zzeja, Map.Entry<K, V> entry) {
        this(zzeja, (Comparable) entry.getKey(), entry.getValue());
    }

    zzejf(zzeja zzeja, K k, V v) {
        this.zzijy = zzeja;
        this.zzikc = k;
        this.value = v;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        this.zzijy.zzbht();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!equals(this.zzikc, entry.getKey()) || !equals(this.value, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        K k = this.zzikc;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.value;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzikc);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.zzikc;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzejf) obj).getKey());
    }
}
