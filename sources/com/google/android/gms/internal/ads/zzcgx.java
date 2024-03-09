package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcgx extends zzafv {
    private final String zzfqh;
    private final zzccv zzfvt;
    private final zzcco zzfyz;

    public zzcgx(String str, zzcco zzcco, zzccv zzccv) {
        this.zzfqh = str;
        this.zzfyz = zzcco;
        this.zzfvt = zzccv;
    }

    public final IObjectWrapper zzsg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfyz);
    }

    public final String getHeadline() throws RemoteException {
        return this.zzfvt.getHeadline();
    }

    public final List<?> getImages() throws RemoteException {
        return this.zzfvt.getImages();
    }

    public final List<?> getMuteThisAdReasons() throws RemoteException {
        if (isCustomMuteThisAdEnabled()) {
            return this.zzfvt.getMuteThisAdReasons();
        }
        return Collections.emptyList();
    }

    public final boolean isCustomMuteThisAdEnabled() throws RemoteException {
        return !this.zzfvt.getMuteThisAdReasons().isEmpty() && this.zzfvt.zzalq() != null;
    }

    public final String getBody() throws RemoteException {
        return this.zzfvt.getBody();
    }

    public final zzadw zzsh() throws RemoteException {
        return this.zzfvt.zzsh();
    }

    public final String getCallToAction() throws RemoteException {
        return this.zzfvt.getCallToAction();
    }

    public final String getAdvertiser() throws RemoteException {
        return this.zzfvt.getAdvertiser();
    }

    public final double getStarRating() throws RemoteException {
        return this.zzfvt.getStarRating();
    }

    public final String getStore() throws RemoteException {
        return this.zzfvt.getStore();
    }

    public final String getPrice() throws RemoteException {
        return this.zzfvt.getPrice();
    }

    public final void destroy() throws RemoteException {
        this.zzfyz.destroy();
    }

    public final zzyg getVideoController() throws RemoteException {
        return this.zzfvt.getVideoController();
    }

    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzfyz.zzg(bundle);
    }

    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzfyz.zzi(bundle);
    }

    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzfyz.zzh(bundle);
    }

    public final zzado zzsi() throws RemoteException {
        return this.zzfvt.zzsi();
    }

    public final IObjectWrapper zzsj() throws RemoteException {
        return this.zzfvt.zzsj();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzfqh;
    }

    public final Bundle getExtras() throws RemoteException {
        return this.zzfvt.getExtras();
    }

    public final void zza(zzafr zzafr) throws RemoteException {
        this.zzfyz.zza(zzafr);
    }

    public final void zza(zzxv zzxv) throws RemoteException {
        this.zzfyz.zza(zzxv);
    }

    public final void zza(zzxr zzxr) throws RemoteException {
        this.zzfyz.zza(zzxr);
    }

    public final void zzsr() {
        this.zzfyz.zzsr();
    }

    public final void recordCustomClickGesture() {
        this.zzfyz.recordCustomClickGesture();
    }

    public final boolean isCustomClickGestureEnabled() {
        return this.zzfyz.isCustomClickGestureEnabled();
    }

    public final void cancelUnconfirmedClick() throws RemoteException {
        this.zzfyz.cancelUnconfirmedClick();
    }

    public final zzadr zzss() throws RemoteException {
        return this.zzfyz.zzalk().zzss();
    }

    public final zzyf zzkg() throws RemoteException {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue()) {
            return null;
        }
        return this.zzfyz.zzaim();
    }

    public final void zza(zzya zzya) throws RemoteException {
        this.zzfyz.zza(zzya);
    }
}
