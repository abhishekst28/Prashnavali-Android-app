package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzapj implements SignalCallbacks {
    private final /* synthetic */ zzapb zzdls;

    zzapj(zzapf zzapf, zzapb zzapb) {
        this.zzdls = zzapb;
    }

    public final void onSuccess(String str) {
        try {
            this.zzdls.zzds(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdls.onFailure(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
