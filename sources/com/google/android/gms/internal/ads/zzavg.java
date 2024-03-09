package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzavg extends zzaup {
    private FullScreenContentCallback zzdvl;
    private OnUserEarnedRewardListener zzdvm;

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzdvl = fullScreenContentCallback;
    }

    public final void zza(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzdvm = onUserEarnedRewardListener;
    }

    public final void onRewardedAdOpened() {
        FullScreenContentCallback fullScreenContentCallback = this.zzdvl;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void onRewardedAdClosed() {
        FullScreenContentCallback fullScreenContentCallback = this.zzdvl;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void onRewardedAdFailedToShow(int i) {
    }

    public final void zzd(zzuw zzuw) {
        FullScreenContentCallback fullScreenContentCallback = this.zzdvl;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzuw.zzpf());
        }
    }

    public final void zza(zzaug zzaug) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.zzdvm;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new zzauz(zzaug));
        }
    }
}
