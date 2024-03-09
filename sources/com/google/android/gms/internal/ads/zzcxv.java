package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcxv implements zzbsz {
    private final zzcxm zzgqf;
    private final zzaiz zzgqw;

    zzcxv(zzcxm zzcxm, zzaiz zzaiz) {
        this.zzgqf = zzcxm;
        this.zzgqw = zzaiz;
    }

    public final void zzg(zzuw zzuw) {
        zzcxm zzcxm = this.zzgqf;
        zzaiz zzaiz = this.zzgqw;
        zzcxm.zzg(zzuw);
        if (zzaiz != null) {
            try {
                zzaiz.zzc(zzuw);
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
            try {
                zzaiz.onInstreamAdFailedToLoad(zzuw.errorCode);
            } catch (RemoteException e2) {
                zzbbd.zze("#007 Could not call remote method.", e2);
            }
        }
    }
}
