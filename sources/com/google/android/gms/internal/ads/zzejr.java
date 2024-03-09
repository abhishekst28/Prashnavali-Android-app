package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzejr implements ListIterator<String> {
    private final /* synthetic */ int zzhoy;
    private ListIterator<String> zziki = this.zzikj.zzikk.listIterator(this.zzhoy);
    private final /* synthetic */ zzejs zzikj;

    zzejr(zzejs zzejs, int i) {
        this.zzikj = zzejs;
        this.zzhoy = i;
    }

    public final boolean hasNext() {
        return this.zziki.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zziki.hasPrevious();
    }

    public final int nextIndex() {
        return this.zziki.nextIndex();
    }

    public final int previousIndex() {
        return this.zziki.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return this.zziki.previous();
    }

    public final /* synthetic */ Object next() {
        return this.zziki.next();
    }
}
