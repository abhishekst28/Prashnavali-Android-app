package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdts<K, V> extends zzdtn<Map.Entry<K, V>> {
    /* access modifiers changed from: private */
    public final transient int size;
    private final transient zzdtk<K, V> zzhno;
    /* access modifiers changed from: private */
    public final transient Object[] zzhnp;
    private final transient int zzhnq = 0;

    zzdts(zzdtk<K, V> zzdtk, Object[] objArr, int i, int i2) {
        this.zzhno = zzdtk;
        this.zzhnp = objArr;
        this.size = i2;
    }

    public final zzdub<Map.Entry<K, V>> zzawn() {
        return (zzdub) zzawr().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzawr().zza(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzdtg<Map.Entry<K, V>> zzawz() {
        return new zzdtv(this);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.zzhno.get(key))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaws() {
        return true;
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
