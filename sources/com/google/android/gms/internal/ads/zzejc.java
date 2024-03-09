package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzejc implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzeja zzijy;
    private Iterator<Map.Entry<K, V>> zzijz;

    private zzejc(zzeja zzeja) {
        this.zzijy = zzeja;
        this.pos = this.zzijy.zzijt.size();
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzijy.zzijt.size()) || zzbhv().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzbhv() {
        if (this.zzijz == null) {
            this.zzijz = this.zzijy.zzijw.entrySet().iterator();
        }
        return this.zzijz;
    }

    public final /* synthetic */ Object next() {
        if (zzbhv().hasNext()) {
            return (Map.Entry) zzbhv().next();
        }
        List zzb = this.zzijy.zzijt;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    /* synthetic */ zzejc(zzeja zzeja, zzeiz zzeiz) {
        this(zzeja);
    }
}
