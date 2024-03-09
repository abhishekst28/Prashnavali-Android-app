package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzauo extends zzgu implements zzaum {
    zzauo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void onRewardedAdOpened() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }

    public final void onRewardedAdClosed() throws RemoteException {
        zza(2, obtainAndWriteInterfaceToken());
    }

    public final void zza(zzaug zzaug) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) zzaug);
        zza(3, obtainAndWriteInterfaceToken);
    }

    public final void onRewardedAdFailedToShow(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        zza(4, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzuw zzuw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (Parcelable) zzuw);
        zza(5, obtainAndWriteInterfaceToken);
    }
}
