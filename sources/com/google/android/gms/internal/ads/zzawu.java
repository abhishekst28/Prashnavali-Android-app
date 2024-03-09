package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public interface zzawu extends IInterface {
    void zza(IObjectWrapper iObjectWrapper, zzaxa zzaxa, zzawt zzawt) throws RemoteException;

    void zza(zzarn zzarn) throws RemoteException;

    void zza(List<Uri> list, IObjectWrapper iObjectWrapper, zzarc zzarc) throws RemoteException;

    void zzan(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzao(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    void zzb(List<Uri> list, IObjectWrapper iObjectWrapper, zzarc zzarc) throws RemoteException;
}
