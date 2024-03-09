package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzdrl extends zzgu implements zzdrm {
    zzdrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzdrk zza(zzdri zzdri) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzdri);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzdrk zzdrk = (zzdrk) zzgw.zza(transactAndReadException, zzdrk.CREATOR);
        transactAndReadException.recycle();
        return zzdrk;
    }

    public final void zza(zzdrd zzdrd) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzdrd);
        zza(2, obtainAndWriteInterfaceToken);
    }

    public final zzdru zza(zzdrs zzdrs) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzdrs);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        zzdru zzdru = (zzdru) zzgw.zza(transactAndReadException, zzdru.CREATOR);
        transactAndReadException.recycle();
        return zzdru;
    }
}
