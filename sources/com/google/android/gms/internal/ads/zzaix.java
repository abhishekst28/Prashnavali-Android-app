package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public abstract class zzaix extends zzgt implements zzaiy {
    public zzaix() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzsy();
        } else if (i != 2) {
            return false;
        } else {
            zzdc(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
