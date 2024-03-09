package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzces implements zzbtm {
    private final zzccv zzfvt;
    private final zzccz zzfwz;

    public zzces(zzccv zzccv, zzccz zzccz) {
        this.zzfvt = zzccv;
        this.zzfwz = zzccz;
    }

    public final void onAdImpression() {
        if (this.zzfvt.zzalu() != null) {
            zzbfq zzalt = this.zzfvt.zzalt();
            zzbfq zzals = this.zzfvt.zzals();
            if (zzalt == null) {
                if (zzals != null) {
                    zzalt = zzals;
                } else {
                    zzalt = null;
                }
            }
            if (this.zzfwz.zzalj() && zzalt != null) {
                zzalt.zza("onSdkImpression", new ArrayMap());
            }
        }
    }
}
