package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzans implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzana zzdkw;
    private final /* synthetic */ zzanq zzdkx;

    zzans(zzanq zzanq, zzana zzana) {
        this.zzdkx = zzanq;
        this.zzdkw = zzana;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            MediationRewardedAd unused = this.zzdkx.zzdkr = mediationRewardedAd;
            this.zzdkw.onAdLoaded();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
        return new zzave(this.zzdkw);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzdkx.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            zzbbd.zzef(sb.toString());
            this.zzdkw.zzc(0, str);
            this.zzdkw.onAdFailedToLoad(0);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
