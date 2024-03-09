package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzzj implements Runnable {
    private final /* synthetic */ zzzk zzckl;

    zzzj(zzzk zzzk) {
        this.zzckl = zzzk;
    }

    public final void run() {
        if (this.zzckl.zzbpf != null) {
            try {
                this.zzckl.zzbpf.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
