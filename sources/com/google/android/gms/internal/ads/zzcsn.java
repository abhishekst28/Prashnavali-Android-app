package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcsn extends zzaud implements zzbuc {
    private zzaua zzgmb;
    private zzbuf zzgmc;
    private zzbzf zzgmd;

    public final synchronized void zza(zzaua zzaua) {
        this.zzgmb = zzaua;
    }

    public final synchronized void zza(zzbuf zzbuf) {
        this.zzgmc = zzbuf;
    }

    public final synchronized void zza(zzbzf zzbzf) {
        this.zzgmd = zzbzf;
    }

    public final synchronized void zzaf(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzaf(iObjectWrapper);
        }
        if (this.zzgmd != null) {
            this.zzgmd.onInitializationSucceeded();
        }
    }

    public final synchronized void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzd(iObjectWrapper, i);
        }
        if (this.zzgmd != null) {
            this.zzgmd.zzdx(i);
        }
    }

    public final synchronized void zzai(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzai(iObjectWrapper);
        }
    }

    public final synchronized void zza(IObjectWrapper iObjectWrapper, zzaue zzaue) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zza(iObjectWrapper, zzaue);
        }
    }

    public final synchronized void zzak(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzak(iObjectWrapper);
        }
    }

    public final synchronized void zzaj(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzaj(iObjectWrapper);
        }
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zze(iObjectWrapper, i);
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdFailedToLoad(i);
        }
    }

    public final synchronized void zzal(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzal(iObjectWrapper);
        }
    }

    public final synchronized void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzam(iObjectWrapper);
        }
    }

    public final synchronized void zzah(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzah(iObjectWrapper);
        }
    }

    public final synchronized void zzag(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzag(iObjectWrapper);
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdLoaded();
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzb(bundle);
        }
    }
}
