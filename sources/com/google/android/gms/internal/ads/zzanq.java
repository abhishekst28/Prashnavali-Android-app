package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzanq extends zzamy {
    /* access modifiers changed from: private */
    public final Object zzdkn;
    private zzanr zzdko;
    private zzaua zzdkp;
    private IObjectWrapper zzdkq;
    /* access modifiers changed from: private */
    public MediationRewardedAd zzdkr;

    public zzanq(MediationAdapter mediationAdapter) {
        this.zzdkn = mediationAdapter;
    }

    public zzanq(Adapter adapter) {
        this.zzdkn = adapter;
    }

    public final IObjectWrapper zzto() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvj, zzvc zzvc, String str, zzana zzana) throws RemoteException {
        zza(iObjectWrapper, zzvj, zzvc, str, (String) null, zzana);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvj, zzvc zzvc, String str, String str2, zzana zzana) throws RemoteException {
        Date date;
        Bundle bundle;
        AdSize adSize;
        zzvj zzvj2 = zzvj;
        zzvc zzvc2 = zzvc;
        String str3 = str;
        if (this.zzdkn instanceof MediationBannerAdapter) {
            zzbbd.zzef("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdkn;
                HashSet hashSet = zzvc2.zzcgx != null ? new HashSet(zzvc2.zzcgx) : null;
                if (zzvc2.zzcgv == -1) {
                    date = null;
                } else {
                    date = new Date(zzvc2.zzcgv);
                }
                zzann zzann = new zzann(date, zzvc2.zzcgw, hashSet, zzvc2.zznb, zzc(zzvc), zzvc2.zzadj, zzvc2.zzchh, zzvc2.zzadk, zza(str3, zzvc2));
                if (zzvc2.zzchc != null) {
                    bundle = zzvc2.zzchc.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                if (zzvj2.zzchu) {
                    adSize = zzb.zza(zzvj2.width, zzvj2.height);
                } else {
                    adSize = zzb.zza(zzvj2.width, zzvj2.height, zzvj2.zzacx);
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzanr(zzana), zza(str3, zzvc2, str2), adSize, zzann, bundle);
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle zztr() {
        Object obj = this.zzdkn;
        if (obj instanceof zzbig) {
            return ((zzbig) obj).zztr();
        }
        String canonicalName = zzbig.class.getCanonicalName();
        String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbbd.zzfe(sb.toString());
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzana zzana) throws RemoteException {
        zza(iObjectWrapper, zzvc, str, (String) null, zzana);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, String str2, zzana zzana) throws RemoteException {
        Date date;
        Bundle bundle;
        zzvc zzvc2 = zzvc;
        String str3 = str;
        if (this.zzdkn instanceof MediationInterstitialAdapter) {
            zzbbd.zzef("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzdkn;
                HashSet hashSet = zzvc2.zzcgx != null ? new HashSet(zzvc2.zzcgx) : null;
                if (zzvc2.zzcgv == -1) {
                    date = null;
                } else {
                    date = new Date(zzvc2.zzcgv);
                }
                zzann zzann = new zzann(date, zzvc2.zzcgw, hashSet, zzvc2.zznb, zzc(zzvc), zzvc2.zzadj, zzvc2.zzchh, zzvc2.zzadk, zza(str3, zzvc2));
                if (zzvc2.zzchc != null) {
                    bundle = zzvc2.zzchc.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzanr(zzana), zza(str3, zzvc2, str2), zzann, bundle);
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.zzdkn;
        if (obj instanceof zzbif) {
            return ((zzbif) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbif.class.getCanonicalName();
        String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbbd.zzfe(sb.toString());
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, String str2, zzana zzana, zzadm zzadm, List<String> list) throws RemoteException {
        Date date;
        zzvc zzvc2 = zzvc;
        String str3 = str;
        Object obj = this.zzdkn;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                Bundle bundle = null;
                HashSet hashSet = zzvc2.zzcgx != null ? new HashSet(zzvc2.zzcgx) : null;
                if (zzvc2.zzcgv == -1) {
                    date = null;
                } else {
                    date = new Date(zzvc2.zzcgv);
                }
                zzanv zzanv = new zzanv(date, zzvc2.zzcgw, hashSet, zzvc2.zznb, zzc(zzvc), zzvc2.zzadj, zzadm, list, zzvc2.zzchh, zzvc2.zzadk, zza(str3, zzvc2));
                if (zzvc2.zzchc != null) {
                    bundle = zzvc2.zzchc.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.zzdko = new zzanr(zzana);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzdko, zza(str3, zzvc2, str2), zzanv, bundle);
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle zzts() {
        return new Bundle();
    }

    public final zzand zztp() {
        NativeAdMapper zzuc = this.zzdko.zzuc();
        if (zzuc instanceof NativeAppInstallAdMapper) {
            return new zzant((NativeAppInstallAdMapper) zzuc);
        }
        return null;
    }

    public final zzanj zztv() {
        UnifiedNativeAdMapper zzud = this.zzdko.zzud();
        if (zzud != null) {
            return new zzaol(zzud);
        }
        return null;
    }

    public final zzani zztq() {
        NativeAdMapper zzuc = this.zzdko.zzuc();
        if (zzuc instanceof NativeContentAdMapper) {
            return new zzanw((NativeContentAdMapper) zzuc);
        }
        return null;
    }

    public final zzaes zztu() {
        NativeCustomTemplateAd zzue = this.zzdko.zzue();
        if (zzue instanceof zzaet) {
            return ((zzaet) zzue).zzsp();
        }
        return null;
    }

    public final boolean zztt() {
        return this.zzdkn instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzaua zzaua, String str2) throws RemoteException {
        Bundle bundle;
        zzann zzann;
        Date date;
        zzvc zzvc2 = zzvc;
        zzaua zzaua2 = zzaua;
        String str3 = str2;
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdkn;
                Bundle zza = zza(str3, zzvc2, (String) null);
                if (zzvc2 != null) {
                    HashSet hashSet = zzvc2.zzcgx != null ? new HashSet(zzvc2.zzcgx) : null;
                    if (zzvc2.zzcgv == -1) {
                        date = null;
                    } else {
                        date = new Date(zzvc2.zzcgv);
                    }
                    zzann zzann2 = new zzann(date, zzvc2.zzcgw, hashSet, zzvc2.zznb, zzc(zzvc), zzvc2.zzadj, zzvc2.zzchh, zzvc2.zzadk, zza(str3, zzvc2));
                    if (zzvc2.zzchc != null) {
                        bundle = zzvc2.zzchc.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                        zzann = zzann2;
                    } else {
                        bundle = null;
                        zzann = zzann2;
                    }
                } else {
                    zzann = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzann, str, new zzauf(zzaua2), zza, bundle);
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            this.zzdkq = iObjectWrapper;
            this.zzdkp = zzaua2;
            zzaua2.zzaf(ObjectWrapper.wrap(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaua zzaua, List<String> list) throws RemoteException {
        if (this.zzdkn instanceof InitializableMediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzdkn;
                ArrayList arrayList = new ArrayList();
                for (String zza : list) {
                    arrayList.add(zza(zza, (zzvc) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzauf(zzaua), arrayList);
            } catch (Throwable th) {
                zzbbd.zzd("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zza(zzvc zzvc, String str) throws RemoteException {
        zza(zzvc, str, (String) null);
    }

    public final void zza(zzvc zzvc, String str, String str2) throws RemoteException {
        Date date;
        zzvc zzvc2 = zzvc;
        String str3 = str;
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdkn;
                Bundle bundle = null;
                HashSet hashSet = zzvc2.zzcgx != null ? new HashSet(zzvc2.zzcgx) : null;
                if (zzvc2.zzcgv == -1) {
                    date = null;
                } else {
                    date = new Date(zzvc2.zzcgv);
                }
                zzann zzann = new zzann(date, zzvc2.zzcgw, hashSet, zzvc2.zznb, zzc(zzvc), zzvc2.zzadj, zzvc2.zzchh, zzvc2.zzadk, zza(str3, zzvc2));
                if (zzvc2.zzchc != null) {
                    bundle = zzvc2.zzchc.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(zzann, zza(str3, zzvc2, str2), bundle);
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            zzb(this.zzdkq, zzvc2, str3, new zzanu((Adapter) this.zzdkn, this.zzdkp));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzdkn).showVideo();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzdkr;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzdkq));
            } else {
                zzbbd.zzfc("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzdkn).isInitialized();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return this.zzdkp != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzana zzana) throws RemoteException {
        zzvc zzvc2 = zzvc;
        String str2 = str;
        if (this.zzdkn instanceof Adapter) {
            zzbbd.zzef("Requesting rewarded ad from adapter.");
            try {
                MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza = zza(zzana);
                Bundle zza2 = zza(str2, zzvc2, (String) null);
                Bundle zzd = zzd(zzvc2);
                boolean zzc = zzc(zzvc);
                Location location = zzvc2.zznb;
                int i = zzvc2.zzadj;
                int i2 = zzvc2.zzadk;
                String zza3 = zza(str2, zzvc2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza2, zzd, zzc, location, i, i2, zza3, "");
                ((Adapter) this.zzdkn).loadRewardedAd(mediationRewardedAdConfiguration, zza);
            } catch (Exception e) {
                zzbbd.zzc("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zzc(IObjectWrapper iObjectWrapper, zzvc zzvc, String str, zzana zzana) throws RemoteException {
        zzvc zzvc2 = zzvc;
        String str2 = str;
        if (this.zzdkn instanceof Adapter) {
            zzbbd.zzef("Requesting rewarded interstitial ad from adapter.");
            try {
                MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza = zza(zzana);
                Bundle zza2 = zza(str2, zzvc2, (String) null);
                Bundle zzd = zzd(zzvc2);
                boolean zzc = zzc(zzvc);
                Location location = zzvc2.zznb;
                int i = zzvc2.zzadj;
                int i2 = zzvc2.zzadk;
                String zza3 = zza(str2, zzvc2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza2, zzd, zzc, location, i, i2, zza3, "");
                ((Adapter) this.zzdkn).loadRewardedInterstitialAd(mediationRewardedAdConfiguration, zza);
            } catch (Exception e) {
                zzbbd.zzc("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzdkn instanceof Adapter) {
            zzbbd.zzef("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzdkr;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzbbd.zzfc("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.zzdkn;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzef(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
        }
    }

    public final zzyg getVideoController() {
        Object obj = this.zzdkn;
        if (!(obj instanceof zza)) {
            return null;
        }
        try {
            return ((zza) obj).getVideoController();
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            return null;
        }
    }

    public final void showInterstitial() throws RemoteException {
        if (this.zzdkn instanceof MediationInterstitialAdapter) {
            zzbbd.zzef("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zzdkn).showInterstitial();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    public final void destroy() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    public final void pause() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    public final void resume() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zzdkn;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaih zzaih, List<zzaip> list) throws RemoteException {
        AdFormat adFormat;
        if (this.zzdkn instanceof Adapter) {
            zzanp zzanp = new zzanp(this, zzaih);
            ArrayList arrayList = new ArrayList();
            for (zzaip next : list) {
                String str = next.zzdfi;
                char c = 65535;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    adFormat = AdFormat.BANNER;
                } else if (c == 1) {
                    adFormat = AdFormat.INTERSTITIAL;
                } else if (c == 2) {
                    adFormat = AdFormat.REWARDED;
                } else if (c == 3) {
                    adFormat = AdFormat.NATIVE;
                } else {
                    throw new RemoteException();
                }
                arrayList.add(new MediationConfiguration(adFormat, next.extras));
            }
            ((Adapter) this.zzdkn).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzanp, arrayList);
            return;
        }
        throw new RemoteException();
    }

    public final zzapo zztw() {
        Object obj = this.zzdkn;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzapo.zza(((Adapter) obj).getVersionInfo());
    }

    public final zzapo zztx() {
        Object obj = this.zzdkn;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzapo.zza(((Adapter) obj).getSDKVersionInfo());
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzana zzana) {
        return new zzans(this, zzana);
    }

    private final Bundle zza(String str, zzvc zzvc, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbbd.zzef(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zzdkn instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzvc != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzvc.zzadj);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbbd.zzc("", th);
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
        if (zzvc.zzchc == null || (bundle = zzvc.zzchc.getBundle(this.zzdkn.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }
}
