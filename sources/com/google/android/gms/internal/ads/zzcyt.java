package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcyt implements zzdvi<zzczg> {
    private final /* synthetic */ zzawt zzgrs;
    private final /* synthetic */ zzcyk zzgrt;

    zzcyt(zzcyk zzcyk, zzawt zzawt) {
        this.zzgrt = zzcyk;
        this.zzgrs = zzawt;
    }

    public final void zzb(Throwable th) {
        try {
            zzawt zzawt = this.zzgrs;
            String valueOf = String.valueOf(th.getMessage());
            zzawt.onError(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzczg zzczg = (zzczg) obj;
        try {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
                if (this.zzgrt.zzbop.zzedr >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcxe)).intValue()) {
                    if (zzczg == null) {
                        this.zzgrs.zza((String) null, (String) null, (Bundle) null);
                        return;
                    } else {
                        this.zzgrs.zza(zzczg.zzgsb, zzczg.zzgsc, zzczg.zzgsd);
                        return;
                    }
                }
            }
            if (zzczg == null) {
                this.zzgrs.zzk((String) null, (String) null);
            } else {
                this.zzgrs.zzk(zzczg.zzgsb, zzczg.zzgsc);
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
