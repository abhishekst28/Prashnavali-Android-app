package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzeld implements Iterator<E> {
    private int pos = 0;
    private final /* synthetic */ zzele zziqn;

    zzeld(zzele zzele) {
        this.zziqn = zzele;
    }

    public final boolean hasNext() {
        return this.pos < this.zziqn.zziqo.size() || this.zziqn.zziqp.hasNext();
    }

    public final E next() {
        while (this.pos >= this.zziqn.zziqo.size()) {
            this.zziqn.zziqo.add(this.zziqn.zziqp.next());
        }
        List<E> list = this.zziqn.zziqo;
        int i = this.pos;
        this.pos = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
