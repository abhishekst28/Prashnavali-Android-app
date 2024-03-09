package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzavd extends zzaus {
    private final RewardedAdLoadCallback zzdvk;

    public zzavd(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzdvk = rewardedAdLoadCallback;
    }

    public final void onRewardedAdLoaded() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdvk;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }

    public final void onRewardedAdFailedToLoad(int i) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdvk;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i);
        }
    }

    public final void zze(zzuw zzuw) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdvk;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(zzuw.zzpg());
        }
    }
}
