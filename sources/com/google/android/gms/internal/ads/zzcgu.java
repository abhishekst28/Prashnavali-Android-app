package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcgu extends zzaen {
    private final String zzfqh;
    private final zzccv zzfvt;
    private final zzcco zzfyz;

    public zzcgu(String str, zzcco zzcco, zzccv zzccv) {
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

    public final String getBody() throws RemoteException {
        return this.zzfvt.getBody();
    }

    public final zzadw zzsk() throws RemoteException {
        return this.zzfvt.zzsk();
    }

    public final String getCallToAction() throws RemoteException {
        return this.zzfvt.getCallToAction();
    }

    public final String getAdvertiser() throws RemoteException {
        return this.zzfvt.getAdvertiser();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.zzfvt.getExtras();
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
}
