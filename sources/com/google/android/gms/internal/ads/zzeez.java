package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
abstract class zzeez<E> extends AbstractList<E> implements zzeha<E> {
    private boolean zzias = true;

    zzeez() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        zzbdh();
        return super.add(e);
    }

    public void add(int i, E e) {
        zzbdh();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzbdh();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzbdh();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzbdh();
        super.clear();
    }

    public boolean zzbdf() {
        return this.zzias;
    }

    public final void zzbdg() {
        this.zzias = false;
    }

    public E remove(int i) {
        zzbdh();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        zzbdh();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        zzbdh();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzbdh();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzbdh();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void zzbdh() {
        if (!this.zzias) {
            throw new UnsupportedOperationException();
        }
    }
}
