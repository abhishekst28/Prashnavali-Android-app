package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcso extends zzamz implements zzbuc {
    private zzana zzdlu;
    private zzbuf zzgmc;

    public final synchronized void zzb(zzana zzana) {
        this.zzdlu = zzana;
    }

    public final synchronized void zza(zzbuf zzbuf) {
        this.zzgmc = zzbuf;
    }

    public final synchronized void onAdClicked() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdClicked();
        }
    }

    public final synchronized void onAdClosed() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdClosed();
        }
    }

    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdFailedToLoad(i);
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdFailedToLoad(i);
        }
    }

    public final synchronized void zzc(int i, String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzc(i, str);
        }
        if (this.zzgmc != null) {
            this.zzgmc.zzf(i, str);
        }
    }

    public final synchronized void zzb(zzuw zzuw) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzb(zzuw);
        }
        if (this.zzgmc != null) {
            this.zzgmc.zzg(zzuw);
        }
    }

    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdLeftApplication();
        }
    }

    public final synchronized void onAdOpened() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdOpened();
        }
    }

    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdLoaded();
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdLoaded();
        }
    }

    public final synchronized void zza(zzanb zzanb) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zza(zzanb);
        }
    }

    public final synchronized void onAdImpression() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdImpression();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAppEvent(str, str2);
        }
    }

    public final synchronized void zza(zzaes zzaes, String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zza(zzaes, str);
        }
    }

    public final synchronized void onVideoEnd() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onVideoEnd();
        }
    }

    public final synchronized void zzdn(String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzdn(str);
        }
    }

    public final synchronized void zzty() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzty();
        }
    }

    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onVideoPlay();
        }
    }

    public final synchronized void zzb(zzaue zzaue) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzb(zzaue);
        }
    }

    public final synchronized void onVideoPause() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onVideoPause();
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzb(bundle);
        }
    }

    public final synchronized void zztz() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zztz();
        }
    }

    public final synchronized void zzdd(int i) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzdd(i);
        }
    }

    public final synchronized void zzdo(String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzdo(str);
        }
    }

    public final synchronized void zza(zzaug zzaug) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zza(zzaug);
        }
    }
}
