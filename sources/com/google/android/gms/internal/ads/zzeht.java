package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzeht<K, V> extends LinkedHashMap<K, V> {
    private static final zzeht zziht;
    private boolean zzias = true;

    private zzeht() {
    }

    private zzeht(Map<K, V> map) {
        super(map);
    }

    public static <K, V> zzeht<K, V> zzbgt() {
        return zziht;
    }

    public final void zza(zzeht<K, V> zzeht) {
        zzbgv();
        if (!zzeht.isEmpty()) {
            putAll(zzeht);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        zzbgv();
        super.clear();
    }

    public final V put(K k, V v) {
        zzbgv();
        zzegr.checkNotNull(k);
        zzegr.checkNotNull(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        zzbgv();
        for (Object next : map.keySet()) {
            zzegr.checkNotNull(next);
            zzegr.checkNotNull(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        zzbgv();
        return super.remove(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x0060
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x005c
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
            r7 = 0
            goto L_0x005d
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0036
            r7 = 0
            goto L_0x005d
        L_0x0036:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0053
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0053
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0057
        L_0x0053:
            boolean r3 = r4.equals(r3)
        L_0x0057:
            if (r3 != 0) goto L_0x005b
            r7 = 0
            goto L_0x005d
        L_0x005b:
            goto L_0x001e
        L_0x005c:
            r7 = 1
        L_0x005d:
            if (r7 == 0) goto L_0x0060
            return r0
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeht.equals(java.lang.Object):boolean");
    }

    private static int zzam(Object obj) {
        if (obj instanceof byte[]) {
            return zzegr.hashCode((byte[]) obj);
        }
        if (!(obj instanceof zzegu)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzam(entry.getValue()) ^ zzam(entry.getKey());
        }
        return i;
    }

    public final zzeht<K, V> zzbgu() {
        return isEmpty() ? new zzeht<>() : new zzeht<>(this);
    }

    public final void zzbdg() {
        this.zzias = false;
    }

    public final boolean isMutable() {
        return this.zzias;
    }

    private final void zzbgv() {
        if (!this.zzias) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        zzeht zzeht = new zzeht();
        zziht = zzeht;
        zzeht.zzias = false;
    }
}
