package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzcuu extends zzcvw {
    private zzbzc zzgnq;

    public zzcuu(zzbst zzbst, zzbtl zzbtl, zzbtu zzbtu, zzbue zzbue, zzbtb zzbtb, zzbws zzbws, zzbzh zzbzh, zzbur zzbur, zzbzc zzbzc, zzbwp zzbwp) {
        super(zzbst, zzbtl, zzbtu, zzbue, zzbws, zzbur, zzbzh, zzbwp, zzbtb);
        this.zzgnq = zzbzc;
    }

    public final void zzty() {
        this.zzgnq.zzsv();
    }

    public final void zztz() throws RemoteException {
        this.zzgnq.zzsw();
    }

    public final void zza(zzaug zzaug) throws RemoteException {
        super.zza(zzaug);
        this.zzgnq.zza(new zzaue(zzaug.getType(), zzaug.getAmount()));
    }

    public final void zzb(zzaue zzaue) {
        super.zzb(zzaue);
        this.zzgnq.zza(zzaue);
    }

    public final void onVideoEnd() {
        this.zzgnq.zzsw();
    }
}
