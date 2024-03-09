package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public abstract class zzdtf<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzhna = new Object[0];

    zzdtf() {
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: zzawn */
    public abstract zzdub<E> iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean zzaws();

    public final Object[] toArray() {
        return toArray(zzhna);
    }

    public final <T> T[] toArray(T[] tArr) {
        zzdsv.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzawo = zzawo();
            if (zzawo != null) {
                return Arrays.copyOfRange(zzawo, zzawp(), zzawq(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] zzawo() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int zzawp() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zzawq() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public zzdtg<E> zzawr() {
        return isEmpty() ? zzdtg.zzawt() : zzdtg.zzc(toArray());
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        zzdub zzdub = (zzdub) iterator();
        while (zzdub.hasNext()) {
            objArr[i] = zzdub.next();
            i++;
        }
        return i;
    }
}
