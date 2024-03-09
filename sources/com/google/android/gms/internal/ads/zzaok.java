package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzaok implements Runnable {
    private final /* synthetic */ zzanx zzdlg;

    zzaok(zzanx zzanx) {
        this.zzdlg = zzanx;
    }

    public final void run() {
        try {
            this.zzdlg.zzdks.onAdLeftApplication();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
