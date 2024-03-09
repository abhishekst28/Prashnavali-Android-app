package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzapf extends zzaoz {
    /* access modifiers changed from: private */
    public MediationRewardedAd zzdkr;
    private final RtbAdapter zzdll;
    /* access modifiers changed from: private */
    public MediationInterstitialAd zzdlm;
    private String zzdln = "";

    public zzapf(RtbAdapter rtbAdapter) {
        this.zzdll = rtbAdapter;
    }

    public final void zza(String str, String str2, zzvc zzvc, IObjectWrapper iObjectWrapper, zzaoo zzaoo, zzana zzana, zzvj zzvj) throws RemoteException {
        zzvc zzvc2 = zzvc;
        zzvj zzvj2 = zzvj;
        try {
            zzapi zzapi = new zzapi(this, zzaoo, zzana);
            RtbAdapter rtbAdapter = this.zzdll;
            Bundle zzdt = zzdt(str2);
            Bundle zzd = zzd(zzvc2);
            boolean zzc = zzc(zzvc);
            Location location = zzvc2.zznb;
            int i = zzvc2.zzadj;
            int i2 = zzvc2.zzadk;
            String zza = zza(str2, zzvc);
            AdSize zza2 = zzb.zza(zzvj2.width, zzvj2.height, zzvj2.zzacx);
            String str3 = this.zzdln;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt, zzd, zzc, location, i, i2, zza, zza2, str3);
            rtbAdapter.loadBannerAd(mediationBannerAdConfiguration, zzapi);
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void zza(String str, String str2, zzvc zzvc, IObjectWrapper iObjectWrapper, zzaop zzaop, zzana zzana) throws RemoteException {
        zzvc zzvc2 = zzvc;
        try {
            this.zzdll.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvc2), zzc(zzvc), zzvc2.zznb, zzvc2.zzadj, zzvc2.zzadk, zza(str2, zzvc), this.zzdln), new zzaph(this, zzaop, zzana));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void zza(String str, String str2, zzvc zzvc, IObjectWrapper iObjectWrapper, zzaov zzaov, zzana zzana) throws RemoteException {
        zzvc zzvc2 = zzvc;
        try {
            this.zzdll.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvc2), zzc(zzvc), zzvc2.zznb, zzvc2.zzadj, zzvc2.zzadk, zza(str2, zzvc), this.zzdln), zza(zzaov, zzana));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzb(String str, String str2, zzvc zzvc, IObjectWrapper iObjectWrapper, zzaov zzaov, zzana zzana) throws RemoteException {
        zzvc zzvc2 = zzvc;
        try {
            this.zzdll.loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvc2), zzc(zzvc), zzvc2.zznb, zzvc2.zzadj, zzvc2.zzadk, zza(str2, zzvc), this.zzdln), zza(zzaov, zzana));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void zza(String str, String str2, zzvc zzvc, IObjectWrapper iObjectWrapper, zzaou zzaou, zzana zzana) throws RemoteException {
        zzvc zzvc2 = zzvc;
        try {
            this.zzdll.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvc2), zzc(zzvc), zzvc2.zznb, zzvc2.zzadj, zzvc2.zzadk, zza(str2, zzvc), this.zzdln), new zzapk(this, zzaou, zzana));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzdlm;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            return true;
        }
    }

    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzdkr;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            return true;
        }
    }

    public final zzyg getVideoController() {
        RtbAdapter rtbAdapter = this.zzdll;
        if (!(rtbAdapter instanceof zza)) {
            return null;
        }
        try {
            return ((zza) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper r8, java.lang.String r9, android.os.Bundle r10, android.os.Bundle r11, com.google.android.gms.internal.ads.zzvj r12, com.google.android.gms.internal.ads.zzapb r13) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzapj r0 = new com.google.android.gms.internal.ads.zzapj     // Catch:{ all -> 0x007d }
            r0.<init>(r7, r13)     // Catch:{ all -> 0x007d }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r13 = r7.zzdll     // Catch:{ all -> 0x007d }
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch:{ all -> 0x007d }
            r2 = -1
            int r3 = r9.hashCode()     // Catch:{ all -> 0x007d }
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L_0x0034;
                case -1052618729: goto L_0x002a;
                case -239580146: goto L_0x0020;
                case 604727084: goto L_0x0016;
                default: goto L_0x0015;
            }     // Catch:{ all -> 0x007d }
        L_0x0015:
            goto L_0x003d
        L_0x0016:
            java.lang.String r3 = "interstitial"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x007d }
            if (r9 == 0) goto L_0x0015
            r2 = 1
            goto L_0x003d
        L_0x0020:
            java.lang.String r3 = "rewarded"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x007d }
            if (r9 == 0) goto L_0x0015
            r2 = 2
            goto L_0x003d
        L_0x002a:
            java.lang.String r3 = "native"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x007d }
            if (r9 == 0) goto L_0x0015
            r2 = 3
            goto L_0x003d
        L_0x0034:
            java.lang.String r3 = "banner"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x007d }
            if (r9 == 0) goto L_0x0015
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            if (r2 == r6) goto L_0x0053
            if (r2 == r5) goto L_0x0050
            if (r2 != r4) goto L_0x0048
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch:{ all -> 0x007d }
            goto L_0x0058
        L_0x0048:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007d }
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch:{ all -> 0x007d }
            throw r8     // Catch:{ all -> 0x007d }
        L_0x0050:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch:{ all -> 0x007d }
            goto L_0x0058
        L_0x0053:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch:{ all -> 0x007d }
            goto L_0x0058
        L_0x0056:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.BANNER     // Catch:{ all -> 0x007d }
        L_0x0058:
            r1.<init>(r9, r11)     // Catch:{ all -> 0x007d }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x007d }
            r9.<init>()     // Catch:{ all -> 0x007d }
            r9.add(r1)     // Catch:{ all -> 0x007d }
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r11 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch:{ all -> 0x007d }
            java.lang.Object r8 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r8)     // Catch:{ all -> 0x007d }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x007d }
            int r1 = r12.width     // Catch:{ all -> 0x007d }
            int r2 = r12.height     // Catch:{ all -> 0x007d }
            java.lang.String r12 = r12.zzacx     // Catch:{ all -> 0x007d }
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.zzb.zza(r1, r2, r12)     // Catch:{ all -> 0x007d }
            r11.<init>(r8, r9, r10, r12)     // Catch:{ all -> 0x007d }
            r13.collectSignals(r11, r0)     // Catch:{ all -> 0x007d }
            return
        L_0x007d:
            r8 = move-exception
            java.lang.String r9 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.zzbbd.zzc(r9, r8)
            android.os.RemoteException r8 = new android.os.RemoteException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapf.zza(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.internal.ads.zzvj, com.google.android.gms.internal.ads.zzapb):void");
    }

    public final zzapo zztw() throws RemoteException {
        return zzapo.zza(this.zzdll.getVersionInfo());
    }

    public final zzapo zztx() throws RemoteException {
        return zzapo.zza(this.zzdll.getSDKVersionInfo());
    }

    public final void zzdr(String str) {
        this.zzdln = str;
    }

    public final void zzy(IObjectWrapper iObjectWrapper) {
    }

    public final void zza(String[] strArr, Bundle[] bundleArr) {
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzaov zzaov, zzana zzana) {
        return new zzapm(this, zzaov, zzana);
    }

    private static Bundle zzdt(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbbd.zzfe(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzbbd.zzc("", e);
            throw new RemoteException();
        }
    }

    private static boolean zzc(zzvc zzvc) {
        if (zzvc.zzcgy) {
            return true;
        }
        zzwe.zzpq();
        return zzbat.zzym();
    }

    private static String zza(String str, zzvc zzvc) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException e) {
            return zzvc.zzadl;
        }
    }

    private final Bundle zzd(zzvc zzvc) {
        Bundle bundle;
        if (zzvc.zzchc == null || (bundle = zzvc.zzchc.getBundle(this.zzdll.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }
}
