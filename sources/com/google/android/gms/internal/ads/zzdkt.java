package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdkt extends AdMetadataListener {
    private final /* synthetic */ zzdkr zzgzx;
    private final /* synthetic */ zzxb zzgzy;

    zzdkt(zzdkr zzdkr, zzxb zzxb) {
        this.zzgzx = zzdkr;
        this.zzgzy = zzxb;
    }

    public final void onAdMetadataChanged() {
        if (this.zzgzx.zzgzw != null) {
            try {
                this.zzgzy.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
