package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbtl extends zzbxe<zzbtm> {
    private boolean zzfsw = false;

    public zzbtl(Set<zzbys<zzbtm>> set) {
        super(set);
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfsw) {
            zza(zzbtk.zzfst);
            this.zzfsw = true;
        }
    }
}
