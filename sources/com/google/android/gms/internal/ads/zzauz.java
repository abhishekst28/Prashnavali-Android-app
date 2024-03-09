package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzauz implements RewardItem {
    private final zzaug zzdvj;

    public zzauz(zzaug zzaug) {
        this.zzdvj = zzaug;
    }

    public final String getType() {
        zzaug zzaug = this.zzdvj;
        if (zzaug == null) {
            return null;
        }
        try {
            return zzaug.getType();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        zzaug zzaug = this.zzdvj;
        if (zzaug == null) {
            return 0;
        }
        try {
            return zzaug.getAmount();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
