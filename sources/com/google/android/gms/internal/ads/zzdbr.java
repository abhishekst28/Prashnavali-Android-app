package com.google.android.gms.internal.ads;

import android.location.Location;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdbr implements zzdsl {
    private final zzdbp zzgtt;

    zzdbr(zzdbp zzdbp) {
        this.zzgtt = zzdbp;
    }

    public final Object apply(Object obj) {
        zzdbp zzdbp = this.zzgtt;
        Location location = (Location) obj;
        if (location != null) {
            return location;
        }
        return zzdbp.zzfqn.zzhbu.zznb;
    }
}
