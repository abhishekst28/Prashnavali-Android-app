package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzele<E> extends AbstractList<E> {
    private static final zzelg zzdc = zzelg.zzn(zzele.class);
    List<E> zziqo;
    Iterator<E> zziqp;

    public zzele(List<E> list, Iterator<E> it) {
        this.zziqo = list;
        this.zziqp = it;
    }

    public E get(int i) {
        if (this.zziqo.size() > i) {
            return this.zziqo.get(i);
        }
        if (this.zziqp.hasNext()) {
            this.zziqo.add(this.zziqp.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new zzeld(this);
    }

    public int size() {
        zzdc.zzik("potentially expensive size() call");
        zzdc.zzik("blowup running");
        while (this.zziqp.hasNext()) {
            this.zziqo.add(this.zziqp.next());
        }
        return this.zziqo.size();
    }
}
