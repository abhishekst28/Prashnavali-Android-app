package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaep extends NativeContentAd {
    private final VideoController zzcjj = new VideoController();
    private final List<NativeAd.Image> zzdcz = new ArrayList();
    private final NativeAd.AdChoicesInfo zzddb;
    private final zzaeo zzddc;
    private final zzadx zzddd;

    public zzaep(zzaeo zzaeo) {
        zzadx zzadx;
        zzadw zzadw;
        IBinder iBinder;
        this.zzddc = zzaeo;
        zzadp zzadp = null;
        try {
            List images = zzaeo.getImages();
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
            zzadw zzsk = this.zzddc.zzsk();
            if (zzsk != null) {
                zzadx = new zzadx(zzsk);
            } else {
                zzadx = null;
            }
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
            zzadx = null;
        }
        this.zzddd = zzadx;
        try {
            if (this.zzddc.zzsi() != null) {
                zzadp = new zzadp(this.zzddc.zzsi());
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
            return this.zzddc.zzsg();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzddc.performClick(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzddc.recordImpression(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzddc.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.zzddc.getHeadline();
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
            return this.zzddc.getBody();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final NativeAd.Image getLogo() {
        return this.zzddd;
    }

    public final CharSequence getCallToAction() {
        try {
            return this.zzddc.getCallToAction();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final CharSequence getAdvertiser() {
        try {
            return this.zzddc.getAdvertiser();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzddc.getVideoController() != null) {
                this.zzcjj.zza(this.zzddc.getVideoController());
            }
        } catch (RemoteException e) {
            zzbbd.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjj;
    }

    public final Bundle getExtras() {
        try {
            return this.zzddc.getExtras();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzddb;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzddc.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.zzddc.destroy();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
