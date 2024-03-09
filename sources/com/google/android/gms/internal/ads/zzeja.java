package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
class zzeja<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzicu;
    private final int zzijs;
    /* access modifiers changed from: private */
    public List<zzejf> zzijt;
    /* access modifiers changed from: private */
    public Map<K, V> zziju;
    private volatile zzejh zzijv;
    /* access modifiers changed from: private */
    public Map<K, V> zzijw;
    private volatile zzejb zzijx;

    static <FieldDescriptorType extends zzegk<FieldDescriptorType>> zzeja<FieldDescriptorType, Object> zzho(int i) {
        return new zzeiz(i);
    }

    private zzeja(int i) {
        this.zzijs = i;
        this.zzijt = Collections.emptyList();
        this.zziju = Collections.emptyMap();
        this.zzijw = Collections.emptyMap();
    }

    public void zzbdg() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzicu) {
            if (this.zziju.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zziju);
            }
            this.zziju = map;
            if (this.zzijw.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzijw);
            }
            this.zzijw = map2;
            this.zzicu = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzicu;
    }

    public final int zzbhq() {
        return this.zzijt.size();
    }

    public final Map.Entry<K, V> zzhp(int i) {
        return this.zzijt.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzbhr() {
        if (this.zziju.isEmpty()) {
            return zzeje.zzbhw();
        }
        return this.zziju.entrySet();
    }

    public int size() {
        return this.zzijt.size() + this.zziju.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zziju.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return this.zzijt.get(zza).getValue();
        }
        return this.zziju.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzbht();
        int zza = zza(k);
        if (zza >= 0) {
            return this.zzijt.get(zza).setValue(v);
        }
        zzbht();
        if (this.zzijt.isEmpty() && !(this.zzijt instanceof ArrayList)) {
            this.zzijt = new ArrayList(this.zzijs);
        }
        int i = -(zza + 1);
        if (i >= this.zzijs) {
            return zzbhu().put(k, v);
        }
        int size = this.zzijt.size();
        int i2 = this.zzijs;
        if (size == i2) {
            zzejf remove = this.zzijt.remove(i2 - 1);
            zzbhu().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzijt.add(i, new zzejf(this, k, v));
        return null;
    }

    public void clear() {
        zzbht();
        if (!this.zzijt.isEmpty()) {
            this.zzijt.clear();
        }
        if (!this.zziju.isEmpty()) {
            this.zziju.clear();
        }
    }

    public V remove(Object obj) {
        zzbht();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzhq(zza);
        }
        if (this.zziju.isEmpty()) {
            return null;
        }
        return this.zziju.remove(comparable);
    }

    /* access modifiers changed from: private */
    public final V zzhq(int i) {
        zzbht();
        V value = this.zzijt.remove(i).getValue();
        if (!this.zziju.isEmpty()) {
            Iterator it = zzbhu().entrySet().iterator();
            this.zzijt.add(new zzejf(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        int size = this.zzijt.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzijt.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzijt.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzijv == null) {
            this.zzijv = new zzejh(this, (zzeiz) null);
        }
        return this.zzijv;
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzbhs() {
        if (this.zzijx == null) {
            this.zzijx = new zzejb(this, (zzeiz) null);
        }
        return this.zzijx;
    }

    /* access modifiers changed from: private */
    public final void zzbht() {
        if (this.zzicu) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzbhu() {
        zzbht();
        if (this.zziju.isEmpty() && !(this.zziju instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zziju = treeMap;
            this.zzijw = treeMap.descendingMap();
        }
        return (SortedMap) this.zziju;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeja)) {
            return super.equals(obj);
        }
        zzeja zzeja = (zzeja) obj;
        int size = size();
        if (size != zzeja.size()) {
            return false;
        }
        int zzbhq = zzbhq();
        if (zzbhq != zzeja.zzbhq()) {
            return entrySet().equals(zzeja.entrySet());
        }
        for (int i = 0; i < zzbhq; i++) {
            if (!zzhp(i).equals(zzeja.zzhp(i))) {
                return false;
            }
        }
        if (zzbhq != size) {
            return this.zziju.equals(zzeja.zziju);
        }
        return true;
    }

    public int hashCode() {
        int zzbhq = zzbhq();
        int i = 0;
        for (int i2 = 0; i2 < zzbhq; i2++) {
            i += this.zzijt.get(i2).hashCode();
        }
        if (this.zziju.size() > 0) {
            return i + this.zziju.hashCode();
        }
        return i;
    }

    /* synthetic */ zzeja(int i, zzeiz zzeiz) {
        this(i);
    }
}
