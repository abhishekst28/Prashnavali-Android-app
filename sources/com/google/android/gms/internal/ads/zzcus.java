package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcus extends zzaoy {
    private zzcrg<zzapa, zzcso> zzglp;

    private zzcus(zzcuq zzcuq, zzcrg<zzapa, zzcso> zzcrg) {
        this.zzglp = zzcrg;
    }

    public final void zzuh() throws RemoteException {
        ((zzcso) this.zzglp.zzglc).onAdLoaded();
    }

    public final void zzdq(String str) throws RemoteException {
        ((zzcso) this.zzglp.zzglc).zzc(0, str);
    }
}
