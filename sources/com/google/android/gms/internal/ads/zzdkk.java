package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdkk extends AdMetadataListener {
    private final /* synthetic */ zzxz zzgzs;
    private final /* synthetic */ zzdkl zzgzt;

    zzdkk(zzdkl zzdkl, zzxz zzxz) {
        this.zzgzt = zzdkl;
        this.zzgzs = zzxz;
    }

    public final void onAdMetadataChanged() {
        if (this.zzgzt.zzgzw != null) {
            try {
                this.zzgzs.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
