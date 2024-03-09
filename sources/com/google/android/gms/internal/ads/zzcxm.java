package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxm implements zzbsu, zzbsz, zzbtm, zzbuj, zzut {
    private zzwl zzgqn;

    public final synchronized void zzc(zzwl zzwl) {
        this.zzgqn = zzwl;
    }

    public final synchronized zzwl zzaqc() {
        return this.zzgqn;
    }

    public final synchronized void onAdClosed() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdClosed();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdClosed.", e);
            }
        }
    }

    public final synchronized void zzg(zzuw zzuw) {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdFailedToLoad(zzuw.errorCode);
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdFailedToLoad.", e);
            }
            try {
                this.zzgqn.zzb(zzuw);
                return;
            } catch (RemoteException e2) {
                zzaxy.zzd("Remote Exception at onAdFailedToLoadWithAdError.", e2);
                return;
            }
        }
    }

    public final synchronized void onAdLeftApplication() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdLeftApplication();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    public final void onRewardedVideoStarted() {
    }

    public final void zzb(zzatj zzatj, String str, String str2) {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final synchronized void onAdLoaded() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdLoaded();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    public final synchronized void onAdOpened() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdOpened();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdOpened.", e);
            }
        }
    }

    public final synchronized void onAdClicked() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdClicked();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void onAdImpression() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdImpression();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdImpression.", e);
            }
        }
    }
}
