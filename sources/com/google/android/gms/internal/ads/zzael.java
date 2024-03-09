package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzael extends NativeAppInstallAd {
    private final VideoController zzcjj = new VideoController();
    private final zzaek zzdcy;
    private final List<NativeAd.Image> zzdcz = new ArrayList();
    private final zzadx zzdda;
    private final NativeAd.AdChoicesInfo zzddb;

    public zzael(zzaek zzaek) {
        zzadx zzadx;
        zzadw zzadw;
        IBinder iBinder;
        this.zzdcy = zzaek;
        zzadp zzadp = null;
        try {
            List images = zzaek.getImages();
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
            zzadw zzsh = this.zzdcy.zzsh();
            if (zzsh != null) {
                zzadx = new zzadx(zzsh);
            } else {
                zzadx = null;
            }
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
            zzadx = null;
        }
        this.zzdda = zzadx;
        try {
            if (this.zzdcy.zzsi() != null) {
                zzadp = new zzadp(this.zzdcy.zzsi());
            }
        } catch (RemoteException e3) {
            zzbbd.zzc("", e3);
        }
        this.zzddb = zzadp;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzsg */
    public final IObjectWrapper zzjq() {
        try {
            return this.zzdcy.zzsg();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzdcy.performClick(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzdcy.recordImpression(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzdcy.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.zzdcy.getHeadline();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzdcz;
    }

    public final CharSequence getBody() {
        try {
            return this.zzdcy.getBody();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.zzdda;
    }

    public final CharSequence getCallToAction() {
        try {
            return this.zzdcy.getCallToAction();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double starRating = this.zzdcy.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final CharSequence getStore() {
        try {
            return this.zzdcy.getStore();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final CharSequence getPrice() {
        try {
            return this.zzdcy.getPrice();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzdcy.getVideoController() != null) {
                this.zzcjj.zza(this.zzdcy.getVideoController());
            }
        } catch (RemoteException e) {
            zzbbd.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjj;
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzddb;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzdcy.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.zzdcy.getExtras();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.zzdcy.destroy();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
