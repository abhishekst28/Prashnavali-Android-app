package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzyv {
    private static zzyv zzcjy;
    private final Object lock = new Object();
    private zzxk zzcjz;
    private RewardedVideoAd zzcka;
    private RequestConfiguration zzckb = new RequestConfiguration.Builder().build();
    private InitializationStatus zzckc;
    private boolean zzxi = false;

    private zzyv() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    class zza extends zzail {
        private final OnInitializationCompleteListener zzcke;

        private zza(OnInitializationCompleteListener onInitializationCompleteListener) {
            this.zzcke = onInitializationCompleteListener;
        }

        public final void zze(List<zzaif> list) throws RemoteException {
            this.zzcke.onInitializationComplete(zzyv.zzd(list));
        }

        /* synthetic */ zza(zzyv zzyv, OnInitializationCompleteListener onInitializationCompleteListener, zzyy zzyy) {
            this(onInitializationCompleteListener);
        }
    }

    public static zzyv zzqt() {
        zzyv zzyv;
        synchronized (zzyv.class) {
            if (zzcjy == null) {
                zzcjy = new zzyv();
            }
            zzyv = zzcjy;
        }
        return zzyv;
    }

    public final void zza(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.lock) {
            if (!this.zzxi) {
                if (context != null) {
                    try {
                        zzamm.zztn().zzd(context, str);
                        zzg(context);
                        this.zzxi = true;
                        if (onInitializationCompleteListener != null) {
                            this.zzcjz.zza((zzaim) new zza(this, onInitializationCompleteListener, (zzyy) null));
                        }
                        this.zzcjz.zza((zzamu) new zzamr());
                        this.zzcjz.initialize();
                        this.zzcjz.zza(str, ObjectWrapper.wrap(new zzyu(this, context)));
                        if (!(this.zzckb.getTagForChildDirectedTreatment() == -1 && this.zzckb.getTagForUnderAgeOfConsent() == -1)) {
                            zza(this.zzckb);
                        }
                        zzaat.initialize(context);
                        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcud)).booleanValue() && !getVersionString().endsWith("0")) {
                            zzbbd.zzfc("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                            this.zzckc = new zzyw(this);
                            if (onInitializationCompleteListener != null) {
                                zzbat.zzaah.post(new zzyx(this, onInitializationCompleteListener));
                            }
                        }
                    } catch (RemoteException e) {
                        zzbbd.zzd("MobileAdsSettingManager initialization failed", e);
                    }
                } else {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            }
        }
    }

    public final RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized (this.lock) {
            if (this.zzcka != null) {
                RewardedVideoAd rewardedVideoAd = this.zzcka;
                return rewardedVideoAd;
            }
            zzaub zzaub = new zzaub(context, (zzatm) new zzwc(zzwe.zzpr(), context, new zzamr()).zzd(context, false));
            this.zzcka = zzaub;
            return zzaub;
        }
    }

    public final void setAppVolume(float f) {
        boolean z = true;
        Preconditions.checkArgument(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.lock) {
            if (this.zzcjz == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzcjz.setAppVolume(f);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to set app volume.", e);
            }
        }
    }

    public final float zzqd() {
        float f;
        synchronized (this.lock) {
            f = 1.0f;
            if (this.zzcjz == null) {
                return 1.0f;
            }
            try {
                f = this.zzcjz.zzqd();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to get app volume.", e);
            }
        }
        return f;
    }

    public final void setAppMuted(boolean z) {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzcjz.setAppMuted(z);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to set app mute state.", e);
            }
        }
    }

    public final boolean zzqe() {
        boolean z;
        synchronized (this.lock) {
            z = false;
            if (this.zzcjz == null) {
                return false;
            }
            try {
                z = this.zzcjz.zzqe();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to get app mute state.", e);
            }
        }
        return z;
    }

    public final void openDebugMenu(Context context, String str) {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzcjz.zzb(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to open debug menu.", e);
            }
        }
    }

    public final String getVersionString() {
        String zzhi;
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzhi = zzdsw.zzhi(this.zzcjz.getVersionString());
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to get version string.", e);
                return "";
            }
        }
        return zzhi;
    }

    public final void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        synchronized (this.lock) {
            try {
                this.zzcjz.zzci(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to register RtbAdapter", e);
            }
        }
    }

    public final InitializationStatus getInitializationStatus() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                if (this.zzckc != null) {
                    InitializationStatus initializationStatus = this.zzckc;
                    return initializationStatus;
                }
                InitializationStatus zzd = zzd(this.zzcjz.zzqf());
                return zzd;
            } catch (RemoteException e) {
                zzbbd.zzfc("Unable to get Initialization status.");
                return null;
            }
        }
    }

    public final void disableMediationAdapterInitialization(Context context) {
        synchronized (this.lock) {
            zzg(context);
            try {
                this.zzcjz.zzqg();
            } catch (RemoteException e) {
                zzbbd.zzfc("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* access modifiers changed from: private */
    public static InitializationStatus zzd(List<zzaif> list) {
        HashMap hashMap = new HashMap();
        for (zzaif next : list) {
            hashMap.put(next.zzdfe, new zzain(next.zzdff ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, next.description, next.zzdfg));
        }
        return new zzaiq(hashMap);
    }

    public final RequestConfiguration getRequestConfiguration() {
        return this.zzckb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setRequestConfiguration(com.google.android.gms.ads.RequestConfiguration r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            com.google.android.gms.ads.RequestConfiguration r1 = r4.zzckb     // Catch:{ all -> 0x0030 }
            r4.zzckb = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zzxk r2 = r4.zzcjz     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            int r3 = r5.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            int r2 = r5.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.zza((com.google.android.gms.ads.RequestConfiguration) r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyv.setRequestConfiguration(com.google.android.gms.ads.RequestConfiguration):void");
    }

    private final void zza(RequestConfiguration requestConfiguration) {
        try {
            this.zzcjz.zza(new zzzw(requestConfiguration));
        } catch (RemoteException e) {
            zzbbd.zzc("Unable to set request configuration parcel.", e);
        }
    }

    private final void zzg(Context context) {
        if (this.zzcjz == null) {
            this.zzcjz = (zzxk) new zzwb(zzwe.zzpr(), context).zzd(context, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzckc);
    }
}
