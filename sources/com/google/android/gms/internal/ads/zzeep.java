package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.3.0 */
final class zzeep extends WeakReference<Throwable> {
    private final int zziaj;

    public zzeep(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.zziaj = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.zziaj;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzeep zzeep = (zzeep) obj;
        if (this.zziaj == zzeep.zziaj && get() == zzeep.get()) {
            return true;
        }
        return false;
    }
}
