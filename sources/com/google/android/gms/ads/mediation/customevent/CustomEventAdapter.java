package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.zzbbd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner zzerb;
    private CustomEventInterstitial zzerc;
    private CustomEventNative zzerd;
    private View zzne;

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
    class zza implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzere;
        private final MediationInterstitialListener zzerf;

        public zza(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzere = customEventAdapter;
            this.zzerf = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            zzbbd.zzef("Custom event adapter called onReceivedAd.");
            this.zzerf.onAdLoaded(CustomEventAdapter.this);
        }

        public final void onAdFailedToLoad(int i) {
            zzbbd.zzef("Custom event adapter called onFailedToReceiveAd.");
            this.zzerf.onAdFailedToLoad(this.zzere, i);
        }

        public final void onAdClicked() {
            zzbbd.zzef("Custom event adapter called onAdClicked.");
            this.zzerf.onAdClicked(this.zzere);
        }

        public final void onAdOpened() {
            zzbbd.zzef("Custom event adapter called onAdOpened.");
            this.zzerf.onAdOpened(this.zzere);
        }

        public final void onAdClosed() {
            zzbbd.zzef("Custom event adapter called onAdClosed.");
            this.zzerf.onAdClosed(this.zzere);
        }

        public final void onAdLeftApplication() {
            zzbbd.zzef("Custom event adapter called onAdLeftApplication.");
            this.zzerf.onAdLeftApplication(this.zzere);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zzb implements CustomEventBannerListener {
        private final CustomEventAdapter zzere;
        private final MediationBannerListener zzerh;

        public zzb(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzere = customEventAdapter;
            this.zzerh = mediationBannerListener;
        }

        public final void onAdLoaded(View view) {
            zzbbd.zzef("Custom event adapter called onAdLoaded.");
            this.zzere.zza(view);
            this.zzerh.onAdLoaded(this.zzere);
        }

        public final void onAdFailedToLoad(int i) {
            zzbbd.zzef("Custom event adapter called onAdFailedToLoad.");
            this.zzerh.onAdFailedToLoad(this.zzere, i);
        }

        public final void onAdClicked() {
            zzbbd.zzef("Custom event adapter called onAdClicked.");
            this.zzerh.onAdClicked(this.zzere);
        }

        public final void onAdOpened() {
            zzbbd.zzef("Custom event adapter called onAdOpened.");
            this.zzerh.onAdOpened(this.zzere);
        }

        public final void onAdClosed() {
            zzbbd.zzef("Custom event adapter called onAdClosed.");
            this.zzerh.onAdClosed(this.zzere);
        }

        public final void onAdLeftApplication() {
            zzbbd.zzef("Custom event adapter called onAdLeftApplication.");
            this.zzerh.onAdLeftApplication(this.zzere);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static class zzc implements CustomEventNativeListener {
        private final CustomEventAdapter zzere;
        private final MediationNativeListener zzeri;

        public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.zzere = customEventAdapter;
            this.zzeri = mediationNativeListener;
        }

        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzbbd.zzef("Custom event adapter called onAdLoaded.");
            this.zzeri.onAdLoaded((MediationNativeAdapter) this.zzere, nativeAdMapper);
        }

        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            zzbbd.zzef("Custom event adapter called onAdLoaded.");
            this.zzeri.onAdLoaded((MediationNativeAdapter) this.zzere, unifiedNativeAdMapper);
        }

        public final void onAdFailedToLoad(int i) {
            zzbbd.zzef("Custom event adapter called onAdFailedToLoad.");
            this.zzeri.onAdFailedToLoad(this.zzere, i);
        }

        public final void onAdOpened() {
            zzbbd.zzef("Custom event adapter called onAdOpened.");
            this.zzeri.onAdOpened(this.zzere);
        }

        public final void onAdClicked() {
            zzbbd.zzef("Custom event adapter called onAdClicked.");
            this.zzeri.onAdClicked(this.zzere);
        }

        public final void onAdClosed() {
            zzbbd.zzef("Custom event adapter called onAdClosed.");
            this.zzeri.onAdClosed(this.zzere);
        }

        public final void onAdLeftApplication() {
            zzbbd.zzef("Custom event adapter called onAdLeftApplication.");
            this.zzeri.onAdLeftApplication(this.zzere);
        }

        public final void onAdImpression() {
            zzbbd.zzef("Custom event adapter called onAdImpression.");
            this.zzeri.onAdImpression(this.zzere);
        }
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.zzerb;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzerc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.zzerd;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.zzerb;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.zzerc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.zzerd;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.zzerb;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.zzerc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.zzerd;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public final View getBannerView() {
        return this.zzne;
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) zzam(bundle.getString("class_name"));
        this.zzerb = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.zzerb.requestBannerAd(context, new zzb(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle3);
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzam(bundle.getString("class_name"));
        this.zzerc = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.zzerc.requestInterstitialAd(context, new zza(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle3);
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) zzam(bundle.getString("class_name"));
        this.zzerd = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.zzerd.requestNativeAd(context, new zzc(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle3);
    }

    public final void showInterstitial() {
        this.zzerc.showInterstitial();
    }

    /* access modifiers changed from: private */
    public final void zza(View view) {
        this.zzne = view;
    }
}
