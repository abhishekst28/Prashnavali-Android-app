package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzzi extends zzwp {
    final /* synthetic */ zzzg zzckk;

    private zzzi(zzzg zzzg) {
        this.zzckk = zzzg;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public final String zzkf() throws RemoteException {
        return null;
    }

    public final void zzb(zzvc zzvc) throws RemoteException {
        zza(zzvc, 1);
    }

    public final void zza(zzvc zzvc, int i) throws RemoteException {
        zzbbd.zzfc("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbat.zzaah.post(new zzzh(this));
    }
}
