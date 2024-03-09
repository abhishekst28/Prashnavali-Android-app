package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzzh implements Runnable {
    private final /* synthetic */ zzzi zzckj;

    zzzh(zzzi zzzi) {
        this.zzckj = zzzi;
    }

    public final void run() {
        if (this.zzckj.zzckk.zzbpf != null) {
            try {
                this.zzckj.zzckk.zzbpf.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
