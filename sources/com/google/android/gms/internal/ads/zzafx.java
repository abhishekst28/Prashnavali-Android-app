package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzafx extends UnifiedNativeAd {
    private final VideoController zzcjj = new VideoController();
    private final List<NativeAd.Image> zzdcz = new ArrayList();
    private final zzadx zzdda;
    private final NativeAd.AdChoicesInfo zzddb;
    private final zzafw zzddh;
    private final List<MuteThisAdReason> zzddi = new ArrayList();

    public zzafx(zzafw zzafw) {
        zzadx zzadx;
        zzxv zzxv;
        zzadw zzadw;
        IBinder iBinder;
        this.zzddh = zzafw;
        zzadp zzadp = null;
        try {
            List images = zzafw.getImages();
            if (images != null) {
                for (Object next : images) {
                    if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                        zzadw = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        if (queryLocalInterface instanceof zzadw) {
                            zzadw = (zzadw) queryLocalInterface;
                        } else {
                            zzadw = new zzady(iBinder);
                        }
                    }
                    if (zzadw != null) {
                        this.zzdcz.add(new zzadx(zzadw));
                    }
                }
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
        try {
            List muteThisAdReasons = this.zzddh.getMuteThisAdReasons();
            if (muteThisAdReasons != null) {
                for (Object next2 : muteThisAdReasons) {
                    if (next2 instanceof IBinder) {
                        zzxv = zzxu.zzg((IBinder) next2);
                    } else {
                        zzxv = null;
                    }
                    if (zzxv != null) {
                        this.zzddi.add(new zzxw(zzxv));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
        }
        try {
            zzadw zzsh = this.zzddh.zzsh();
            if (zzsh != null) {
                zzadx = new zzadx(zzsh);
            } else {
                zzadx = null;
            }
        } catch (RemoteException e3) {
            zzbbd.zzc("", e3);
            zzadx = null;
        }
        this.zzdda = zzadx;
        try {
            if (this.zzddh.zzsi() != null) {
                zzadp = new zzadp(this.zzddh.zzsi());
            }
        } catch (RemoteException e4) {
            zzbbd.zzc("", e4);
        }
        this.zzddb = zzadp;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzsg */
    public final IObjectWrapper zzjq() {
        try {
            return this.zzddh.zzsg();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final Object zzjv() {
        try {
            IObjectWrapper zzsj = this.zzddh.zzsj();
            if (zzsj != null) {
                return ObjectWrapper.unwrap(zzsj);
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzddh.performClick(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzddh.recordImpression(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzddh.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final String getHeadline() {
        try {
            return this.zzddh.getHeadline();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzdcz;
    }

    public final String getBody() {
        try {
            return this.zzddh.getBody();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.zzdda;
    }

    public final String getCallToAction() {
        try {
            return this.zzddh.getCallToAction();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double starRating = this.zzddh.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.zzddh.getStore();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final String getPrice() {
        try {
            return this.zzddh.getPrice();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzddh.getVideoController() != null) {
                this.zzcjj.zza(this.zzddh.getVideoController());
            }
        } catch (RemoteException e) {
            zzbbd.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjj;
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzddb;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzddh.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle extras = this.zzddh.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
        return new Bundle();
    }

    public final void enableCustomClickGesture() {
        try {
            this.zzddh.zzsr();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zzddh.isCustomClickGestureEnabled();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zzddh.recordCustomClickGesture();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zzddi;
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zzddh.isCustomMuteThisAdEnabled();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    public final void destroy() {
        try {
            this.zzddh.destroy();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zzddh.zza((zzafr) new zzagj(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzbbd.zzc("Failed to setUnconfirmedClickListener", e);
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzbbd.zzfc("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.zzddh.zza((zzxv) null);
            } else if (muteThisAdReason instanceof zzxw) {
                this.zzddh.zza(((zzxw) muteThisAdReason).zzqi());
            } else {
                zzbbd.zzfc("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zzddh.zza((zzxr) new zzxs(muteThisAdListener));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zzddh.cancelUnconfirmedClick();
        } catch (RemoteException e) {
            zzbbd.zzc("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final String getAdvertiser() {
        try {
            return this.zzddh.getAdvertiser();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.zzddh.zzss() != null) {
                return new zzze(this.zzddh.zzss());
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyf zzyf;
        try {
            zzyf = this.zzddh.zzkg();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            zzyf = null;
        }
        return ResponseInfo.zza(zzyf);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzddh.zza((zzya) new zzzt(onPaidEventListener));
        } catch (RemoteException e) {
            zzbbd.zzc("Failed to setOnPaidEventListener", e);
        }
    }
}
