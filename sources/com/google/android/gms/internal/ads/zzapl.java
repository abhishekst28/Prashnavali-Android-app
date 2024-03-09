package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzapl implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationRewardedAdCallback {
    private zzana zzdlu;

    zzapl(zzana zzana) {
        this.zzdlu = zzana;
    }

    public final void reportAdClicked() {
        try {
            this.zzdlu.onAdClicked();
        } catch (RemoteException e) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.zzdlu.onAdImpression();
        } catch (RemoteException e) {
        }
    }

    public final void onAdOpened() {
        try {
            this.zzdlu.onAdOpened();
        } catch (RemoteException e) {
        }
    }

    public final void onAdClosed() {
        try {
            this.zzdlu.onAdClosed();
        } catch (RemoteException e) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.zzdlu.onAdLeftApplication();
        } catch (RemoteException e) {
        }
    }

    public final void onVideoPause() {
    }

    public final void onVideoPlay() {
        try {
            this.zzdlu.onVideoPlay();
        } catch (RemoteException e) {
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            this.zzdlu.zza((zzaug) new zzavh(rewardItem));
        } catch (RemoteException e) {
        }
    }

    public final void onVideoStart() {
        try {
            this.zzdlu.zzty();
        } catch (RemoteException e) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.zzdlu.onVideoEnd();
        } catch (RemoteException e) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            String valueOf = String.valueOf(str);
            zzbbd.zzfe(valueOf.length() != 0 ? "Mediated ad failed to show: ".concat(valueOf) : new String("Mediated ad failed to show: "));
            this.zzdlu.zzdo(str);
        } catch (RemoteException e) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoUnmute() {
    }
}
