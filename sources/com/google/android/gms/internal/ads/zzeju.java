package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeju implements Iterator<String> {
    private final /* synthetic */ zzejs zzikj;
    private Iterator<String> zzilf = this.zzikj.zzikk.iterator();

    zzeju(zzejs zzejs) {
        this.zzikj = zzejs;
    }

    public final boolean hasNext() {
        return this.zzilf.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return this.zzilf.next();
    }
}
