package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxe extends zzwp {
    private final zzcxu zzgqe;

    public zzcxe(Context context, zzbii zzbii, zzdlp zzdlp, zzcdg zzcdg, zzwl zzwl) {
        zzcxw zzcxw = new zzcxw(zzcdg);
        zzcxw.zzc(zzwl);
        this.zzgqe = new zzcxu(new zzcyc(zzbii, context, zzcxw, zzdlp), zzdlp.zzass());
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgqe.isLoading();
    }

    public final void zzb(zzvc zzvc) throws RemoteException {
        this.zzgqe.zza(zzvc, 1);
    }

    public final synchronized void zza(zzvc zzvc, int i) throws RemoteException {
        this.zzgqe.zza(zzvc, i);
    }

    public final synchronized String getMediationAdapterClassName() {
        return this.zzgqe.getMediationAdapterClassName();
    }

    public final synchronized String zzkf() {
        return this.zzgqe.zzkf();
    }
}
