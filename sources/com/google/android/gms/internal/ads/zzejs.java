package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzejs extends AbstractList<String> implements zzehk, RandomAccess {
    /* access modifiers changed from: private */
    public final zzehk zzikk;

    public zzejs(zzehk zzehk) {
        this.zzikk = zzehk;
    }

    public final Object zzhe(int i) {
        return this.zzikk.zzhe(i);
    }

    public final int size() {
        return this.zzikk.size();
    }

    public final void zzaj(zzeff zzeff) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzejr(this, i);
    }

    public final Iterator<String> iterator() {
        return new zzeju(this);
    }

    public final List<?> zzbgn() {
        return this.zzikk.zzbgn();
    }

    public final zzehk zzbgo() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zzikk.get(i);
    }
}
