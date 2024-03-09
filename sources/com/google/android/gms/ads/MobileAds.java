package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static final class Settings {
        private final zzyz zzadh = new zzyz();

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }
    }

    @Deprecated
    public static void initialize(Context context, String str) {
        initialize(context, str, (Settings) null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzyv.zzqt().zza(context, str, (OnInitializationCompleteListener) null);
    }

    public static void initialize(Context context) {
        initialize(context, (String) null, (Settings) null);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzyv.zzqt().zza(context, (String) null, onInitializationCompleteListener);
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzyv.zzqt().getRewardedVideoAdInstance(context);
    }

    public static void setAppVolume(float f) {
        zzyv.zzqt().setAppVolume(f);
    }

    public static void setAppMuted(boolean z) {
        zzyv.zzqt().setAppMuted(z);
    }

    public static void openDebugMenu(Context context, String str) {
        zzyv.zzqt().openDebugMenu(context, str);
    }

    public static String getVersionString() {
        return zzyv.zzqt().getVersionString();
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzyv.zzqt().registerRtbAdapter(cls);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzyv.zzqt().getInitializationStatus();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzyv.zzqt().getRequestConfiguration();
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzyv.zzqt().setRequestConfiguration(requestConfiguration);
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzyv.zzqt().disableMediationAdapterInitialization(context);
    }
}
