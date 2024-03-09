package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcsb extends zzaon {
    private zzcrg<zzapa, zzcso> zzglp;
    private final /* synthetic */ zzcsa zzglq;

    private zzcsb(zzcsa zzcsa, zzcrg<zzapa, zzcso> zzcrg) {
        this.zzglq = zzcsa;
        this.zzglp = zzcrg;
    }

    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        View unused = this.zzglq.view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzcso) this.zzglp.zzglc).onAdLoaded();
    }

    public final void zzdq(String str) throws RemoteException {
        ((zzcso) this.zzglp.zzglc).zzc(0, str);
    }
}
