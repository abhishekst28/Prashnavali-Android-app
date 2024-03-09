package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdtp extends zzdub<T> {
    private boolean zzhnk;
    private final /* synthetic */ Object zzhnl;

    zzdtp(Object obj) {
        this.zzhnl = obj;
    }

    public final boolean hasNext() {
        return !this.zzhnk;
    }

    public final T next() {
        if (!this.zzhnk) {
            this.zzhnk = true;
            return this.zzhnl;
        }
        throw new NoSuchElementException();
    }
}
