package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdip {
    public static <T> void zza(AtomicReference<T> atomicReference, zzdio<T> zzdio) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                zzdio.zzq(t);
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
