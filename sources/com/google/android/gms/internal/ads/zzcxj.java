package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxj implements zzut {
    private zzwg zzgql;

    public final synchronized void zzb(zzwg zzwg) {
        this.zzgql = zzwg;
    }

    public final synchronized void onAdClicked() {
        if (this.zzgql != null) {
            try {
                this.zzgql.onAdClicked();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
