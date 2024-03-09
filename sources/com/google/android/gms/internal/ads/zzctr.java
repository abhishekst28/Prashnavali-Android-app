package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzctr extends zzaot {
    private zzcrg<zzapa, zzcso> zzglp;
    private final /* synthetic */ zzctp zzgmx;

    private zzctr(zzctp zzctp, zzcrg<zzapa, zzcso> zzcrg) {
        this.zzgmx = zzctp;
        this.zzglp = zzcrg;
    }

    public final void zza(zzanj zzanj) throws RemoteException {
        zzanj unused = this.zzgmx.zzgmw = zzanj;
        ((zzcso) this.zzglp.zzglc).onAdLoaded();
    }

    public final void zzdq(String str) throws RemoteException {
        ((zzcso) this.zzglp.zzglc).zzc(0, str);
    }
}
