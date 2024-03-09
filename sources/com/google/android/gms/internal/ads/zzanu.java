package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzanu extends zzamz {
    private final zzaua zzdkp;
    private final Adapter zzdkz;

    zzanu(Adapter adapter, zzaua zzaua) {
        this.zzdkz = adapter;
        this.zzdkp = zzaua;
    }

    public final void onAdLoaded() throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zzag(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    public final void onAdOpened() throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zzah(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    public final void onAdClosed() throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zzaj(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    public final void zza(zzaug zzaug) throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zza(ObjectWrapper.wrap(this.zzdkz), new zzaue(zzaug.getType(), zzaug.getAmount()));
        }
    }

    public final void zzty() throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zzai(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    public final void zztz() throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zzam(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    public final void onAdClicked() throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zzak(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzaua zzaua = this.zzdkp;
        if (zzaua != null) {
            zzaua.zze(ObjectWrapper.wrap(this.zzdkz), i);
        }
    }

    public final void zzc(int i, String str) throws RemoteException {
    }

    public final void zzb(zzuw zzuw) throws RemoteException {
    }

    public final void zzdd(int i) throws RemoteException {
    }

    public final void zzdo(String str) {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }

    public final void zzdn(String str) throws RemoteException {
    }

    public final void onAdLeftApplication() throws RemoteException {
    }

    public final void onVideoEnd() throws RemoteException {
    }

    public final void onVideoPause() throws RemoteException {
    }

    public final void onVideoPlay() throws RemoteException {
    }

    public final void zzb(zzaue zzaue) throws RemoteException {
    }

    public final void zza(zzanb zzanb) throws RemoteException {
    }

    public final void onAdImpression() throws RemoteException {
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    public final void zza(zzaes zzaes, String str) throws RemoteException {
    }
}
