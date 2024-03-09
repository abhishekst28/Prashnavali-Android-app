package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzanp implements InitializationCompleteCallback {
    private final /* synthetic */ zzaih zzdkm;

    zzanp(zzanq zzanq, zzaih zzaih) {
        this.zzdkm = zzaih;
    }

    public final void onInitializationSucceeded() {
        try {
            this.zzdkm.onInitializationSucceeded();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zzdkm.onInitializationFailed(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
