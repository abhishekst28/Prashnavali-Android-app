package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzrs implements Comparator<zzry> {
    zzrs(zzrp zzrp) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzry zzry = (zzry) obj;
        zzry zzry2 = (zzry) obj2;
        int i = zzry.zzbtv - zzry2.zzbtv;
        return i != 0 ? i : (int) (zzry.value - zzry2.value);
    }
}
