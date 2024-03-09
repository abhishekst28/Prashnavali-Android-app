package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzaog implements Runnable {
    private final /* synthetic */ zzanx zzdlg;

    zzaog(zzanx zzanx) {
        this.zzdlg = zzanx;
    }

    public final void run() {
        try {
            this.zzdlg.zzdks.onAdOpened();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
