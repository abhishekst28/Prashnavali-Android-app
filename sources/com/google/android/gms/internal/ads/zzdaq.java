package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdaq implements zzdek<Bundle> {
    private final boolean zzgtc = false;
    private final boolean zzgtd = false;
    private final boolean zzgte;

    public zzdaq(boolean z, boolean z2, boolean z3) {
        this.zzgte = z3;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("c_pcbg", this.zzgtc);
        bundle.putBoolean("c_phbg", this.zzgtd);
        bundle.putBoolean("ar_lr", this.zzgte);
    }
}
