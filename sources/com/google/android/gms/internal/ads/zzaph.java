package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzaph implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    private final /* synthetic */ zzaop zzdlo;
    private final /* synthetic */ zzana zzdlp;
    private final /* synthetic */ zzapf zzdlq;

    zzaph(zzapf zzapf, zzaop zzaop, zzana zzana) {
        this.zzdlq = zzapf;
        this.zzdlo = zzaop;
        this.zzdlp = zzana;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        if (mediationInterstitialAd == null) {
            zzbbd.zzfe("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdlo.zzdq("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
                return null;
            }
        } else {
            try {
                MediationInterstitialAd unused = this.zzdlq.zzdlm = mediationInterstitialAd;
                this.zzdlo.zzuh();
            } catch (RemoteException e2) {
                zzbbd.zzc("", e2);
            }
            return new zzapl(this.zzdlp);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdlo.zzdq(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
