package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzzq extends zzauk {
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zza(zzvc zzvc, zzaut zzaut) throws RemoteException {
        zza(zzaut);
    }

    public final void zzb(zzvc zzvc, zzaut zzaut) throws RemoteException {
        zza(zzaut);
    }

    public final void zza(zzaum zzaum) throws RemoteException {
    }

    public final void zza(zzauu zzauu) throws RemoteException {
    }

    public final void zza(zzxz zzxz) throws RemoteException {
    }

    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    public final void zza(zzavc zzavc) {
    }

    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return "";
    }

    public final void zza(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final zzaug zzqw() {
        return null;
    }

    public final zzyf zzkg() {
        return null;
    }

    public final void zza(zzya zzya) {
    }

    private static void zza(zzaut zzaut) {
        zzbbd.zzfc("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbat.zzaah.post(new zzzp(zzaut));
    }
}
