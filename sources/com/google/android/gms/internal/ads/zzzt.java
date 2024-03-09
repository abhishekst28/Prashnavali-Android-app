package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzzt extends zzyd {
    private final OnPaidEventListener zzckr;

    public zzzt(OnPaidEventListener onPaidEventListener) {
        this.zzckr = onPaidEventListener;
    }

    public final void zza(zzvl zzvl) {
        if (this.zzckr != null) {
            this.zzckr.onPaidEvent(AdValue.zza(zzvl.zzadb, zzvl.zzadc, zzvl.zzadd));
        }
    }
}
