package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaib extends zzahy {
    private final /* synthetic */ zzbbq zzbvn;

    zzaib(zzaic zzaic, zzbbq zzbbq) {
        this.zzbvn = zzbbq;
    }

    public final void zza(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zzbvn.set(parcelFileDescriptor);
    }
}
