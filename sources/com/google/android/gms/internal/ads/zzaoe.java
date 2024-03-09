package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzaoe implements Runnable {
    private final /* synthetic */ zzanx zzdlg;
    private final /* synthetic */ AdRequest.ErrorCode zzdlh;

    zzaoe(zzanx zzanx, AdRequest.ErrorCode errorCode) {
        this.zzdlg = zzanx;
        this.zzdlh = errorCode;
    }

    public final void run() {
        try {
            this.zzdlg.zzdks.onAdFailedToLoad(zzaoj.zza(this.zzdlh));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
