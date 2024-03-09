package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxu {
    /* access modifiers changed from: private */
    public zzyf zzadq;
    /* access modifiers changed from: private */
    public boolean zzaey = false;
    private final String zzbuo;
    private final zzcxy<zzbpd> zzgqv;

    public zzcxu(zzcxy<zzbpd> zzcxy, String str) {
        this.zzgqv = zzcxy;
        this.zzbuo = str;
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgqv.isLoading();
    }

    public final synchronized void zza(zzvc zzvc, int i) throws RemoteException {
        this.zzadq = null;
        this.zzaey = this.zzgqv.zza(zzvc, this.zzbuo, new zzcxz(i), new zzcxt(this));
    }

    public final synchronized String getMediationAdapterClassName() {
        String str;
        str = null;
        try {
            if (this.zzadq != null) {
                str = this.zzadq.getMediationAdapterClassName();
            }
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized String zzkf() {
        String str;
        str = null;
        try {
            if (this.zzadq != null) {
                str = this.zzadq.getMediationAdapterClassName();
            }
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }
}
