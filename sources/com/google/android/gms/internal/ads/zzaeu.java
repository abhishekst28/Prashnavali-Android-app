package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaeu extends zzgu implements zzaes {
    zzaeu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final String zzcx(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadw zzcy(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.obtainAndWriteInterfaceToken()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.transactAndReadException(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzadw
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzadw r0 = (com.google.android.gms.internal.ads.zzadw) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzady r1 = new com.google.android.gms.internal.ads.zzady
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzcy(java.lang.String):com.google.android.gms.internal.ads.zzadw");
    }

    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        ArrayList<String> createStringArrayList = transactAndReadException.createStringArrayList();
        transactAndReadException.recycle();
        return createStringArrayList;
    }

    public final String getCustomTemplateId() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    public final void performClick(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void recordImpression() throws RemoteException {
        zza(6, obtainAndWriteInterfaceToken());
    }

    public final zzyg getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
        zzyg zzk = zzyj.zzk(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzk;
    }

    public final void destroy() throws RemoteException {
        zza(8, obtainAndWriteInterfaceToken());
    }

    public final IObjectWrapper zzsl() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return asInterface;
    }

    public final boolean zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final IObjectWrapper zzsg() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return asInterface;
    }

    public final boolean zzsm() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final boolean zzsn() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zza(14, obtainAndWriteInterfaceToken);
    }

    public final void zzso() throws RemoteException {
        zza(15, obtainAndWriteInterfaceToken());
    }
}
