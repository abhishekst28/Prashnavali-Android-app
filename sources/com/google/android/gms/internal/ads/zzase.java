package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzase extends zzgu implements zzasc {
    zzase(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final zzary zza(zzarw zzarw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzarw);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzary zzary = (zzary) zzgw.zza(transactAndReadException, zzary.CREATOR);
        transactAndReadException.recycle();
        return zzary;
    }

    public final void zza(zzarw zzarw, zzash zzash) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzarw);
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) zzash);
        zza(2, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzasp zzasp, zzasj zzasj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzasp);
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) zzasj);
        zza(4, obtainAndWriteInterfaceToken);
    }

    public final void zzb(zzasp zzasp, zzasj zzasj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzasp);
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) zzasj);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzasp zzasp, zzasj zzasj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzasp);
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) zzasj);
        zza(6, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, zzasj zzasj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) zzasj);
        zza(7, obtainAndWriteInterfaceToken);
    }
}
