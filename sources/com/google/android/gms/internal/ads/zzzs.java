package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzzs extends zzatp {
    /* access modifiers changed from: private */
    public zzatt zzckq;

    public final void zza(zzatz zzatz) throws RemoteException {
        zzbbd.zzfc("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbat.zzaah.post(new zzzr(this));
    }

    public final void show() throws RemoteException {
    }

    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zza(zzatt zzatt) throws RemoteException {
        this.zzckq = zzatt;
    }

    public final void zza(zzatk zzatk) throws RemoteException {
    }

    public final void zza(zzxb zzxb) throws RemoteException {
    }

    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    public final void setUserId(String str) throws RemoteException {
    }

    public final void setCustomData(String str) throws RemoteException {
    }

    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    public final void setAppPackageName(String str) {
    }

    public final void pause() throws RemoteException {
    }

    public final void resume() throws RemoteException {
    }

    public final void destroy() throws RemoteException {
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    public final boolean zzqx() {
        return false;
    }

    public final zzyf zzkg() {
        return null;
    }
}
