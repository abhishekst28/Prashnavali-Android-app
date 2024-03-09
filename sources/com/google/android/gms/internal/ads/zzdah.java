package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdah implements zzdek<Bundle> {
    private final zzvm zzgsx;

    public zzdah(zzvm zzvm) {
        this.zzgsx = zzvm;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzvm zzvm = this.zzgsx;
        if (zzvm == null) {
            return;
        }
        if (zzvm.orientation == 1) {
            bundle.putString("avo", "p");
        } else if (this.zzgsx.orientation == 2) {
            bundle.putString("avo", "l");
        }
    }
}
