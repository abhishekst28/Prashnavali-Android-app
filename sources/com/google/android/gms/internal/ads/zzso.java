package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzso extends AppOpenAd {
    private final zzsd zzbur;

    public zzso(zzsd zzsd) {
        this.zzbur = zzsd;
    }

    /* access modifiers changed from: protected */
    public final zzwu zzdu() {
        try {
            return this.zzbur.zzdu();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(zzsj zzsj) {
        try {
            this.zzbur.zza(zzsj);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
