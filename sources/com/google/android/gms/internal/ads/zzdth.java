package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public abstract class zzdth<E> {
    zzdth() {
    }

    public abstract zzdth<E> zzab(E e);

    public zzdth<E> zzg(Iterable<? extends E> iterable) {
        for (Object zzab : iterable) {
            zzab(zzab);
        }
        return this;
    }

    public zzdth<E> zza(Iterator<? extends E> it) {
        while (it.hasNext()) {
            zzab(it.next());
        }
        return this;
    }
}
