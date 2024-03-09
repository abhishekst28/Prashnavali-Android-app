package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.ads.zzbbd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    private View zzne;
    private CustomEventBanner zznf;
    private CustomEventInterstitial zzng;

    private static <T> T zzam(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzbbd.zzfe(sb.toString());
            return null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zznc;
        private final MediationBannerListener zznd;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zznc = customEventAdapter;
            this.zznd = mediationBannerListener;
        }

        public final void onReceivedAd(View view) {
            zzbbd.zzef("Custom event adapter called onReceivedAd.");
            this.zznc.zza(view);
            this.zznd.onReceivedAd(this.zznc);
        }

        public final void onFailedToReceiveAd() {
            zzbbd.zzef("Custom event adapter called onFailedToReceiveAd.");
            this.zznd.onFailedToReceiveAd(this.zznc, AdRequest.ErrorCode.NO_FILL);
        }

        public final void onClick() {
            zzbbd.zzef("Custom event adapter called onFailedToReceiveAd.");
            this.zznd.onClick(this.zznc);
        }

        public final void onPresentScreen() {
            zzbbd.zzef("Custom event adapter called onFailedToReceiveAd.");
            this.zznd.onPresentScreen(this.zznc);
        }

        public final void onDismissScreen() {
            zzbbd.zzef("Custom event adapter called onFailedToReceiveAd.");
            this.zznd.onDismissScreen(this.zznc);
        }

        public final void onLeaveApplication() {
            zzbbd.zzef("Custom event adapter called onFailedToReceiveAd.");
            this.zznd.onLeaveApplication(this.zznc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    class zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zznc;
        private final MediationInterstitialListener zznh;

        public zzb(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zznc = customEventAdapter;
            this.zznh = mediationInterstitialListener;
        }

        public final void onReceivedAd() {
            zzbbd.zzef("Custom event adapter called onReceivedAd.");
            this.zznh.onReceivedAd(CustomEventAdapter.this);
        }

        public final void onFailedToReceiveAd() {
            zzbbd.zzef("Custom event adapter called onFailedToReceiveAd.");
            this.zznh.onFailedToReceiveAd(this.zznc, AdRequest.ErrorCode.NO_FILL);
        }

        public final void onPresentScreen() {
            zzbbd.zzef("Custom event adapter called onPresentScreen.");
            this.zznh.onPresentScreen(this.zznc);
        }

        public final void onDismissScreen() {
            zzbbd.zzef("Custom event adapter called onDismissScreen.");
            this.zznh.onDismissScreen(this.zznc);
        }

        public final void onLeaveApplication() {
            zzbbd.zzef("Custom event adapter called onLeaveApplication.");
            this.zznh.onLeaveApplication(this.zznc);
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.zznf;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzng;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.zzne;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        CustomEventBanner customEventBanner = (CustomEventBanner) zzam(customEventServerParameters.className);
        this.zznf = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        this.zznf.requestBannerAd(new zza(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzam(customEventServerParameters.className);
        this.zzng = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        this.zzng.requestInterstitialAd(new zzb(this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
    }

    public final void showInterstitial() {
        this.zzng.showInterstitial();
    }

    /* access modifiers changed from: private */
    public final void zza(View view) {
        this.zzne = view;
    }
}
