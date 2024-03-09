package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzzr implements Runnable {
    private final /* synthetic */ zzzs zzckp;

    zzzr(zzzs zzzs) {
        this.zzckp = zzzs;
    }

    public final void run() {
        if (this.zzckp.zzckq != null) {
            try {
                this.zzckp.zzckq.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
