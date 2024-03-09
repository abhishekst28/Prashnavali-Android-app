package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzauy extends zzaup {
    private final RewardedAdCallback zzdvi;

    public zzauy(RewardedAdCallback rewardedAdCallback) {
        this.zzdvi = rewardedAdCallback;
    }

    public final void onRewardedAdOpened() {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    public final void onRewardedAdClosed() {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    public final void zza(zzaug zzaug) {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzauz(zzaug));
        }
    }

    public final void onRewardedAdFailedToShow(int i) {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }

    public final void zzd(zzuw zzuw) {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(zzuw.zzpf());
        }
    }
}
