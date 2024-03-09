package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaub implements RewardedVideoAd {
    private final Object lock = new Object();
    private final zzatm zzdvc;
    private final zzatw zzdvd = new zzatw((RewardedVideoAdListener) null);
    private String zzdve;
    private String zzdvf;
    private final Context zzvr;

    public zzaub(Context context, zzatm zzatm) {
        this.zzdvc = zzatm == null ? new zzzs() : zzatm;
        this.zzvr = context.getApplicationContext();
    }

    private final void zza(String str, zzyo zzyo) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zza(zzvh.zza(this.zzvr, zzyo, str));
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void loadAd(String str, AdRequest adRequest) {
        zza(str, adRequest.zzdp());
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        zza(str, publisherAdRequest.zzdp());
    }

    public final void show() {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.show();
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.lock) {
            this.zzdvd.setRewardedVideoAdListener(rewardedVideoAdListener);
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zza((zzatt) this.zzdvd);
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zza((zzxb) new zzvd(adMetadataListener));
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final Bundle getAdMetadata() {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    Bundle adMetadata = this.zzdvc.getAdMetadata();
                    return adMetadata;
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
            Bundle bundle = new Bundle();
            return bundle;
        }
    }

    public final void setUserId(String str) {
        synchronized (this.lock) {
            this.zzdve = str;
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.setUserId(str);
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean isLoaded() {
        synchronized (this.lock) {
            if (this.zzdvc == null) {
                return false;
            }
            try {
                boolean isLoaded = this.zzdvc.isLoaded();
                return isLoaded;
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    public final void pause() {
        pause((Context) null);
    }

    public final void pause(Context context) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zzj(ObjectWrapper.wrap(context));
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void resume() {
        resume((Context) null);
    }

    public final void resume(Context context) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zzk(ObjectWrapper.wrap(context));
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void destroy() {
        destroy((Context) null);
    }

    public final void destroy(Context context) {
        synchronized (this.lock) {
            this.zzdvd.setRewardedVideoAdListener((RewardedVideoAdListener) null);
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zzl(ObjectWrapper.wrap(context));
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.lock) {
            rewardedVideoAdListener = this.zzdvd.getRewardedVideoAdListener();
        }
        return rewardedVideoAdListener;
    }

    public final String getUserId() {
        String str;
        synchronized (this.lock) {
            str = this.zzdve;
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzdvc != null) {
                return this.zzdvc.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.setImmersiveMode(z);
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setCustomData(String str) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.setCustomData(str);
                    this.zzdvf = str;
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final String getCustomData() {
        String str;
        synchronized (this.lock) {
            str = this.zzdvf;
        }
        return str;
    }

    public final ResponseInfo getResponseInfo() {
        zzyf zzyf = null;
        try {
            if (this.zzdvc != null) {
                zzyf = this.zzdvc.zzkg();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzyf);
    }
}
