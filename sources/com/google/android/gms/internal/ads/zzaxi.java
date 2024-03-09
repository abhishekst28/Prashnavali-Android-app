package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaxi {
    private long zzdxm = -1;
    private long zzdxn = -1;
    private final /* synthetic */ zzaxj zzdxo;

    public zzaxi(zzaxj zzaxj) {
        this.zzdxo = zzaxj;
    }

    public final long zzvw() {
        return this.zzdxn;
    }

    public final void zzvx() {
        this.zzdxn = this.zzdxo.zzbpw.elapsedRealtime();
    }

    public final void zzvy() {
        this.zzdxm = this.zzdxo.zzbpw.elapsedRealtime();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzdxm);
        bundle.putLong("tclose", this.zzdxn);
        return bundle;
    }
}
