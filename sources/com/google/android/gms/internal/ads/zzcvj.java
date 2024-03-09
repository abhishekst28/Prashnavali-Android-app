package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcvj extends zzaud {
    private final /* synthetic */ zzbur zzgny;
    private final /* synthetic */ zzbst zzgnz;
    private final /* synthetic */ zzbtu zzgoa;
    private final /* synthetic */ zzbzc zzgob;

    zzcvj(zzcvf zzcvf, zzbur zzbur, zzbst zzbst, zzbtu zzbtu, zzbzc zzbzc) {
        this.zzgny = zzbur;
        this.zzgnz = zzbst;
        this.zzgoa = zzbtu;
        this.zzgob = zzbzc;
    }

    public final void zzah(IObjectWrapper iObjectWrapper) {
        this.zzgny.zzuj();
    }

    public final void zzaj(IObjectWrapper iObjectWrapper) {
        this.zzgny.zzui();
    }

    public final void zzak(IObjectWrapper iObjectWrapper) {
        this.zzgnz.onAdClicked();
    }

    public final void zzal(IObjectWrapper iObjectWrapper) {
        this.zzgoa.onAdLeftApplication();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaue zzaue) {
        this.zzgob.zza(zzaue);
    }

    public final void zzai(IObjectWrapper iObjectWrapper) {
        this.zzgob.zzsv();
    }

    public final void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzgoa.onRewardedVideoCompleted();
    }

    public final void zzb(Bundle bundle) {
    }

    public final void zzaf(IObjectWrapper iObjectWrapper) {
    }

    public final void zzag(IObjectWrapper iObjectWrapper) {
    }

    public final void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
    }
}
