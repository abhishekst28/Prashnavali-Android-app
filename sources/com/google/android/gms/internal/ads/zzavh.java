package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzavh extends zzauj {
    private final String type;
    private final int zzdva;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzavh(zzaue zzaue) {
        this(zzaue != null ? zzaue.type : "", zzaue != null ? zzaue.zzdva : 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzavh(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzavh(String str, int i) {
        this.type = str;
        this.zzdva = i;
    }

    public final String getType() throws RemoteException {
        return this.type;
    }

    public final int getAmount() throws RemoteException {
        return this.zzdva;
    }
}
