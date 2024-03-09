package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzzp implements Runnable {
    private final zzaut zzcko;

    zzzp(zzaut zzaut) {
        this.zzcko = zzaut;
    }

    public final void run() {
        zzaut zzaut = this.zzcko;
        if (zzaut != null) {
            try {
                zzaut.onRewardedAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
