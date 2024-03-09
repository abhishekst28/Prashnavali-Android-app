package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzddr implements zzdut {
    private final String zzdft;
    private final zzddp zzgul;
    private final List zzgun;
    private final Bundle zzguo;

    zzddr(zzddp zzddp, String str, List list, Bundle bundle) {
        this.zzgul = zzddp;
        this.zzdft = str;
        this.zzgun = list;
        this.zzguo = bundle;
    }

    public final zzdvt zzard() {
        return this.zzgul.zza(this.zzdft, this.zzgun, this.zzguo);
    }
}
