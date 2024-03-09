package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzaoa implements Runnable {
    private final /* synthetic */ zzanx zzdlg;

    zzaoa(zzanx zzanx) {
        this.zzdlg = zzanx;
    }

    public final void run() {
        try {
            this.zzdlg.zzdks.onAdClicked();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
