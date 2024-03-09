package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcpv implements zzdvi<ParcelFileDescriptor> {
    private final /* synthetic */ zzasj zzgjf;

    zzcpv(zzcpj zzcpj, zzasj zzasj) {
        this.zzgjf = zzasj;
    }

    public final void zzb(Throwable th) {
        try {
            this.zzgjf.zza(zzazl.zzc(th));
        } catch (RemoteException e) {
            zzaxy.zza("Service can't call client", e);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        try {
            this.zzgjf.zzb((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zzaxy.zza("Service can't call client", e);
        }
    }
}
