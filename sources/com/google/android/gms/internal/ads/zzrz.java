package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzrz implements Comparator<zzrn> {
    public zzrz(zzsa zzsa) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzrn zzrn = (zzrn) obj;
        zzrn zzrn2 = (zzrn) obj2;
        if (zzrn.zzmm() < zzrn2.zzmm()) {
            return -1;
        }
        if (zzrn.zzmm() > zzrn2.zzmm()) {
            return 1;
        }
        if (zzrn.zzml() < zzrn2.zzml()) {
            return -1;
        }
        if (zzrn.zzml() > zzrn2.zzml()) {
            return 1;
        }
        float zzmo = (zzrn.zzmo() - zzrn.zzmm()) * (zzrn.zzmn() - zzrn.zzml());
        float zzmo2 = (zzrn2.zzmo() - zzrn2.zzmm()) * (zzrn2.zzmn() - zzrn2.zzml());
        if (zzmo > zzmo2) {
            return -1;
        }
        if (zzmo < zzmo2) {
            return 1;
        }
        return 0;
    }
}
