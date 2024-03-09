package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzany<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzamy {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzdle;
    private final NETWORK_EXTRAS zzdlf;

    public zzany(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzdle = mediationAdapter;
        this.zzdlf = network_extras;
    }

    public final IObjectWrapper zzto() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvj, zzvc zzvc, String str, zzana zzana) throws RemoteException {
        zza(iObjectWrapper, zzvj, zzvc, str, (String) null, zzana);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvj, zzvc zzvc, String str, String str2, zzana zzana) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdle;
            zzanx zzanx = new zzanx(zzana);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            MediationServerParameters zzdp = zzdp(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].getWidth() == zzvj.width && adSizeArr[i].getHeight() == zzvj.height) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(zzb.zza(zzvj.width, zzvj.height, zzvj.zzacx));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzanx, activity, zzdp, adSize, zzaoj.zza(zzvc, zzc(zzvc)), this.zzdlf);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    public final Bundle zztr() {
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzana zzana) throws RemoteException {
        zza(iObjectWrapper, zzvc, str, (String) null, zzana);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, String str2, zzana zzana) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdle).requestInterstitialAd(new zzanx(zzana), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzdp(str), zzaoj.zza(zzvc, zzc(zzvc)), this.zzdlf);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final zzyg getVideoController() {
        return null;
    }

    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzef("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdle).showInterstitial();
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, String str2, zzana zzana, zzadm zzadm, List<String> list) {
    }

    public final Bundle zzts() {
        return new Bundle();
    }

    public final zzand zztp() {
        return null;
    }

    public final zzani zztq() {
        return null;
    }

    public final zzanj zztv() {
        return null;
    }

    public final zzaes zztu() {
        return null;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzaua zzaua, String str2) throws RemoteException {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaua zzaua, List<String> list) {
    }

    public final boolean zztt() {
        return false;
    }

    public final void zza(zzvc zzvc, String str, String str2) {
    }

    public final void zza(zzvc zzvc, String str) {
    }

    public final void showVideo() {
    }

    public final boolean isInitialized() {
        return true;
    }

    public final void zzb(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzana zzana) throws RemoteException {
    }

    public final void zzc(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzana zzana) throws RemoteException {
    }

    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void destroy() throws RemoteException {
        try {
            this.zzdle.destroy();
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaih zzaih, List<zzaip> list) throws RemoteException {
    }

    public final zzapo zztw() {
        return null;
    }

    public final zzapo zztx() {
        return null;
    }

    private final SERVER_PARAMETERS zzdp(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.zzdle.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.load(hashMap);
        return server_parameters;
    }

    private static boolean zzc(zzvc zzvc) {
        if (zzvc.zzcgy) {
            return true;
        }
        zzwe.zzpq();
        return zzbat.zzym();
    }
}
