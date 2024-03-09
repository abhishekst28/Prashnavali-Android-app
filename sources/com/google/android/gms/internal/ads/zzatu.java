package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzatu implements RewardItem {
    private final zzatj zzdvb;

    public zzatu(zzatj zzatj) {
        this.zzdvb = zzatj;
    }

    public final String getType() {
        zzatj zzatj = this.zzdvb;
        if (zzatj == null) {
            return null;
        }
        try {
            return zzatj.getType();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        zzatj zzatj = this.zzdvb;
        if (zzatj == null) {
            return 0;
        }
        try {
            return zzatj.getAmount();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
